package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.pojoclasses.ConfigurationItem;
import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import com.google.gson.Gson;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class GeneralConfiguration extends AuthorizationHandler {

    public static void main(String[] args) {

        //addNewDoubleSidedDocumentType(tokens);
    }

    //burayida josha sor!!!
    //here aim is to create the arraylist composed of configuration item which is also array , we have benefit from gson library(deserializing)
//in test section we have used created list object from the list method
    public static List<ConfigurationItem> getAllConfigurationItems() {
        ApiResources resourceAPI = ApiResources.valueOf("GetAllConfiguration");
        try {
            requireNonNull(httpRequestWithCSRFToken()).queryParam("ChannelType", "Mobile");
            return Arrays.asList(new Gson().fromJson(requireNonNull(httpRequestWithCSRFToken()).get(resourceAPI.getResource()).getBody().asString(), ConfigurationItem[].class));
        } catch (Exception e) {
            Assert.fail("Error when attempting to collect Journey definition items: " + e.getMessage());
            return new ArrayList<>();
        }

    }


    //   This method is used to get the specified Configuration settings from the Administration portal
    public static ConfigurationItem getSpecificAdminPortalItem(String configItemName) {
        List<ConfigurationItem> configItems = getAllConfigurationItems();
        try {
            for (ConfigurationItem configItem : configItems) {
                if (configItem.getKey().equalsIgnoreCase(configItemName)) {
                    return configItem;
                }
            }
            throw new NoSuchFieldException("ConfigurationItem with key \"" + configItemName + "\" does not exist in current list of Configuration items");
        } catch (Exception e) {
            Assert.fail("Error when attempting to collect Configuration item \"" + configItemName + "\": " + e.getMessage());
            return new ConfigurationItem();
        }
    }

    //this method is to verify configuration item
    public static void verifyConfigurationItem(String value, String configurationItemName) {
        String configItemValue = getSpecificAdminPortalItem(configurationItemName).getValue();
        Assert.assertEquals(value, configItemValue);
    }
}
//here we have did querry by using for loop in array

//List<String> list = ....load up with stuff
//for (String string : list) {
//  System.out.println(string);
//this for type is useful for collections

//for (int i=0; i<list.size();i++) {
//  System.out.println(list.get(i));
//}

//bu featuredan cagrilacak!!!!!!!! specific olan parametreler