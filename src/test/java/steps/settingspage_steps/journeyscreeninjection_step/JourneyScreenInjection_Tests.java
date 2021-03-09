package steps.settingspage_steps.journeyscreeninjection_step;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.CustomerJourneyPage;

public class JourneyScreenInjection_Tests extends Base {


    @Then("I should see that Address screen injection appears")
    public void iShouldSeeThatAddressScreenInjectionAppears() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities ut = new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.ScreenInjectionText);
        Assert.assertTrue(cp.ScreenInjectionText.getText().contains("BEFORE ADDRESS DOCUMENT"));

    }

    @Then("I should see that Selfie screen injection appears")
    public void iShouldSeeThatSelfieScreenInjectionAppears() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities ut = new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.ScreenInjectionText);
        Assert.assertTrue(cp.ScreenInjectionText.getText().contains("BEFORE SELFIE"));

    }

    @Then("I should see that Liveness screen injection appears")
    public void iShouldSeeThatLivenessScreenInjectionAppears() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities ut = new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.ScreenInjectionText);
        Assert.assertTrue(cp.ScreenInjectionText.getText().contains("BEFORE LIVENESS"));

    }

    @Then("I should see that Frontside screen injection appears")
    public void iShouldSeeThatFrontsideScreenInjectionAppears() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities ut = new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.ScreenInjectionText);
        Assert.assertTrue(cp.ScreenInjectionText.getText().contains("BEFORE FRONT SIDE"));

    }

    @Then("I should see that Loading screen injection appears")
    public void iShouldSeeThatLoadingScreenInjectionAppears() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Assert.assertTrue(cp.ScreenInjectionTextLoading.getText().contains("UPLOADING"));

    }

    @Then("I should see that Finish button appears on the screen injection")
    public void iShouldSeeThatFinishScreenInjectionAppears() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Assert.assertTrue(cp.ScreenInjectionFinish.getText().contains("FINISH"));

    }

    @Then("I tap to finish button on the screen injection")
    public void iShouldTapFinishInjectionAppears() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities.singleTappingFunction(cp.ScreenInjectionFinish);

    }
}


