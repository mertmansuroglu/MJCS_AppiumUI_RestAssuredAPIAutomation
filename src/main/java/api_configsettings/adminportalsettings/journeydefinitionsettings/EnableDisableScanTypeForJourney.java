package api_configsettings.adminportalsettings.journeydefinitionsettings;


import api_configsettings.pojoclasses.JourneyDefinitionItem;
import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.Objects;

public class EnableDisableScanTypeForJourney extends AuthorizationHandler {

    public static void enableOrDisableScanTypeForJourney(String journeyDefItemName, int entryType, String isEnabled) {
        JourneyDefinitionItem journeyDefinitionType = JourneyDefinitionConfiguration.getSpecificJourneyDefinitionItem(journeyDefItemName);
        String journeyDefinitionId = journeyDefinitionType.getJourneyDefinitionId();
        ApiResources resourceAPI = ApiResources.valueOf("AddUpdateJourneyDefinition");
        try {
            Objects.requireNonNull(httpRequest()).contentType(ContentType.URLENC).queryParam("journeyDefinitionId", journeyDefinitionId).queryParam("entryType", entryType).
                    queryParam("isEnabled", isEnabled).
                    when().post(resourceAPI.getResource()).then().spec(httpresponse());
        } catch (Exception e) {
            Assert.fail("Error when attempting to Enable/Disable journey definition named as" + journeyDefItemName + ": " + e.getMessage());
        }

    }

}
