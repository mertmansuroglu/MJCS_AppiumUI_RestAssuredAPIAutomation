package steps.customerjourneypage_steps;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CustomerJourneyPage;
import pageobjects.DocumentScannerPage;
import pageobjects.SettingsPage;
import steps.mainpage_steps.MainPage_Tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static steps.documentscannerpage_steps.DocumentScannerPage_Test.iClickFinishEditingButtonOnEditScreen;
import static steps.documentscannerpage_steps.DocumentScannerPage_Test.iShouldSeeCapturedDocumentEditScreen;


public class CustomerJourneyPage_Test extends Base {


    @Then("I check if Start Customer Journey button is displayed")
    public void iCheckIfStartCustomerJourneyButtonIsDisplayed() {
        CustomerJourneyPage cp=new CustomerJourneyPage(driver);
        try {
            cp.StartCustomerJourneyButton.isDisplayed();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }

        Assert.assertTrue(cp.StartCustomerJourneyButton.isDisplayed());

    }

    @Then("I click capture button of customer journey on the capture screen")
    public static void i_click_capture_buttonOfcustomer_on_the_capture_screen() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities ut = new Utilities(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            ut.WaitUntilElementDisplay(cp.CaptureButton);
            Utilities.singleTappingFunction(cp.CaptureButton);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @When("I click start customer journey button")
    public void iClickStartCustomerJourneyButton() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Assert.assertTrue(cp.StartCustomerJourneyButton.isDisplayed());
        cp.StartCustomerJourneyButton.click();

    }

    @Then("I wait until frontside smartcapture is completed")
    public void iWaitUntilSmartcaptureIsCompleted() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        new WebDriverWait(driver, 25).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                until(ExpectedConditions.visibilityOf(cp.JourneyIdExtract));

    }

    @When("I see the result page")
    public static String iSeeTheResultPage() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        System.out.println(cp.JourneyIdExtract.getText());
        return cp.JourneyIdExtract.getText();
    }

    @Then("I should see the High level Result")
    public static String iShouldSeeTheHighLevelResult() {
        Assert.assertTrue(driver.findElementByAndroidUIAutomator("text(\"High Level Result\")").isDisplayed());
        CustomerJourneyPage cp=new CustomerJourneyPage(driver);
        System.out.println(cp.HLRExtract.getText());
        return cp.HLRExtract.getText();

    }

    @And("HLR in result page should be {string}")
    public static String hlrInResultPageShouldBe(String HLR) {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        String actualHLR = cp.HLRExtract.getText();
        Assert.assertTrue(HLR.equalsIgnoreCase(actualHLR));
        return actualHLR;
    }

    @Then("I wait until  manual capture is completed")
    public void iWaitUntilManualcaptureIsCompleted() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        new WebDriverWait(driver, 25).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                until(ExpectedConditions.visibilityOf(cp.JourneyIdExtract));

    }

    @And("I should go back main screen")
    public void iShouldGoBackMainScreen() {
        Utilities.BackButton();
    }

    @Then("I should disable the dummy data")
    public void DisableTheDummyConfiguration() throws Exception {
        MainPage_Tests mp = new MainPage_Tests();
        SettingsPage settings = new SettingsPage(driver);
        mp.iClickSettingsButton();
        Utilities ut = new Utilities(driver);
        ut.scrollToText("Enable Manual Capture Dummy");
        if (settings.EnableSmartCaptureDummyButton.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(settings.EnableSmartCaptureDummyButton);
        }

    }
    @Then("I should see captured document edit screen on customer journey")
    public void i_should_see_captured_document_edit_screen() {
        // Write code here that turns the phrase above into concrete actions
        Utilities ut= new Utilities(driver);
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        ut.WaitUntilElementDisplay(documentscanner.FinishEditingButton);
        ut.checkIfElementIsVisible(documentscanner.FinishEditingButton);
    }
    @Then("I double click rotate right button on customer journey")
    public void i_double_click_rotate_right_button() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut= new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.RotateRight));
        Utilities.DoubleTappingFunction(documentscanner.RotateRight);
    }

    @Then("I double click rotate left button on customer journey")
    public void i_double_click_rotate_Left_button() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.RotateLeft));
        Utilities.DoubleTappingFunction(documentscanner.RotateLeft);

    }

    @Then("I should tap to focus on the screen for customer journey")
    public void i_should_tap_to_focus_on_the_screen() throws Exception {
        DocumentScannerPage sp = new DocumentScannerPage(driver);
        Utilities.singleTappingFunction(sp.FocusViewOnCapture);
        Thread.sleep(1000);
        Utilities.singleTappingFunction(sp.FocusViewOnCapture);
        Thread.sleep(1000);
        Utilities.singleTappingFunction(sp.FocusViewOnCapture);
    }


    @Then("I should see the capture screen of Customer Journey")
    public static void iShouldSeeTheCaptureScreenOfCustomerJourney() {
        driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities ut = new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.CaptureButton);

    }

    @Then("I click finish editing button on edit screen of customer journey")
    public void i_click_finish_editing_button_on_edit_screen() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities.singleTappingFunction(documentscanner.FinishEditingButton);
    }

    @Then("I should wait until triplescan process is finished")
    public void waitUntilTriplescanManualCapture() {
        for (int i = 0; i < 3; i++) {
            iShouldSeeTheCaptureScreenOfCustomerJourney();
            i_click_capture_buttonOfcustomer_on_the_capture_screen();
            iShouldSeeCapturedDocumentEditScreen();
            iClickFinishEditingButtonOnEditScreen();
        }
    }

    @Then("I should see that Address step appears")
    public void iShouldSeeThatAddressStepAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.Infopopup);
        Assert.assertTrue(cp.Infopopup.getText().contains("address document"));
    }



}

