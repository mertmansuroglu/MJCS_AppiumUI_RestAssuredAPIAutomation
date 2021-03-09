package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.utils.ApiResources;
import api_configsettings.utils.AuthorizationHandler;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;
import java.util.Objects;

public class AdditionalData extends AuthorizationHandler {

    public static void getJourneyDetailsWithJourneyId(String journeyId, String checkItem) {
//    String journeyId=  iSeeTheResultPage();
//    String HlrOnMjcs= iShouldSeeTheHighLevelResult();
        ApiResources resourceAPI = ApiResources.valueOf("GetJourney");
        String value;
        Response response = Objects.requireNonNull(httpRequest()).queryParam("JourneyID", journeyId).when().get(resourceAPI.getResource()).then().spec(httpresponse()).extract().response();
        JsonPath js = new JsonPath(response.toString());
        List<Object> result = js.getList("AdditionalData");

        JSONArray jaray = new JSONArray(result);
        for (int i = 0; i < jaray.length(); i++) {
            JSONObject jsonObject = jaray.getJSONObject(i);
            String a = jsonObject.getString("Name");
            if (a.equalsIgnoreCase(checkItem)) {
                value = jsonObject.getString("Value");

                System.out.println(value);

                break;
            }
        }
    }

    public static void main(String[] args){
    String a="410b4037-f991-488e-b65b-ff0afdf15fae";
        String checkitem="Platform";
        getJourneyDetailsWithJourneyId(a, checkitem);

    }
}
