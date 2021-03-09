package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.utils.AuthorizationHandler;
import org.junit.Test;

public class A4CrossCheckConfiguration extends AuthorizationHandler {
//    String journeyId,String key,String Value,String dataType,String DefaultValue,


    //here we have called a4crosscheck payload and convert the object into json
    public void a4CrossCheck(String value) {
        GeneralConfiguration.verifyConfigurationItem(value, "PaperDocumentCrossCheck");
    }

    @Test
    public void deneme() {
        A4CrossCheckConfiguration a4 = new A4CrossCheckConfiguration();
        a4.a4CrossCheck("false");


    }
}