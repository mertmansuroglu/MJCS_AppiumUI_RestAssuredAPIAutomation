package steps.settingspage_steps.documentscannersettings;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.SettingsPage;

public class DocumentScannerSettings_Tests extends Base {


    //Document Scanner Sample Settings

    @Then("I should check enable smartcapture dummy button as disabled")
    public static void iShouldCheckEnableSmartcaptureDummyAsDisabled() {
        i_scroll_to_on_Settings("Enable Manual Capture Dummy");
        SettingsPage Settings = new SettingsPage(driver);
        try {
            if (Settings.EnableSmartCaptureDummyButton.getText().equalsIgnoreCase("ON"))
                Utilities.singleTappingFunction(Settings.EnableSmartCaptureDummyButton);
        } catch (Exception e) {
            // System.out.println(e);

        }

    }
    @And("I disable all document scanner settings")
    public static void idisableDocumentScannerSampleSettings()  {
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Scanner Type");
        if(sp.SwitchButton.getText().equalsIgnoreCase("ON")){sp.SwitchButton.click();}
        if(sp.EnablePopupButton.getText().equalsIgnoreCase("ON")){sp.EnablePopupButton.click();}
        if(sp.InfoButton.getText().equalsIgnoreCase("ON")){sp.InfoButton.click();}
        if(sp.CropDocumentButton.getText().equalsIgnoreCase("ON")){sp.CropDocumentButton.click();}

    }
    @Then("I check if Switch button is displayed")
    public void i_check_if_Switch_button_is_displayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.SwitchButton.isDisplayed());
        Utilities utilities = new Utilities(driver);
        Assert.assertTrue(utilities.checkIfElementIsVisible(Settings.SwitchButton));
    }

    @Then("I should see the switch Button as enabled")
    public void iShouldSeeTheSwitchButtonAsEnabled() {
        SettingsPage Settings = new SettingsPage(driver);
        Assert.assertTrue(Settings.SwitchButton.getText().equalsIgnoreCase("ON"));
    }

    @And("I click switch Button on document Scanner Sample Settings in order to enable it")
    public void iClickSwitchButtonOnDocumentScannerSampleSettings() throws Exception {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.SwitchButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.SwitchButton);
            Assert.assertTrue(Settings.SwitchButton.getText().equalsIgnoreCase("ON"));
        }

    }


    @Then("I check if Info Button is displayed")
    public void iCheckIfInfoButtonIsDisplayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.InfoButton.isDisplayed());
        Utilities utilities = new Utilities(driver);
        Assert.assertTrue(utilities.checkIfElementIsVisible(Settings.InfoButton));
    }

    @Then("I should see the Info Button as enabled")
    public void iShouldSeeTheInfoButtonAsEnabled() {
        SettingsPage Settings = new SettingsPage(driver);
        Assert.assertTrue(Settings.InfoButton.getText().equalsIgnoreCase("ON"));
    }

    @And("I click Info Button on document Scanner Sample Settings in order to enable it")
    public void i_click_info_button_on_document_scanner_sample_settings() throws Exception {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.InfoButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.InfoButton);
            Assert.assertTrue(Settings.InfoButton.getText().equalsIgnoreCase("ON"));
        }
    }

    @Then("I check if Enable Popup is displayed")
    public void iCheckIfEnablePopupIsDisplayed() {
        SettingsPage Settings = new SettingsPage(driver);
        Utilities utilities=new Utilities(driver);
        Assert.assertTrue(Settings.EnablePopupButton.isDisplayed());
        Assert.assertTrue(utilities.checkIfElementIsVisible(Settings.EnablePopupButton));
    }

    @Then("I should see the Enable Popup Button as enabled")
    public void iShouldSeeTheEnablePopupButtonAsEnabled() {
        SettingsPage Settings = new SettingsPage(driver);
        Assert.assertTrue(Settings.EnablePopupButton.getText().equalsIgnoreCase("ON"));
    }

    @And("I click Enable popup on document Scanner Sample Settings in order to enable it")
    public void iClickEnablePopupOnDocumentScannerSampleSettings() throws Exception {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.EnablePopupButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.EnablePopupButton);
            Assert.assertTrue(Settings.EnablePopupButton.getText().equalsIgnoreCase("ON"));
        }

    }

    @Then("I check if Crop Button is displayed")
    public void iCheckIfCropButtonIsDisplayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities utilities=new Utilities(driver);
        Assert.assertTrue(Settings.CropDocumentButton.isDisplayed());
        Assert.assertTrue(utilities.checkIfElementIsVisible(Settings.CropDocumentButton));
    }

    @Then("I should see the Crop Button as enabled")
    public void iShouldSeeTheCropButtonAsEnabled() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.CropDocumentButton.getText().equalsIgnoreCase("ON"));
    }





    //Customer Journey Screen Injection Settings

    @Then("I check if Enable Front Side Button is displayed")
    public void iCheckIfEnableFrontSideButtonIsDisplayed() {

        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility = new Utilities(driver);
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableFrontsideInjectButton));
    }

    @When("I click Enable Front Side button on document Scanner Sample Settings")
    public void iClickEnableFrontSideButtonOnDocumentScannerSampleSettings() {
        SettingsPage Settings=new SettingsPage(driver);
        if(Settings.EnableFrontsideInjectButton.getText().equalsIgnoreCase("OFF")){Settings.EnableFrontsideInjectButton.click();}
    }

    @Then("I should see the Enable Front Side button as enabled")
    public void iShouldSeeTheEnableFrontSideButtonAsEnabled() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableFrontsideInjectButton.getText().equalsIgnoreCase("ON"));
    }

    @Then("I check if Enable Back Side Button is displayed")
    public void iCheckIfEnableBackSideButtonIsDisplayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility = new Utilities(driver);
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableBAcksideInjectButton));

    }

    @When("I click Enable Back Side button on document Scanner Sample Settings")
    public void iClickEnableBackSideButtonOnDocumentScannerSampleSettings() {
        SettingsPage Settings=new SettingsPage(driver);
        if(Settings.EnableBAcksideInjectButton.getText().equalsIgnoreCase("OFF")){Settings.EnableBAcksideInjectButton.click();}
    }

    @Then("I should see the Enable Back Side button as enabled")
    public void iShouldSeeTheEnableBackSideButtonAsEnabled() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableBAcksideInjectButton.getText().equalsIgnoreCase("ON"));
    }

    @Then("I check if Enable LivenessButton is displayed")
    public void iCheckIfEnableLivenessButtonIsDisplayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility = new Utilities(driver);
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableLivenessInjectButton));

    }

    @When("I click Enable Liveness button on document Scanner Sample Settings")
    public void iClickEnableLivenessButtonOnDocumentScannerSampleSettings() {
        SettingsPage Settings=new SettingsPage(driver);
        if(Settings.EnableLivenessInjectButton.getText().equalsIgnoreCase("OFF")){Settings.EnableLivenessInjectButton.click();}
    }

    @Then("I should see the Enable Liveness button as enabled")
    public void iShouldSeeTheEnableLivenessButtonAsEnabled() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableLivenessInjectButton.getText().equalsIgnoreCase("ON"));
    }

    @Then("I check if Enable Address Document Button is displayed")
    public void iCheckIfEnableAddressDocumentButtonIsDisplayed() {
        SettingsPage Settings = new SettingsPage(driver);
        Utilities visibility = new Utilities(driver);
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableAddressInjectButton));

    }

    @When("I click Crop Button on document Scanner Sample Settings in order to enable it")
    public void iClickCropButtonOnDocumentScannerSampleSettings() throws Exception {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.CropDocumentButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.CropDocumentButton);
            Assert.assertTrue(Settings.CropDocumentButton.getText().equalsIgnoreCase("ON"));
        }
    }

    @And("I click {string}  Address Document Button on document Scanner Sample Settings")
    public void iClickAddressDocumentButtonOnDocumentScannerSampleSettings(String check) {
        SettingsPage Settings = new SettingsPage(driver);
        if (check.equalsIgnoreCase("Enable")) {
            if (Settings.EnableAddressInjectButton.getText().equalsIgnoreCase("OFF")) {
                Settings.EnableAddressInjectButton.click();
            }
        } else if (check.equalsIgnoreCase("Disable")
                && Settings.EnableAddressInjectButton.getText().equalsIgnoreCase("ON")) {
            Settings.EnableAddressInjectButton.click();
        }
    }

    @When("I click {string} Selfie Button on document Scanner Sample Settings")
    public void iClickSelfieButtonOnDocumentScannerSampleSettings(String check) {
        SettingsPage Settings=new SettingsPage(driver);
        if (check.equalsIgnoreCase("Enable")) {
            if (Settings.EnableSelfieInjectButton.getText().equalsIgnoreCase("OFF")) {
                Settings.EnableSelfieInjectButton.click();
            }
        } else if (check.equalsIgnoreCase("Disable")
                && Settings.EnableSelfieInjectButton.getText().equalsIgnoreCase("ON")) {
            Settings.EnableSelfieInjectButton.click();
        }
    }

    @When("I click {string} Liveness Button on document Scanner Sample Settings")
    public void iClickLivenessButtonOnDocumentScannerSampleSettings(String check) {
        SettingsPage Settings=new SettingsPage(driver);
        if (check.equalsIgnoreCase("Enable")) {
            if (Settings.EnableLivenessInjectButton.getText().equalsIgnoreCase("OFF")) {
                Settings.EnableLivenessInjectButton.click();
            }
        } else if (check.equalsIgnoreCase("Disable")
                && Settings.EnableLivenessInjectButton.getText().equalsIgnoreCase("ON")) {
            Settings.EnableLivenessInjectButton.click();
        }
    }

    @And("I click {string} Frontside Button on document Scanner Sample Settings")
    public void iClickFrontsideButtonOnDocumentScannerSampleSettings(String check)  {
        SettingsPage Settings=new SettingsPage(driver);
        if (check.equalsIgnoreCase("Enable")) {
            if (Settings.EnableFrontsideInjectButton.getText().equalsIgnoreCase("OFF")) {
                Settings.EnableFrontsideInjectButton.click();
            }
        } else if (check.equalsIgnoreCase("Disable")
                && Settings.EnableFrontsideInjectButton.getText().equalsIgnoreCase("ON")) {
            Settings.EnableFrontsideInjectButton.click();
        }
    }

    @Then("I should see the Enable Address Document Button as enabled")
    public void iShouldSeeTheEnableAddressDocumentButtonAsEnabled() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableAddressInjectButton.getText().equalsIgnoreCase("ON"));
    }

    @Then("I check if Enable Selfie Button is displayed")
    public void iCheckIfEnableSelfieButtonIsDisplayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility = new Utilities(driver);
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableSelfieInjectButton));
    }

    @When("I click Enable Selfie Button on document Scanner Sample Settings")
    public void iClickEnableSelfieButtonOnDocumentScannerSampleSettings() {
        SettingsPage Settings=new SettingsPage(driver);
        if(Settings.EnableSelfieInjectButton.getText().equalsIgnoreCase("OFF")){Settings.EnableSelfieInjectButton.click();}

    }

    @Then("I should see the Enable Selfie Button as enabled")
    public void iShouldSeeTheEnableSelfieButtonAsEnabled() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue( Settings.EnableSelfieInjectButton.getText().equalsIgnoreCase("ON"));
    }

    @Then("I check if Enable Loading Button is displayed")
    public void iCheckIfEnableLoadingButtonIsDisplayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility = new Utilities(driver);
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableLoadingInjectButton));
    }

    @When("I click Enable Loading Button on document Scanner Sample Settings")
    public void iClickEnableLoadingButtonOnDocumentScannerSampleSettings() {
        SettingsPage Settings=new SettingsPage(driver);
        if (Settings.EnableLoadingInjectButton.getText().equalsIgnoreCase("OFF")) {
            Settings.EnableLoadingInjectButton.click();
        }

    }

    @Then("I should see the Enable Loading Button as enabled")
    public void iShouldSeeTheEnableLoadingButtonAsEnabled() {
        SettingsPage Settings = new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableLoadingInjectButton.getText().equalsIgnoreCase("ON"));
    }

    @And("I click {string} Loading Button on document Scanner Sample Settings")
    public void iClickLoadingButtonOnDocumentScannerSampleSettings(String check) {
        SettingsPage Settings = new SettingsPage(driver);
        if (check.equalsIgnoreCase("Enable")) {
            if (Settings.EnableLoadingInjectButton.getText().equalsIgnoreCase("OFF")) {
                Settings.EnableLoadingInjectButton.click();
            }
        } else if (check.equalsIgnoreCase("Disable")
                && Settings.EnableLoadingInjectButton.getText().equalsIgnoreCase("ON")) {
            Settings.EnableLoadingInjectButton.click();
        }
    }

    @Then("I should enable smart capture dummy")
    public void iShouldEnableSmartCaptureDummy() {
        SettingsPage Settings = new SettingsPage(driver);
        try {
            if (Settings.EnableSmartCaptureDummyButton.getText().equalsIgnoreCase("OFF"))
                Utilities.singleTappingFunction(Settings.EnableSmartCaptureDummyButton);
        } catch (Exception e) {
            // System.out.println(e);

        }
    }

    @And("I set smartcapture timeout to {string} second")
    public void iSetSmartcaptureTimeoutToSecond(String timeout) {
        SettingsPage Settings=new SettingsPage(driver);
        Settings.SmartCaptureTimeoutButton.click();
        Settings.EditTextCredentials.clear();
        Settings.EditTextCredentials.sendKeys(timeout);
        Settings.OK_EditText.click();


    }

    @Then("I should select {string} from Quality Check error")
    public void iShouldSelectFromQualityCheckError(String check) {
        SettingsPage Settings=new SettingsPage(driver);
        Settings.QualityCheckErrorButton.click();
        Utilities utilities = new Utilities(driver);
        utilities.QualityChecksDummy(check).click();
    }


    @When("I scroll to {string} on Settings")
    public static void i_scroll_to_on_Settings(String element) {
        Utilities ut = new Utilities(driver);
        ut.scrollToText(element);

    }
}
