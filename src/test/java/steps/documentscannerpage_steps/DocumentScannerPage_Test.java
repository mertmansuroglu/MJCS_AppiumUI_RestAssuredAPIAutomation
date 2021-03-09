package steps.documentscannerpage_steps;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.DocumentScannerPage;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class DocumentScannerPage_Test extends Base {


    @When("I click finish editing button on edit screen")
    public static void iClickFinishEditingButtonOnEditScreen() {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities.singleTappingFunction(documentscanner.FinishEditingButton);

    }

    @Then("I click CAPTURE button")
    public void iClickCaptureButton() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        try {
            documentscanner.DocumentScanCaptureButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }

        Utilities.singleTappingFunction(documentscanner.DocumentScanCaptureButton);

    }

    @Then("I should see the capture screen")
    public void i_should_see_the_capture_screen() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Utilities ut = new Utilities(driver);
        ut.WaitUntilElementDisplay(ut.CaptureButton());


    }

    @Then("I click Upload ID Image button")
    public void iclickIfUploadIDImageButtonIsDisplayed() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        try {
            documentscanner.DocumentScanUploadIdButton.isDisplayed();
            ut.WaitUntilElementDisplay(documentscanner.DocumentScanUploadIdButton);
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(documentscanner.DocumentScanUploadIdButton.isDisplayed());
        Utilities.singleTappingFunction(documentscanner.DocumentScanUploadIdButton);
//        ut.WaitUntilElementDisplay(documentscanner.ResultPopup);

    }

    @When("I tap to flash button")
    public void i_tap_to_flash_button()  {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Assert.assertTrue(documentscanner.DocumentScanFlashButton.isDisplayed());
        documentscanner.DocumentScanFlashButton.click();
    }

    @Then("I should see the flash button as enabled")
    public void flash_button_should_be_enabled()  {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Assert.assertTrue(documentscanner.DocumentScanFlashButton.isEnabled());
    }

    @Then("I should see Enable Popup on capture screen")
    public void Popup_button_should_be_enabled()  {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.PopUpTest));
    }

    @Then("I should see switch facing camera button on capture screen")
    public void Switch_Facing_should_be_enabled() {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.SwitchFacingCamera));
    }

    @Then("I click capture button on the capture screen")
    public void i_click_capture_button_on_the_capture_screen() {
        Utilities ut = new Utilities(driver);
        try {
            Utilities.singleTappingFunction(ut.CaptureButton());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @When("I click switch facing camera button on capture screen")
    public void i_click_switch_camera_button() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        //BURAYA DONULECEK!!!!!!!!!!!!!!!!!!!!!!
        //DANE SORULACAK!!!!
        Assert.assertTrue(documentscanner.SwitchFacingCamera.isDisplayed());
        Utilities.singleTappingFunction(documentscanner.SwitchFacingCamera);


    }

//do while kullan
    @Then("I see pop-up test notification box on the screen")
    public void iSeePopUpTestNotificationBoxOnTheScreen() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        if(Utilities.LongTappingFunction(documentscanner.InfoOncaptureScreen)){
            Assert.assertTrue(documentscanner.PopUpTest.isDisplayed());
        }

    }

    @And("I should see info section on the document capture screen")
    public void iShouldSeeInfoSectionOnTheDocumentCaptureScreen() {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.InfoOncaptureScreen));
    }

    @Then("I should see captured document edit screen")
    public static void iShouldSeeCapturedDocumentEditScreen() {
        Utilities ut = new Utilities(driver);
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        ut.WaitUntilElementDisplay(documentscanner.FinishEditingButton);
        ut.checkIfElementIsVisible(documentscanner.FinishEditingButton);

    }

    @When("I long tap info button on capture screen")
    public void iLongTapInfoButtonOnCaptureScreen() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities.LongTappingFunction(documentscanner.InfoOncaptureScreen);


    }

    @Then("I should see result pop-up")
    public void iShouldSeeResultPopUp() {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.ResultPopup));
    }

    @Then("I double click rotate right button")
    public void iClickRotateRightButton() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.RotateRight));
        Utilities.DoubleTappingFunction(documentscanner.RotateRight);

    }

    @Then("I double click rotate left button")
    public void iClickRotateLeftButton() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.RotateLeft));
        Utilities.DoubleTappingFunction(documentscanner.RotateLeft);
    }

    @And("I should see {string} section on the result popup")
    public void iShouldSeeSectionOnTheResultPopup(String message) {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Assert.assertTrue(documentscanner.ResultPopupMessage.getText().contains(message));
    }

    @When("I click ok button on the result popup")
    public void iClickOkButtonOnTheResultPopup() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities ut = new Utilities(driver);
        Assert.assertTrue(ut.checkIfElementIsVisible(documentscanner.ResultPopupButtonOk));
        Utilities.singleTappingFunction(documentscanner.ResultPopupButtonOk);
    }

    @When("I tap back button of the device")
    public void iTapBackButtonOfTheDevice() {
        Utilities.BackButton();
    }

    @Then("I should tap to focus on the screen")
    public void iShouldTapToFocusOnTheScreen() throws Exception {
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        Utilities.singleTappingFunction(documentscanner.FocusViewOnCapture);
        Thread.sleep(1000);
        Utilities.singleTappingFunction(documentscanner.FocusViewOnCapture);
        Thread.sleep(1000);
        Utilities.singleTappingFunction(documentscanner.FocusViewOnCapture);

    }

    @Then("I should wait until Server Unreachable popup appears")
    public void iShouldWaitUntilServerUnreachablePopupAppears() {
        Utilities ut = new Utilities(driver);
        new WebDriverWait(driver,10).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                until(ExpectedConditions.visibilityOf(ut.ServerUnreachable()));

    }

}

