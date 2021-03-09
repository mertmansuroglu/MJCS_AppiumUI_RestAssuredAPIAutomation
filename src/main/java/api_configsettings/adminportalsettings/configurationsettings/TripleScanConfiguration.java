package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import api_configsettings.utils.PayloadDataBuild;
import com.google.gson.Gson;

import java.util.Objects;

public class TripleScanConfiguration extends AuthorizationHandler {
//    String journeyId,String key,String Value,String dataType,String DefaultValue,


    public static void tripleScanConfiguration(String value) {
        PayloadDataBuild data = new PayloadDataBuild();
        ApiResources resourceAPI = ApiResources.valueOf("UpdateConfiguration");
        Gson gson = new Gson();
        Objects.requireNonNull(httpRequestWithCSRFToken()).body(gson.toJson(data.tripleScanConfigurationPayload(value))).when().post(resourceAPI.getResource()).then().spec(httpresponse());
//        GeneralConfiguration gconfig=new GeneralConfiguration();
//        String ConfigItemName= "TripleScanEnabled";
//        GeneralConfiguration.VerifyConfigurationItem(value,ConfigItemName);
    }


    public static void main(String[] args) {
        tripleScanConfiguration("false");
    }

}
