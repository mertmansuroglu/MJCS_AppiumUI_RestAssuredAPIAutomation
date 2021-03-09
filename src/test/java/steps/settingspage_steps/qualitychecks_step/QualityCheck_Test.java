package steps.settingspage_steps.qualitychecks_step;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CustomerJourneyPage;
import pageobjects.SettingsPage;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import static steps.settingspage_steps.documentscannersettings.DocumentScannerSettings_Tests.i_scroll_to_on_Settings;

public class QualityCheck_Test extends Base {


    @Then("I check if Enable Boundary Check button is displayed")
    public void i_check_if_enable_boundary_check_button_is_displayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility= new Utilities(driver);
        Assert.assertTrue(Settings.EnableBoundaryCheckButton.isDisplayed());
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableBoundaryCheckButton));


    }
    @Then("I check if Enable Blur Check button is displayed")
    public void i_check_if_enable_blur_check_button_is_displayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility= new Utilities(driver);
        Assert.assertTrue(Settings.EnableBlurCheckButton.isDisplayed());
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableBlurCheckButton));
    }
    @Then("I check if Enable Glare Check button is displayed")
    public void i_check_if_enable_Glare_check_button_is_displayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility= new Utilities(driver);
        Assert.assertTrue(Settings.EnableGlareCheckButton.isDisplayed());
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableGlareCheckButton));
    }
    @Then("I check if Enable Low Res Check button is displayed")
    public void i_check_if_enable_LowRes_check_button_is_displayed() {
        SettingsPage Settings=new SettingsPage(driver);
        Utilities visibility= new Utilities(driver);
        Assert.assertTrue(Settings.EnableLowResCheckButton.isDisplayed());
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableLowResCheckButton));
    }

    @Then("I check if Alert Check button is displayed")
    public void i_check_if_enableAlert_check_button_is_displayed() {
        SettingsPage Settings = new SettingsPage(driver);
        Utilities visibility = new Utilities(driver);
        Assert.assertTrue(Settings.EnableAlertButton.isDisplayed());
        Assert.assertTrue(visibility.checkIfElementIsVisible(Settings.EnableAlertButton));
    }

    @When("I click Enable Boundary Check button in order to enable it")
    public void i_click_enable_boundary_check_button() {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.EnableBoundaryCheckButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.EnableBoundaryCheckButton);
            Assert.assertTrue(Settings.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON"));
        }

    }

    @When("I click Enable Blur Check button in order to enable it")
    public void i_click_enable_blur_check_button() {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.EnableBlurCheckButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.EnableBlurCheckButton);
            Assert.assertTrue(Settings.EnableBlurCheckButton.getText().equalsIgnoreCase("ON"));
        }
    }

    @When("I click Enable Glare Check button in order to enable it")
    public void i_click_enable_Glare_check_button() {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.EnableGlareCheckButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.EnableGlareCheckButton);
            Assert.assertTrue(Settings.EnableGlareCheckButton.getText().equalsIgnoreCase("ON"));
        }
    }

    @When("I click Enable Low Res Check button in order to enable it")
    public void i_click_enable_LowRes_check_button() throws Exception {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.EnableLowResCheckButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.EnableLowResCheckButton);
            Assert.assertTrue(Settings.EnableLowResCheckButton.getText().equalsIgnoreCase("ON"));
        }
    }

    @When("I click Enable Alert Check button in order to enable it")
    public void i_click_enable_Alert_check_button() {
        SettingsPage Settings = new SettingsPage(driver);
        if (Settings.EnableAlertButton.getText().equalsIgnoreCase("OFF")) {
            Utilities.singleTappingFunction(Settings.EnableAlertButton);
            Assert.assertTrue(Settings.EnableAlertButton.getText().equalsIgnoreCase("ON"));
        }

    }

    @Then("I should see the boundary check button as enabled")
    public void i_should_see_the_boundary_check_button_as_enabled() {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON"));
    }
    @And("I enable all quality checks")
    public void i_should_see_the_all_check_enabled() {
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @And("I disable all quality checks")
    public static void i_Disable_the_all_checks() {
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("ON")){sp.EnableAlertButton.click();}
    }
        @And("I only enable the BOUNDARY check  button")
    public void i_should_see_the_boundary_check_enabled() {
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @And("I only enable the BLUR check button")
    public void i_should_see_the_bLUR_check_enabled() {
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @And("I only enable the GLARE check button")
    public void i_should_see_the_GLARE_check_enabled() {
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @And("I only enable the LOW RES check button")
    public void i_should_see_the_LowRes_check_enabled() {
        SettingsPage sp=new SettingsPage(driver);
        i_scroll_to_on_Settings("Enable Boundary Check");
        if(sp.EnableBoundaryCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBoundaryCheckButton.click();}
        if(sp.EnableBlurCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableBlurCheckButton.click();}
        if(sp.EnableGlareCheckButton.getText().equalsIgnoreCase("ON")){sp.EnableGlareCheckButton.click();}
        if(sp.EnableLowResCheckButton.getText().equalsIgnoreCase("OFF")){sp.EnableLowResCheckButton.click();}
        if(sp.EnableAlertButton.getText().equalsIgnoreCase("OFF")){sp.EnableAlertButton.click();}
    }
    @Then("I should wait until blur check alert appears")
    public void iShouldWaitUntilBlurCheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"BLUR DETECTED"));

    }

    @Then("I should wait until GLARE check alert appears")
    public void iShouldWaitUntilGLARECheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"GLARE DETECTED"));
    }

    @Then("I should wait until low res check alert appears")
    public void iShouldWaitUntilLowResCheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"Move Document Closer"));
    }

    @Then("I should wait until boundary check alert appears")
    public void iShouldWaitUntilBoundaryCheckAlertAppears() {
        CustomerJourneyPage cp= new CustomerJourneyPage(driver);
        new WebDriverWait(driver,15).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.textToBePresentInElement(cp.AlertView,"Keep document within the frame"));
    }

    @Then("I should see the Blur check button as enabled")
    public void i_should_see_the_blur_check_button_as_enabled()  {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableBlurCheckButton.getText().equalsIgnoreCase("ON"));
    }
    @Then("I should see the Glare check button as enabled")
    public void i_should_see_the_Glare_check_button_as_enabled()  {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableGlareCheckButton.getText().equalsIgnoreCase("ON"));
    }
    @Then("I should see the Low Res check button as enabled")
    public void i_should_see_the_LowRes_check_button_as_enabled()  {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableLowResCheckButton.getText().equalsIgnoreCase("ON"));
    }

    @Then("I should see the Alert check button as enabled")
    public void i_should_see_the_Alert_check_button_as_enabled()  {
        SettingsPage Settings=new SettingsPage(driver);
        Assert.assertTrue(Settings.EnableAlertButton.getText().equalsIgnoreCase("ON"));
    }



}
