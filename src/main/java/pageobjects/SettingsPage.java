package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {


    public SettingsPage(AppiumDriver<AndroidElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }
    //driver.findElementsByClassName("android.widget.Button").get(3).click();
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    public RemoteWebElement SettingsLabel;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(className = "android.widget.ImageButton")
    public RemoteWebElement SettingsNavigateBackButton;

    //Language Settings!!!!!!!!!!!!!!!!!!!!!!!!!!!


    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    //@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]")
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_language_selection_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableLanguageSelectionSwitch;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='English']")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement SelectEnglishLanguage;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Turkish']")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement SelectTurkishLanguage;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement CancelSelectLanguage;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/select_dialog_listview\")")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement SelectDialogListView;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    //    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_language_selection_list\")")
    public RemoteWebElement LanguageSelectionLayout;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    //@AndroidFindBy(xpath = "//android.widget.LinearLayout[5]")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    @AndroidFindBy(uiAutomator = "text(\"Base Link\")")
    public RemoteWebElement BaselinkLayout;

    //Domain Settings!!!!!!!!!!!!!!!!!!!!!!!!

    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_username_edit_text\")")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement UsernameLayout;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(uiAutomator = "text(\"Password\")")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement PasswordLayout;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/edit\")")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement EditTextCredentials;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement OK_EditText;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    //@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CANCEL\")")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    //@AndroidFindBy(xpath="//android.widget.LinearLayout[2]")
    public RemoteWebElement Cancel_EditText;
    //@AndroidFindBy(xpath="//android.widget.TextView[@text='Info Button']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_file\")")
    public RemoteWebElement InputPath;
    //@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_uri\")")
    public RemoteWebElement InputURL;
    //No need to make scroll for this item
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_boundary_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableBoundaryCheckButton;

    //Quality Checks!!!!!!!!!!!!!!!!!!

    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_blur_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableBlurCheckButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_glare_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableGlareCheckButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_low_res_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableLowResCheckButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_show_alert_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableAlertButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/settings_scanner_type_list\")")
    public RemoteWebElement ScannerTypeButton;
    //Document Scanner Sample Settings!!!!!!!
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_pop_up_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnablePopupButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/settings_pop_up_dismiss_list\")")
    public RemoteWebElement PopupDismissButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/settings_pop_up_edit_text\")")
    public RemoteWebElement PopupPassword;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_show_switch_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement SwitchButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_crop_document_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement CropDocumentButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_show_info_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement InfoButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/settings_trigger_list\")")
    public RemoteWebElement TriggerButton;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Always On']")
    public RemoteWebElement AlwaysOnTrigger;

//    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Newer']")
//    public RemoteWebElement NeverTrigger;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='After 5s']")
    public RemoteWebElement FiveSecondTrigger;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='After 10s']")
    public RemoteWebElement TenSecondTrigger;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='After 15s']")
    public RemoteWebElement FifteenSecondTrigger;

    //Customer Journey Screen Injection Settings

    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_journey_definition_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement JourneyDefCallbackButton;
    //Customer Journey Screen Injection
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_injection_front_side_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableFrontsideInjectButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_injection_backside_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableBAcksideInjectButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_injection_liveness_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableLivenessInjectButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_injection_poa_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableAddressInjectButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_injection_selfie_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableSelfieInjectButton;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_injection_loading_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableLoadingInjectButton;

    //Journey Definition Setup

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/settings_journey_def_selection\")")
    public RemoteWebElement SelectJourneyDefinition;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/settings_journey_def_id_edit_text\")")
    public RemoteWebElement JourneyDefGUIDButton;

    //Dummy Data

    @AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/settings_dummy_data_smart_capture_toggle\").childSelector(className(\"android.widget.Switch\"))")
    public RemoteWebElement EnableSmartCaptureDummyButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Smart Capture Timeout']")
    public RemoteWebElement SmartCaptureTimeoutButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Quality Check Error']")
    public RemoteWebElement QualityCheckErrorButton;





}