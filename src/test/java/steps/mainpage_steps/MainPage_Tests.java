package steps.mainpage_steps;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pageobjects.MainPage;
import pageobjects.SettingsPage;

import java.io.IOException;

public class MainPage_Tests extends Base {

    @Given("I clean appium server")
    public void iCleanAppiumServer() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    }

    @When("I open the application")
    public void iOpenTheApplication() throws IOException, InterruptedException {
        service = startServer();
        driver = capabilities("MjcsSampleApp");

    }


    @And("I check if liveness button is displayed")
    public void checkIfLivenessButtonIsDisplayed() {
        MainPage mp = new MainPage(driver);
        try {
            mp.LivenessFragmentSampleButton.isDisplayed();
        } catch (Exception e) {
            // System.out.println(e);
        }
    }
    @When("I check if Hotswap Sample button is displayed")
    public void iCheckIfHotswapSampleButtonIsDisplayed() {
        MainPage mp = new MainPage(driver);
        try {
            mp.HotSwapSampleButton.isDisplayed();
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }
    @When("I check if Customer Journey Sample button is displayed")
    public void iCheckIfCustomerJourneySampleButtonIsDisplayed() {
        MainPage mp = new MainPage(driver);
        try {
            mp.CustomerJourneySampleButton.isDisplayed();
        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }
    @Then("I check if MJCS Label is displayed")
    public void iCheckIfMJCSLabelIsDisplayed() {
        MainPage mp = new MainPage(driver);
        try {

            mp.MjcsSampleLabell.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("MJCS label Element Not found");
        }

    }

    @Then("I check if settings button is displayed")
    public static void iCheckIfSettingsButtonIsDisplayed() {
        MainPage mp = new MainPage(driver);
        try {
            mp.SettingsButton.isDisplayed();
        } catch (Exception e) {
            // System.out.println(e);

        }
    }
    @Then("I check if Document Scanner button is displayed")
    public void iCheckIfDocumentScannerButtonIsDisplayed() {
        MainPage mp = new MainPage(driver);
        try {
            mp.DocumentScannerSampleButton.isDisplayed();
        } catch (Exception e) {
            // System.out.println(e);

        }
    }

    @Then("I check if Manual Extraction button is displayed")
    public void checkIfManualExtractionButtonIsDisplayed() {
        MainPage mp = new MainPage(driver);
        try {
            mp.ManualExtractionSampleButton.isDisplayed();
        } catch (Exception e) {
            // System.out.println(e);

        }
    }

    @Then("I click Liveness Fragment Sample button")
    public void clickLivenessFragmentSampleButton() throws Exception {
        MainPage mp = new MainPage(driver);
        Utilities.singleTappingFunction(mp.LivenessFragmentSampleButton);
    }

    @Then("I click customer journey button")
    public void iClickCustomerJourneyButton() throws Exception {
        MainPage mp = new MainPage(driver);
        Utilities.singleTappingFunction(mp.CustomerJourneySampleButton);

    }
    @And("I click Hotswap Sample button")
    public void iClickHotswapSampleButton() throws Exception {
        MainPage mp = new MainPage(driver);

        if (mp.HotSwapSampleButton.isDisplayed()) {
            Utilities.singleTappingFunction(mp.HotSwapSampleButton);
        } else
            throw new Exception("element not found");
    }
    @And("I click Document Scanner Sample button")
    public void iClickDocumentScannerSampleButton() throws Exception {
        MainPage mp = new MainPage(driver);

        if (mp.DocumentScannerSampleButton.isDisplayed()) {
            Utilities.singleTappingFunction(mp.DocumentScannerSampleButton);
        } else
            throw new Exception("element not found");
    }
    @And("I click Manual Extraction button")
    public void clickManualExtractionButton() throws Exception {
        MainPage mp = new MainPage(driver);

        if (mp.ManualExtractionSampleButton.isDisplayed()) {
            Utilities.singleTappingFunction(mp.ManualExtractionSampleButton);
        } else
            throw new Exception("element not found");
    }
    @And("I click settings button")
    public void iClickSettingsButton() throws Exception {
        MainPage mp = new MainPage(driver);

        if (mp.SettingsButton.isDisplayed()) {
            Utilities.singleTappingFunction(mp.SettingsButton);
        } else
            throw new Exception("element not found");
    }

    @Then("I stop the server")
    public void iStopTheServer() {
        stopServer();
    }

    @Then("I check if Navigate Back Button is displayed")
    public void iCheckIfNavigateBackButtonIsDisplayed() {
        SettingsPage sp = new SettingsPage(driver);
        try {
            sp.SettingsNavigateBackButton.isDisplayed();
        } catch (Exception e) {
            // System.out.println(e);

        }
    }
    @And("I click Navigate Back button")
    public void iClickNavigateBackButton() throws Exception {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.SettingsNavigateBackButton.isDisplayed());
        Utilities.singleTappingFunction(sp.SettingsNavigateBackButton);

    }

}
