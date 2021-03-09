package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import api_configsettings.utils.PayloadDataBuild;
import com.google.gson.Gson;

import java.util.Objects;

public class FrontBackCrossCheckConfiguration extends AuthorizationHandler {
//    String journeyId,String key,String Value,String dataType,String DefaultValue,


    public void idDocumentDoubleSideCrossCheck(String value) {
        PayloadDataBuild data = new PayloadDataBuild();
        ApiResources resourceAPI = ApiResources.valueOf("UpdateConfiguration");
        Gson gson = new Gson();
        Objects.requireNonNull(httpRequestWithCSRFToken()).body(gson.toJson(data.idDocumentDoubleSideCrossCheckPayload(value))).when().post(resourceAPI.getResource()).then().spec(httpresponse());
        GeneralConfiguration.verifyConfigurationItem(value, "IDDocumentDoubleSideCrossCheck");
    }
}
