package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import api_configsettings.utils.PayloadDataBuild;
import com.google.gson.Gson;

import java.util.Objects;

public class ExpiryCheckConfiguration extends AuthorizationHandler {
//    String journeyId,String key,String Value,String dataType,String DefaultValue,

    public static void expiryCheckConfiguration(String value) {
        PayloadDataBuild data = new PayloadDataBuild();
        ApiResources resourceAPI = ApiResources.valueOf("UpdateConfiguration");
        Gson gson = new Gson();
        Objects.requireNonNull(httpRequestWithCSRFToken()).body(gson.toJson(data.expiryCheckConfigPayload(value))).when().post(resourceAPI.getResource()).then().spec(httpresponse());
        GeneralConfiguration.verifyConfigurationItem(value, "ExpiryCheckEnabled");
    }
}
