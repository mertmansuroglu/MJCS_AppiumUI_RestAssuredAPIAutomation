package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.pojoclasses.ConfigurationItem;
import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import java.util.Objects;

import static api_configsettings.utils.PayloadDataBuild.payloadAfterAddingBacksideValue;

public class DoublesideDocumentConfiguration extends AuthorizationHandler {
    public static void main(String[] args) {

        addNewDoubleSidedDocumentType("*", "GBR", "False");
    }

    // * This method is used to send a POST request to the Administration portal in order to add a new double sided
// * document to the BacksideSettings section, the request is then checked to ensure a 200 response has been returned
// * to confirm the request was successful
    public static void addNewDoubleSidedDocumentType(String docType, String country, String ignoreResult) {
        ApiResources resourceAPI = ApiResources.valueOf("UpdateConfiguration");
        Gson gson = new Gson();
        ConfigurationItem backSideSettings = GeneralConfiguration.getSpecificAdminPortalItem("BacksideSettings");
        String backSideDocumentsValue = getUpdatedBackSideValueWithNewDocument(docType, country, ignoreResult);
        if (!backSideSettings.getValue().contains(("\\\"DocumentType\\\":\\\"" + docType + "\\\",\\\"CountryCode\\\":\\\"" + country + "\\\""))) {
            Objects.requireNonNull(httpRequestWithCSRFToken()).body(gson.toJson(payloadAfterAddingBacksideValue(backSideSettings, backSideDocumentsValue))).when().post(resourceAPI.getResource()).then().spec(httpresponse());
        }
        assert backSideDocumentsValue != null;
        Assert.assertTrue(GeneralConfiguration.getSpecificAdminPortalItem("BacksideSettings").getValue().contains(backSideDocumentsValue));
    }

    //    * This method is used to construct the payload for a Backside Document change request, as this is a string value in
//     * JSON format the values are constructed as a JSONObject and then converted to string value when returned
//* This method is used to create an updated value string for BacksideSettings including a new document with the supplied parameters
    public static String getUpdatedBackSideValueWithNewDocument(String docType, String country, String ignoreResult) {
        try {
            JSONArray backSideDocuments = getArrayOfBackSideDocumentValue();
            JSONObject backSideDoc = new JSONObject();
            backSideDoc.put("DocumentType", docType);
            backSideDoc.put("CountryCode", country);
            backSideDoc.put("IgnoreScanResult", ignoreResult);
            backSideDocuments.put(backSideDoc);
            return backSideDocuments.toString();
        } catch (Exception e) {
            Assert.fail("Error occurred when attempting to convert the backside document values to a string: " + e.getMessage());
            return null;
        }
    }

    //This method is used to collect the documents defined to be double sided, this is done by collecting the
    //* BacksideSettings configuration item and extracting the value parameter
    public static JSONArray getArrayOfBackSideDocumentValue() {
        String backSideDocuments = GeneralConfiguration.getSpecificAdminPortalItem("BacksideSettings").getValue();
        try {
            return new JSONArray(backSideDocuments);
        } catch (Exception e) {
            Assert.fail("Error when converting backside documents from string to an JSON Array: " + e.getMessage());
            return new JSONArray();
        }
    }
}
