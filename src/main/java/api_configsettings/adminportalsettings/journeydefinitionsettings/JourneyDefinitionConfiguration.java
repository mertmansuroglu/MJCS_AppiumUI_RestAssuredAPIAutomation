package api_configsettings.adminportalsettings.journeydefinitionsettings;

import api_configsettings.pojoclasses.JourneyDefinitionItem;
import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import com.google.gson.Gson;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class JourneyDefinitionConfiguration extends AuthorizationHandler {


//         @Test
//    public void getjourneyDefinitionID(){
//
//           DeleteJourneyDefinition("ali");
//    }

    //burayi josha sor !!!neden print disinda birsey yazamiyoruz!!!!!
//once response geliyormu gelmiyormu ona bak !!!
    public static List<JourneyDefinitionItem> getAllJourneyDefinitionItems() {
        ApiResources resourceAPI = ApiResources.valueOf("GetAllJourneyDefinition");
        try {
            Objects.requireNonNull(httpRequest()).queryParam("ChannelType", "Mobile");
            return Arrays.asList(new Gson().fromJson(Objects.requireNonNull(httpRequest()).get(resourceAPI.getResource()).getBody().asString(), JourneyDefinitionItem[].class));
        } catch (Exception e) {
            Assert.fail("Error when attempting to collect Journey definition items: " + e.getMessage());
            return new ArrayList<>();
        }

    }

    public static JourneyDefinitionItem getSpecificJourneyDefinitionItem(String journeyDefItemName) {
        List<JourneyDefinitionItem> journeyDefItems = getAllJourneyDefinitionItems();
        try {
            for (JourneyDefinitionItem journeyDefItem : journeyDefItems) {
                if (journeyDefItem.getName().equalsIgnoreCase(journeyDefItemName)) {
                    return journeyDefItem;
                }
            }
            throw new NoSuchFieldException("Journey Definition item  with key \"" + journeyDefItemName + "\" does not exist in current list of Configuration items");
        } catch (Exception e) {
            Assert.fail("Error when attempting to collect Journey Definition item \"" + journeyDefItemName + "\": " + e.getMessage());
            return new JourneyDefinitionItem();
        }
    }
}




