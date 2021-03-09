package steps.livenesspage_steps;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.LivenessFragmentPage;

public class LivenessPage_Tests extends Base {

    @When("I check if Start liveness settings button is displayed")
    public void iCheckIfStartLivenessSettingsButtonIsDisplayed() {
        LivenessFragmentPage lp = new LivenessFragmentPage(driver);
        try {
            lp.LivenessSettingsButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
    }
    @When("I check if Start liveness test button is displayed")
    public void iCheckIfStartLivenessTestButtonIsDisplayed() {
        LivenessFragmentPage lp = new LivenessFragmentPage(driver);
        try {
            lp.StartLivenessTest.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
    }


    @Then("I click liveness settings button")
    public void iClickLivenessSettingsButton() throws Exception {
        LivenessFragmentPage lp = new LivenessFragmentPage(driver);
        Assert.assertTrue(lp.LivenessSettingsButton.isDisplayed());
        Utilities.singleTappingFunction(lp.LivenessSettingsButton);

    }
    @Then("I click start liveness test button")
    public void iClickStartLivenessTestButton() throws Exception {
        LivenessFragmentPage lp = new LivenessFragmentPage(driver);
        Assert.assertTrue(lp.StartLivenessTest.isDisplayed());
        Utilities.singleTappingFunction(lp.StartLivenessTest);
    }





}

