package steps.settingspage_steps.journeydefinition_step;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.SettingsPage;

import java.util.concurrent.TimeUnit;

public class JourneyDefinitionSettings_Tests extends Base {
    @When("I click Select Journey definition button")
    public void iClickSelectJourneyDefinitionButton() {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.SelectJourneyDefinition.isDisplayed());
        Utilities.singleTappingFunction(sp.SelectJourneyDefinition);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Then("I see the {string} journey definition on the list")
    public void iSeeTheAddedJourneyDefinitionOnTheList(String journeyDefName) throws Exception {
        Utilities ut = new Utilities(driver);
        ut.WaitUntilElementDisplay(ut.ListedJourneyDefinitions(journeyDefName));
        ut.ListedJourneyDefinitions(journeyDefName).click();

    }


//      try
//    {
//        Assert.assertSame("MertMJCS",ut.ListedJourneys().);
//        sp.ListedJourneys.click();
//    }
//        catch (Exception e)
//    {
//        String err = e.toString();
//    }


}
