package steps.settingspage_steps.langaugesettings_step;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CustomerJourneyPage;
import pageobjects.DocumentScannerPage;
import pageobjects.SettingsPage;
import steps.mainpage_steps.MainPage_Tests;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import static steps.settingspage_steps.documentscannersettings.DocumentScannerSettings_Tests.*;
import static steps.settingspage_steps.domainsettings_Step.DomainSettings_Tests.iSatisfyLoginPreconditionsWith;
import static steps.settingspage_steps.qualitychecks_step.QualityCheck_Test.i_Disable_the_all_checks;

public class LanguageSettings_Tests extends Base {


    @Before("@ScenarioForCustomerJourney")
    public static void BeforeScenarioForCustomerJourney() throws Exception {
        iSatisfyLoginPreconditionsWith();
        iClickDisableLanguageSelectionButton();
        i_Disable_the_all_checks();
        iClearAllScreenInjections();
        iShouldCheckEnableSmartcaptureDummyAsDisabled();
    }
    @Before("@BeforeScenarioForDocumentScan")
    public static void BeforeScenarioForDocumentScan() throws Exception {
        iSatisfyLoginPreconditionsWith();
        iClickDisableLanguageSelectionButton();
        idisableDocumentScannerSampleSettings();
        iShouldmakeSureTriggerIsOn();
        iShouldCheckEnableSmartcaptureDummyAsDisabled();
    }



    @And("I check if cancel button is enabled")
    public void iCheckIfCancelButtonIsEnabled() {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertEquals("CANCEL", sp.CancelSelectLanguage.getText());
        //System.out.println(sp.CancelSelectLanguage.getText());
    }
    @Then("I check if Enable language selection button is displayed")
    public void iCheckIfEnableLanguageSelectionButtonIsDisplayed() {
        SettingsPage sp = new SettingsPage(driver);
        System.out.println(sp.EnableLanguageSelectionSwitch);
        try {
            sp.EnableLanguageSelectionSwitch.isDisplayed();
        } catch (NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
    }

    @And("I check if Language Selection layout is enabled")
    public void iCheckIfLayoutIsEnabled() {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(Boolean.parseBoolean(sp.EnableLanguageSelectionSwitch.getAttribute("enabled")));
    }


    @And("I clear all screen injections")
    public static void iClearAllScreenInjections() {
        i_scroll_to_on_Settings("Enable Front Side");
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.EnableSelfieInjectButton.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(Settings.EnableSelfieInjectButton);
        }
        if (Settings.EnableFrontsideInjectButton.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(Settings.EnableFrontsideInjectButton);
        }
        if (Settings.EnableBAcksideInjectButton.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(Settings.EnableBAcksideInjectButton);
        }
        if (Settings.EnableLivenessInjectButton.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(Settings.EnableLivenessInjectButton);
        }
        if (Settings.EnableAddressInjectButton.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(Settings.EnableAddressInjectButton);
        }
        if (Settings.EnableLoadingInjectButton.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(Settings.EnableLoadingInjectButton);
        }
    }

    @Then("I should make sure that trigger is always on")
    public static void iShouldmakeSureTriggerIsOn() {
        SettingsPage Settings = new SettingsPage(driver);
        i_scroll_to_on_Settings("Trigger");
        Utilities.singleTappingFunction(Settings.TriggerButton);
        Utilities.singleTappingFunction(Settings.AlwaysOnTrigger);
    }

    @And("I click Enable language selection button in order to disable it")
    public static void iClickDisableLanguageSelectionButton() throws InterruptedException {
        SettingsPage sp = new SettingsPage(driver);
        if (sp.EnableLanguageSelectionSwitch.getText().equalsIgnoreCase("ON")) {
            Utilities.singleTappingFunction(sp.EnableLanguageSelectionSwitch);
            Assert.assertTrue(sp.EnableLanguageSelectionSwitch.getText().equalsIgnoreCase("OFF"));
        } else
            Thread.sleep(500);
    }

    @Then("I should see Enable language selection as enabled")
    public void iShouldSeeEnableLanguageSelectionAsEnabled() {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.EnableLanguageSelectionSwitch.getText().equalsIgnoreCase("ON"));
    }

    @Then("I should make sure that enable dummy disabled")
    public static void iShouldmakeSureEnableDummyIsDisabled() {
        SettingsPage sp = new SettingsPage(driver);
        if (sp.EnableSmartCaptureDummyButton.getText().equalsIgnoreCase("ON")) {
            sp.EnableSmartCaptureDummyButton.click();
        }
    }

    @After("@Last_Step_LanguageSettings")
    public static void LastStepForLanguageSettings() throws Exception {
        MainPage_Tests mp = new MainPage_Tests();
        mp.iCleanAppiumServer();
        mp.iOpenTheApplication();
        SettingsPage sp = new SettingsPage(driver);
        mp.iClickSettingsButton();
        if (sp.EnableLanguageSelectionSwitch.getText().equalsIgnoreCase("ON")) {
            sp.EnableLanguageSelectionSwitch.click();
        }
    }

    @Then("I click cancel button")
    public void iClickCancelButton() {
        SettingsPage sp = new SettingsPage(driver);
        Utilities.singleTappingFunction(sp.CancelSelectLanguage);
    }

    @And("I click Enable language selection button in order to enable it")
    public void iClickEnableLanguageSelectionButton() throws InterruptedException {
        SettingsPage sp = new SettingsPage(driver);
        if (sp.EnableLanguageSelectionSwitch.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(sp.EnableLanguageSelectionSwitch);
            Assert.assertTrue(sp.EnableLanguageSelectionSwitch.getText().equalsIgnoreCase("ON"));
        } else
            Thread.sleep(500);
    }

    @And("I click Language Selection layout")
    public void iClickLanguageSelectionLayout() {
        SettingsPage sp = new SettingsPage(driver);
        Utilities.singleTappingFunction(sp.LanguageSelectionLayout);
    }

    @Then("I select English language")
    public void iSelectEnglishLanguage() {
        SettingsPage sp = new SettingsPage(driver);
        try {
            sp.SelectDialogListView.isDisplayed();
        } catch (NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(sp.SelectEnglishLanguage.isDisplayed());
        Utilities.singleTappingFunction(sp.SelectEnglishLanguage);


    }

    @Then("I select Turkish language")
    public void iSelectTurkishLanguage() {
        SettingsPage sp = new SettingsPage(driver);
        try {
            sp.SelectDialogListView.isDisplayed();
        } catch (NoSuchElementException e) {
            Assert.fail("Error on Page:element not found");
        }
        Assert.assertTrue(sp.SelectTurkishLanguage.isDisplayed());
        Utilities.singleTappingFunction(sp.SelectTurkishLanguage);

    }


    @Then("I should see the capture screen language is english")
    public void iShouldSeeTheCaptureScreenLanguageIsEnglish() {
        CustomerJourneyPage infopopup=new CustomerJourneyPage(driver);
        try {
        Assert.assertTrue(infopopup.Infopopup.getText().equalsIgnoreCase("Please capture front side of your document"));
        } catch (Exception e) {
            // System.out.println(e);
        }
    }

    @Then("I should see the capture screen language is turkish")
    public void iShouldSeeTheCaptureScreenLanguageIsTurkish() {
        CustomerJourneyPage infopopup=new CustomerJourneyPage(driver);
        try {
            Assert.assertTrue(infopopup.Infopopup.getText().equalsIgnoreCase("Lutfen dokumaninizin on yuzunu cekiniz"));
        } catch (Exception e) {
            // System.out.println(e);
        }
    }

    @Then("I should see the selfie section with Turkish Language")
    public void iShouldSeeTheSelfieSectionWithTurkishLanguage() {

        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.Infopopup);
        Assert.assertTrue(cp.Infopopup.getText().equalsIgnoreCase("Lutfen kendi fotografinizi cekin"));
    }

    @Then("I should see that recapture the document popup appears in turkish language")
    public void iShouldSeeThatRecaptureTheDocumentPopupAppearsInTurkishLanguage() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.Infopopup);
        Assert.assertTrue(cp.Infopopup.getText().equalsIgnoreCase("Lutfen tekrar deneyin"));

    }

    @Then("I should see the Adress section with Turkish Language")
    public void iShouldSeeTheAdressSectionWithTurkishLanguage() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.Infopopup);
        Assert.assertTrue(cp.Infopopup.getText().equalsIgnoreCase("Lutfen adres dokumaninizi cekin"));
    }

    @Then("I should see the text of upload popup title in turkish")
    public void iShouldSeeTheTextOfUploadPopupTitleInTurkish() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.UploadingPopup);
        Assert.assertTrue(cp.UploadingPopup.getText().equalsIgnoreCase("Gonderiliyor…"));
    }
    @Then("I should see the text of upload popup message in turkish")
    public void iShouldSeeTheTextOfUploadPopupMessageInTurkish() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.UploadingPopupMessage);
        Assert.assertTrue(cp.UploadingPopupMessage.getText().equalsIgnoreCase("Lutfen birkac saniye bekleyiniz…"));

    }

    @And("I should see finish editing button in turkish")
    public void iShouldSeeFinishEditingButtonInTurkish() {
        Utilities ut=new Utilities(driver);
        DocumentScannerPage documentscanner = new DocumentScannerPage(driver);
        ut.checkIfElementIsVisible(documentscanner.FinishEditingButton);
        Assert.assertTrue(documentscanner.FinishEditingButton.getText().equalsIgnoreCase("Duzenleme tamamlandi"));
    }

    @Then("I should see the error message in english")
    public void iShouldSeeTheErrorMessageInEnglish() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.ErrorMessageForExit);
        Assert.assertTrue(cp.ErrorMessageForExit.getText().equalsIgnoreCase("User exits the journey"));

    }

    @Then("I only enable the BLUR check buttonn")
    public void i_only_enable_the_BLUR_check_buttonn() {
        // Write code here that turns the phrase above into concrete actions
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @Then("I only enable the Glare check buttonn")
    public void i_only_enable_the_Glare_check_buttonn() {
        // Write code here that turns the phrase above into concrete actions
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @Then("I only enable the Low Res check buttonn")
    public void i_only_enable_the_LowRes_check_buttonn() {
        // Write code here that turns the phrase above into concrete actions
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @Then("I only enable the Boundary check buttonn")
    public void i_only_enable_the_Boundary_check_buttonn() {
        // Write code here that turns the phrase above into concrete actions
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }

    @Then("I should see the description label of liveness detection screen in turkish")
    public void iShouldSeeTheDescriptionLabelOfLivenessDetectionScreenInTurkish() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.LivenessDetectionDescription);
        Assert.assertTrue(cp.LivenessDetectionDescription.getText().equalsIgnoreCase("Lutfen kameraya dogru bakin ve belirtilen hareketleri tamamlayin"));
    }

    @Then("I should see the proceed button of liveness detection screen in turkish")
    public void iShouldSeeTheProceedButtonOfLivenessDetectionScreenInTurkish() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.LivenessProceedButton);
        new WebDriverWait(driver,10).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.LivenessProceedButton,"DEVAM EDIN"));
    }

    @Then("I tap proceed button of liveness detection")
    public void iShouldTapProceedButtonOfLivenessDetectionScreenInTurkish() {
        CustomerJourneyPage cp = new CustomerJourneyPage(driver);
        Utilities.singleTappingFunction(cp.LivenessProceedButton);
    }

    @Then("I should see liveness message for the look straight in turkish")
    public void iShouldSeeLivenessMessageForLookStraightInTurkish() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.LivenessMessageLabel);
        Assert.assertTrue(cp.LivenessMessageLabel.getText().equalsIgnoreCase("Kameraya dogru bakin"));

    }

    @Then("I should see liveness animation view in turkish")
    public void iShouldSeeLivenessAnimationViewInTurkish() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        Utilities ut=new Utilities(driver);
        ut.WaitUntilElementDisplay(cp.LivenessAnimationView);
        Assert.assertTrue(cp.LivenessAnimationView.getText().equalsIgnoreCase("Yapilacak eylemler icin Animasyonlar"));
    }
    @Then("I should wait until blur check alert appears in turkish")
    public void iShouldWaitUntilBlurCheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"Dokumanda bulaniklik tespit edildi"));
    }

    @Then("I should wait until glare check alert appears in turkish")
    public void iShouldWaitUntilGlareCheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"Dokumanda parlaklik tespit edildi"));
    }
    @Then("I should wait until Boundary check alert appears in turkish")
    public void iShouldWaitUntilBoundaryheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"Dokümani çerçeve icerisinde tutun"));
    }
    @Then("I should wait until Low res check alert appears in turkish")
    public void iShouldWaitUntilLowResheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"Dokumani yakinlastirin"));
    }
}
