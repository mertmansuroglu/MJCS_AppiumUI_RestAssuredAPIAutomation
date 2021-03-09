package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(AndroidDriver<AndroidElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_menu_customer_journey\")")
    //@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
    //@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_menu_liveness\")")
	public RemoteWebElement CustomerJourneySampleButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='HOT-SWAP SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	//@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_menu_liveness\")")
	public RemoteWebElement HotSwapSampleButton;
	
	//@AndroidFindBy(xpath="//android.widget.Button[@text='LİVENESS FRAGMENT SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_menu_liveness\")")
	public RemoteWebElement LivenessFragmentSampleButton;
	
	//@AndroidFindBy(xpath="//android.widget.Button[@text='DOCUMENT SCANNER SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_menu_scanner\")")
	public RemoteWebElement DocumentScannerSampleButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='MANUAL EXTRACTION SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	//@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_menu_liveness\")")
	public RemoteWebElement ManualExtractionSampleButton;
	
	//@AndroidFindBy(xpath="//android.widget.Button[@text='DOCUMENT SCANNER SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/action_settings\")")
	public RemoteWebElement SettingsButton;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[1]")
	public RemoteWebElement MjcsSampleLabell;



}


















 