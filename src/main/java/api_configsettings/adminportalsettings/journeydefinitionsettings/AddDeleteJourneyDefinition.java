package api_configsettings.adminportalsettings.journeydefinitionsettings;

import api_configsettings.pojoclasses.JourneyDefinitionItem;
import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class AddDeleteJourneyDefinition  extends AuthorizationHandler {

    public static void addJourneyDefinition(String journeyDefItemName) {
        ApiResources addApi = ApiResources.valueOf("AddJourneyDefinition");
        ApiResources deleteApi = ApiResources.valueOf("DeleteJourneyDefinition");
        ApiResources addJourneyEntry = ApiResources.valueOf("addJourneyEntry");
        String newJourneyDefID = UUID.randomUUID().toString();
        List<JourneyDefinitionItem> journeyDefItems = JourneyDefinitionConfiguration.getAllJourneyDefinitionItems();
        for (JourneyDefinitionItem item : journeyDefItems) {
            if (item.getName().equalsIgnoreCase(journeyDefItemName)) {
                Objects.requireNonNull(httpRequest()).contentType(ContentType.URLENC).queryParam("JourneyDefinitionId", item.getJourneyDefinitionId()).
                        when().post(deleteApi.getResource()).then().spec(httpresponse());
            }
        }
        Objects.requireNonNull(httpRequest()).contentType(ContentType.URLENC).queryParam("ChannelType", "Mobile").
                body("capturingmedia=4&channeltype=3&journeydefinitionid=" + newJourneyDefID + "&name=" + journeyDefItemName + "&isactive=true").
                when().post(addApi.getResource()).then().spec(httpresponse());

        Objects.requireNonNull(httpRequestWithCSRFToken()).contentType(ContentType.URLENC).queryParam("journeyDefinitionId", newJourneyDefID).
                body("Type=1&Order=0&name=&isactive=false").
                when().post(addJourneyEntry.getResource()).then().spec(httpresponse());

    }


    public static void deleteJourneyDefinition(String journeyDefItemName) {
        ApiResources resourceAPI = ApiResources.valueOf(" DeleteJourneyDefinition");
        List<JourneyDefinitionItem> journeyDefItems = JourneyDefinitionConfiguration.getAllJourneyDefinitionItems();
        for (JourneyDefinitionItem item : journeyDefItems) {
            if (item.getName().equalsIgnoreCase(journeyDefItemName)) {
                try {
                    Objects.requireNonNull(httpRequest()).contentType(ContentType.URLENC).queryParam("JourneyDefinitionId", item.getJourneyDefinitionId()).
                            when().post(resourceAPI.getResource()).then().spec(httpresponse());
                } catch (Exception e) {
                    Assert.fail("Error when attempting to delete journey definition names as " + journeyDefItemName + e.getMessage());
                }
            }
}
    }
}