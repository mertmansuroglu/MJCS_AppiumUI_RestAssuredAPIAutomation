package steps.api_calls;

import api_configsettings.adminportalsettings.configurationsettings.AcceptableDocumentConfiguration;
import api_configsettings.adminportalsettings.journeydefinitionsettings.AddDeleteJourneyDefinition;
import api_configsettings.pojoclasses.getjourneydetails.JourneyDetails;
import api_configsettings.utils.AuthorizationHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.BeforeClass;

import java.io.FileNotFoundException;

import static api_configsettings.adminportalsettings.configurationsettings.ExpiryCheckConfiguration.expiryCheckConfiguration;
import static api_configsettings.adminportalsettings.configurationsettings.JourneyDetailCheck.getJourneyDetailsWithJourneyId;
import static api_configsettings.adminportalsettings.configurationsettings.TripleScanConfiguration.tripleScanConfiguration;
import static api_configsettings.adminportalsettings.journeydefinitionsettings.EnableDisableScanTypeForJourney.enableOrDisableScanTypeForJourney;
import static steps.customerjourneypage_steps.CustomerJourneyPage_Test.iSeeTheResultPage;
import static steps.customerjourneypage_steps.CustomerJourneyPage_Test.iShouldSeeTheHighLevelResult;


public class ApiCalls extends AuthorizationHandler {

    String journeyDefName = "MJCS Journey Definition";

    @Given("I add new journey definition named as {string} from api side with only front")
    public void iAddNewJourneyDefinitionNamedAsFromApiSide(String name) throws FileNotFoundException {
        AddDeleteJourneyDefinition.addJourneyDefinition(name);
    }

    @Given("I add new acceptable document \"([^\"]*)\" , \"([^\"]*)\"  \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" with Api")
    public void iAddNewAcceptableDocumentSomethingSomethingSomethingSomethingsomethingWithApi(String countrycode, String doctype, String subtype, String documentissue, String isicao) throws FileNotFoundException {
        AcceptableDocumentConfiguration.addNewDocumentType(countrycode, doctype, subtype, documentissue, isicao);
    }


    @BeforeClass
    public static void setUp() {
        try {
            RestAssured.port = 0;
            RestAssured.useRelaxedHTTPSValidation();
            RestAssured.config().getSSLConfig().with().keyStore("classpath:keystore.p12", "password");
        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Given("I enable expiry check from admin settings")
    public void iEnableExpiryCheckFromAdminSettings() {
        expiryCheckConfiguration("true");
    }

    @And("HLR result should be same in investigation studio")
    public void hlrResultShouldBeSameInInvestigationStudio() {
        String journeyId = iSeeTheResultPage();
        String hlrOnMjcs = iShouldSeeTheHighLevelResult();
        JourneyDetails journeyDetails = getJourneyDetailsWithJourneyId(journeyId);
        Assert.assertEquals(hlrOnMjcs, journeyDetails.getHighLevelResult());
    }

    @And("I enable only front-back configuration from Api")
    public void iOnlyEnableOnlyFrontBackConfigurationFromApi() {

         //enable back
        enableOrDisableScanTypeForJourney(journeyDefName, 2, "true");
                //disable a4
        enableOrDisableScanTypeForJourney(journeyDefName, 4, "false");
                //disable Liveness
        enableOrDisableScanTypeForJourney(journeyDefName, 6, "false");
                //disable Selfie
        enableOrDisableScanTypeForJourney(journeyDefName, 3, "false");
    }
    @And("I enable only front configuration from Api")
    public void iOnlyEnableOnlyFrontConfigurationFromApi() {
        //disable a4
        enableOrDisableScanTypeForJourney(journeyDefName, 4, "false");
        //disable Liveness
        enableOrDisableScanTypeForJourney(journeyDefName, 6, "false");
        //disable Selfie
        enableOrDisableScanTypeForJourney(journeyDefName, 3, "false");
        //disable backside
        enableOrDisableScanTypeForJourney(journeyDefName, 2, "false");
    }

    @And("I enable only A4 configuration from Api")
    public void iOnlyEnableOnlyA4ConfigurationFromApi() {
        //disable backside
        enableOrDisableScanTypeForJourney(journeyDefName, 2, "false");
        //disable Liveness
        enableOrDisableScanTypeForJourney(journeyDefName, 6, "false");
        //disable Selfie
        enableOrDisableScanTypeForJourney(journeyDefName, 3, "false");
        //Enable A4
        enableOrDisableScanTypeForJourney(journeyDefName, 4, "true");
    }
    @And("I enable only selfie configuration from Api")
    public void iOnlyEnableOnlySELFIEConfigurationFromApi() {
        //disable Selfie
        enableOrDisableScanTypeForJourney(journeyDefName, 3, "true");
        //disable backside
        enableOrDisableScanTypeForJourney(journeyDefName, 2, "false");
        //disable Liveness
        enableOrDisableScanTypeForJourney(journeyDefName, 6, "false");
        //disable A4
        enableOrDisableScanTypeForJourney(journeyDefName, 4, "false");
    }
    @And("I enable only Liveness configuration from Api")
    public void iOnlyEnableOnlyLivenesConfigurationFromApi() {
        //enable Liveness
        enableOrDisableScanTypeForJourney(journeyDefName, 6, "true");
        //disable Selfie
        enableOrDisableScanTypeForJourney(journeyDefName, 3, "false");
        //disable backside
        enableOrDisableScanTypeForJourney(journeyDefName, 2, "false");
        //Disable A4
        enableOrDisableScanTypeForJourney(journeyDefName, 4, "false");
    }

    @Given("I configure triplescan from admin settings as {string}")
    public void iConfigureTriplescanFromAdminSettings(String value) {
        tripleScanConfiguration(value);
    }

}
