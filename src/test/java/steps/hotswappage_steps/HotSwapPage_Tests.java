package steps.hotswappage_steps;

import appiumframework.Base;
import appiumframework.Utilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pageobjects.HotSwapPage;

public class HotSwapPage_Tests extends Base {


    @Then("I check if Enter profile file name textbox is displayed")
    public void iCheckIfEnterProfileFileNameTextboxIsDisplayed() {
        String profileFileText = "TEST";
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.EnterProfileFileText.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.EnterProfileFileText.isDisplayed());
        hp.EnterProfileFileText.sendKeys(profileFileText);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Assert.assertEquals(profileFileText, hp.EnterProfileFileText.getText());
    }

    @Then("I check if Enter tag name textbox is displayed")
    public void iCheckIfEnterTagNameTextboxIsDisplayed() {
        String profileFileText = "TEST";
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.EnterTagText.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.EnterTagText.isDisplayed());
        hp.EnterTagText.sendKeys(profileFileText);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        System.out.println("test");
        Assert.assertEquals(profileFileText, hp.EnterTagText.getText());

    }

    @And("I check if Get profile Info from list button is  displayed")
    public void iCheckIfGetProfileInfoFromListButtonIsDisplayed() throws Exception {
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.GetProfileListButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.GetProfileListButton.isDisplayed());
        Utilities.singleTappingFunction(hp.GetProfileListButton);

    }
    @And("I check if Hotswap label is  displayed")
    public void iCheckIfHotswapLabelIsDisplayed() {
        HotSwapPage hp = new HotSwapPage(driver);
        try {

            hp.HotSwapLabel.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("HotSwap label Element Not found");
        }
        Assert.assertEquals("Hot-Swap Sample", hp.HotSwapLabel.getText());
    }

    @Then("I check if Install Profile button is  displayed")
    public void iCheckIfInstallProfileButtonIsDisplayed() throws Exception {
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.InstallProfileButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.InstallProfileButton.isDisplayed());
        Utilities.singleTappingFunction(hp.InstallProfileButton);

    }
    @And("I check if Processing Mode button is  displayed")
    public void iCheckIfProcessingModeButtonIsDisplayed() throws Exception {
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.ProcessingModeButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.ProcessingModeButton.isDisplayed());
        Utilities.singleTappingFunction(hp.ProcessingModeButton);

    }
    @And("I check if Remove Profile button is  displayed")
    public void iCheckIfRemoveProfileButtonIsDisplayed() throws Exception {
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.RemoveProfileButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.RemoveProfileButton.isDisplayed());
        Utilities.singleTappingFunction(hp.RemoveProfileButton);


    }
    @And("I check if Select Profile From List button is  displayed")
    public void iCheckIfSelectProfileFromListButtonIsDisplayed() throws Exception {
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.SelectProfileButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.SelectProfileButton.isDisplayed());
        Utilities.singleTappingFunction(hp.SelectProfileButton);

    }
    @And("I check if Scan document button is  displayed")
    public void iCheckIfScanDocumentButtonIsDisplayed() throws Exception {
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.ScanDocumentButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.ScanDocumentButton.isDisplayed());
        Utilities.singleTappingFunction(hp.ScanDocumentButton);

    }
    @And("I check if Get profile Info from tag button is  displayed")
    public void iCheckIfGetProfileInfoFromTagButtonIsDisplayed() throws Exception {
        HotSwapPage hp = new HotSwapPage(driver);
        try {
            hp.GetProfileTagButton.isDisplayed();
        } catch (java.util.NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(hp.GetProfileTagButton.isDisplayed());
        Utilities.singleTappingFunction(hp.GetProfileTagButton);


    }

    @When("I scroll to {string} on HotSwap Sample Settings")
    public void iScrollToOnDocumentScannerSampleSettings(String element) {
        Utilities ut = new Utilities(driver);
        ut.scrollToText(element);
    }

    @And("I click allow pop-up button")
    public void iClickAllowCameraButton() {
        Utilities ut = new Utilities(driver);
        ut.AllowPopupButton();
    }

}