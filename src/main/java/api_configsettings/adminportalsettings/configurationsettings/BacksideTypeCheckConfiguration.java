package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import api_configsettings.utils.PayloadDataBuild;
import com.google.gson.Gson;

import java.util.Objects;

public class BacksideTypeCheckConfiguration extends AuthorizationHandler {
//    String journeyId,String key,String Value,String dataType,String DefaultValue,


    public static void backsideTypeCheckConfig(String value) {
        PayloadDataBuild data = new PayloadDataBuild();
        Gson gson = new Gson();
        ApiResources resourceAPI = ApiResources.valueOf("UpdateConfiguration");
        Objects.requireNonNull(httpRequestWithCSRFToken()).body(gson.toJson(data.backsideTypeCheckConfigPayload(value))).when().post(resourceAPI.getResource()).then().spec(httpresponse());
        GeneralConfiguration.verifyConfigurationItem(value, "BackSideTypeCheck");
    }
}