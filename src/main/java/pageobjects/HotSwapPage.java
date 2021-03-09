package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class HotSwapPage {
    public HotSwapPage(AppiumDriver<AndroidElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/bt_install\")")
public RemoteWebElement InstallProfileButton;


//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/bt_remove\")")
public RemoteWebElement RemoveProfileButton;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
public RemoteWebElement RemoveProfilesListed;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/bt_get_profile\")")
public RemoteWebElement GetProfileTagButton;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/bt_select_profile\")")
public RemoteWebElement GetProfileListButton;


//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/bt_select_profile_tag\")")
public RemoteWebElement SelectProfileButton;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='default']")
public RemoteWebElement SelectProfileLists;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(xpath="//android.widget.Button[@text='SMART CAPTURE']")
public RemoteWebElement ProcessingModeSmartcapture;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(xpath="//android.widget.Button[@text='SMART SCAN']")
public RemoteWebElement ProcessingModeSmartScan;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/bt_processing\")")
public RemoteWebElement ProcessingModeButton;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/bt_scan_document\")")
public RemoteWebElement ScanDocumentButton;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")")
public RemoteWebElement AllowButton;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Hot-Swap Sample']")
public RemoteWebElement HotSwapLabel;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/ed_tag_name\")")
public RemoteWebElement EnterTagText;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/ed_install_filename\")")
public RemoteWebElement EnterProfileFileText;





}


