package steps.settingspage_steps.domainsettings_Step;

import appiumframework.Base;
import appiumframework.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.SettingsPage;
import steps.mainpage_steps.MainPage_Tests;

public class DomainSettings_Tests extends Base {


    @Then("I enter the following Baselink {string}")
    public static void iEnterTheFollowingBaselink(String Base) {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.BaselinkLayout.isDisplayed());
        Utilities.singleTappingFunction(sp.BaselinkLayout);
        Assert.assertTrue(sp.EditTextCredentials.isDisplayed());
        sp.EditTextCredentials.clear();
        sp.EditTextCredentials.sendKeys(Base);
        Assert.assertTrue(sp.OK_EditText.isDisplayed());
        Utilities.singleTappingFunction(sp.OK_EditText);
    }

    @And("I enter the following username {string} and Password {string}")
    public static void iEnterTheFollowingUsernameAndPassword(String username, String password) throws Exception {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.UsernameLayout.isDisplayed());
        Utilities.singleTappingFunction(sp.UsernameLayout);
        Assert.assertTrue(sp.EditTextCredentials.isDisplayed());
        sp.EditTextCredentials.clear();
        sp.EditTextCredentials.sendKeys(username);
        Assert.assertTrue(sp.OK_EditText.isDisplayed());
        Utilities.singleTappingFunction(sp.OK_EditText);
        // Assert.assertEquals("QASuper",sp.UsernameLayout.getText());
        Assert.assertTrue(sp.PasswordLayout.isDisplayed());
        Utilities.singleTappingFunction(sp.PasswordLayout);
        Assert.assertTrue(sp.EditTextCredentials.isDisplayed());
        sp.EditTextCredentials.clear();
        sp.EditTextCredentials.sendKeys(password);
        Assert.assertTrue(sp.OK_EditText.isDisplayed());
        Utilities.singleTappingFunction(sp.OK_EditText);
    }

    @And("I satisfy login preconditions for elbtesting server")
    public static void iSatisfyLoginPreconditionsWith() throws Exception {
        String username = "superadministrator";
        String password = "Password1!";
        String baselink = "https://elbtesting.idscan.cloud";
        MainPage_Tests object = new MainPage_Tests();
        object.iCleanAppiumServer();
        object.iOpenTheApplication();
        MainPage_Tests settingsbutton = new MainPage_Tests();
        settingsbutton.iClickSettingsButton();
        iEnterTheFollowingBaselink(baselink);
        iEnterTheFollowingUsernameAndPassword(username, password);
    }

    @And("I open edit credential view")
    public void iOpenEditCredentialView() {
        SettingsPage sp = new SettingsPage(driver);

        Utilities.singleTappingFunction(sp.UsernameLayout);
        Assert.assertTrue(sp.EditTextCredentials.isDisplayed());
        //System.out.println(sp.EditTextCredentials.isDisplayed()+"sdfvsdgvsdgsdgfsdgf");
    }

    @Then("I click cancel button in edit credential view")
    public void iClickCancelButtonInEditCredentialView() {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.Cancel_EditText.isDisplayed());
        Utilities.singleTappingFunction(sp.Cancel_EditText);
    }

    @Then("I put password {string}")
    public void iPutPassword(String password) {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.PasswordLayout.isDisplayed());
        Utilities.singleTappingFunction(sp.PasswordLayout);
        Assert.assertTrue(sp.EditTextCredentials.isDisplayed());
        sp.EditTextCredentials.clear();
        sp.EditTextCredentials.sendKeys(password);
        Assert.assertTrue(sp.OK_EditText.isDisplayed());
        Utilities.singleTappingFunction(sp.OK_EditText);

    }

    @Then("I put username {string}")
    public void iPutUsername(String username) {
        SettingsPage sp = new SettingsPage(driver);
        Assert.assertTrue(sp.UsernameLayout.isDisplayed());
        Utilities.singleTappingFunction(sp.UsernameLayout);
        Assert.assertTrue(sp.EditTextCredentials.isDisplayed());
        sp.EditTextCredentials.clear();
        sp.EditTextCredentials.sendKeys(username);
        Assert.assertTrue(sp.OK_EditText.isDisplayed());
        Utilities.singleTappingFunction(sp.OK_EditText);

    }
}
