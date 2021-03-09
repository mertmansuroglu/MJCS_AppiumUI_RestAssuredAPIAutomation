package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.pojoclasses.ConfigurationItem;
import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import api_configsettings.utils.PayloadDataBuild;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import java.util.Objects;

public class AcceptableDocumentConfiguration extends AuthorizationHandler {

    public static void main(String[] args) {
        addNewDocumentType("USA", "*", "*", "null", "true");
    }

    // * This method is used to send a POST request to the Administration portal in order to add a new double sided
// * document to the BacksideSettings section, the request is then checked to ensure a 200 response has been returned
// * to confirm the request was successful

    public static void documentProofPolicyEnabled(String value) {
        PayloadDataBuild data = new PayloadDataBuild();
        Gson gson = new Gson();
        ApiResources resourceAPI = ApiResources.valueOf("UpdateConfiguration");
        Objects.requireNonNull(httpRequestWithCSRFToken()).body(gson.toJson(data.documentProofPolicyEnabledPayload(value))).when().post(resourceAPI.getResource()).then().spec(httpresponse());
        GeneralConfiguration.verifyConfigurationItem(value, "DocumentProofPolicyEnabled");

    }


    public static void addNewDocumentType(String countryCode, String docType, String subType, String documentIssue, String isIcao) {
        ApiResources resourceAPI = ApiResources.valueOf("UpdateConfiguration");
        ConfigurationItem documentProofPolicy = GeneralConfiguration.getSpecificAdminPortalItem("DocumentProofPolicy");
        String documentsValues = getUpdatedDocumentValue(countryCode, docType, subType, documentIssue, isIcao);
        if (!documentProofPolicy.getValue().contains(("\\\"CountryCode\\\":\\\"" + countryCode + "\\\",\\\"DocumentType\\\":\\\"" + docType + "\\\""))) {
            Objects.requireNonNull(httpRequestWithCSRFToken()).body(PayloadDataBuild.payloadAfterAddingDocumentValue(documentProofPolicy, documentsValues)).when().post(resourceAPI.getResource()).then().spec(httpresponse());
        }
        assert documentsValues != null;
        Assert.assertTrue(GeneralConfiguration.getSpecificAdminPortalItem("DocumentProofPolicy").getValue().contains(documentsValues));


    }

    //    * This method is used to construct the payload for a Backside Document change request, as this is a string value in
//     * JSON format the values are constructed as a JSONObject and then converted to string value when returned
    //* This method is used to create an updated value string for BacksideSettings including a new document with the supplied parameters
    public static String getUpdatedDocumentValue(String countryCode, String docType, String subType, String documentIssue, String isIcao) {
        try {
            JSONArray documentValueArray = getArrayOfDocumentProofValue();
            JSONObject documentValue = new JSONObject();
            documentValue.put("CountryCode", countryCode);
            documentValue.put("DocumentType", docType);
            documentValue.put("SubType", subType);
            documentValue.put("DocumentIssue", documentIssue);
            documentValue.put("IsIcao", isIcao);
            documentValueArray.put(documentValue);
            return documentValueArray.toString();
        } catch (Exception e) {
            Assert.fail("Error occurred when attempting to convert the backside document values to a string: " + e.getMessage());
            return null;
        }
    }

    //This method is used to collect the documents defined to be double sided, this is done by collecting the
    //* BacksideSettings configuration item and extracting the value parameter
    public static JSONArray getArrayOfDocumentProofValue() {
        String backSideDocuments = GeneralConfiguration.getSpecificAdminPortalItem("DocumentProofPolicy").getValue();
        try {
            return new JSONArray(backSideDocuments);
        } catch (Exception e) {
            Assert.fail("Error when converting backside documents from string to an JSON Array: " + e.getMessage());
            return new JSONArray();
        }
    }
}

