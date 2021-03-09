package api_configsettings.adminportalsettings.configurationsettings;

import api_configsettings.pojoclasses.getjourneydetails.JourneyDetails;
import api_configsettings.utils.ApiResources;
import com.google.gson.Gson;

import java.util.Objects;

import static api_configsettings.utils.AuthorizationHandler.httpRequestWithCSRFToken;

public class JourneyDetailCheck {

    public static JourneyDetails getJourneyDetailsWithJourneyId(String journeyId) {
        ApiResources resourceAPI = ApiResources.valueOf("GetJourney");
        Gson mGson = new Gson();
        return mGson.fromJson(Objects.requireNonNull(httpRequestWithCSRFToken()).queryParam("JourneyID", journeyId).get(resourceAPI.getResource()).getBody().prettyPrint(),
                JourneyDetails.class);
    }

}

//
//    public static void main(String[] args) throws FileNotFoundException {
//       String a="410b4037-f991-488e-b65b-ff0afdf15fae" ;
//       GetJourneyDetailsWithJourneyId(a);
//    }

//    JSONArray jsonArray = new JSONArray(journeydefdetaiils);
//        for (int i = 0; i < jsonArray.length(); i++) {
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//        String a=    jsonObject.getString("Name");
//          if(a.equalsIgnoreCase("MJCS Journey Definition")){
//                JourneydefId=jsonObject.getString("JourneyDefinitionId");
//
//              System.out.println(JourneydefId);
//              break;
//            }
//    }

// for (int i = 0; i <mObj1.getAdditionalData().size(); i++) {
//            if(mObj1.getHighLevelResultDetails().get(i).contains("DOCUMENTBACKSIDECHECK")){
//                System.out.println(mObj1.getHighLevelResultDetails().get(i));
//                break;