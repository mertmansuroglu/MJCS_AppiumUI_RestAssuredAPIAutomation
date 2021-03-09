package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class DocumentScannerPage {

    public DocumentScannerPage(AppiumDriver<AndroidElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CAPTURE\")")
public RemoteWebElement DocumentScanCaptureButton;


//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_upload\")")
public RemoteWebElement DocumentScanUploadIdButton;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/flashButton\")")
public RemoteWebElement DocumentScanFlashButton;


//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/facingButton\")")
public RemoteWebElement SwitchFacingCamera;


	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/infoButton\")")
public RemoteWebElement InfoOncaptureScreen;


	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/popupContainerView\")")
public RemoteWebElement PopUpTest;

	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/btnSubmit\")")
	public RemoteWebElement FinishEditingButton;

	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/btnRotateRight\")")
	public RemoteWebElement RotateRight;

	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/btnRotateLeft\")")
	public RemoteWebElement RotateLeft;

	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/parentPanel\").childSelector(resourceId(\"android:id/topPanel\"))")
	public RemoteWebElement ResultPopup;

	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/parentPanel\").childSelector(resourceId(\"android:id/message\"))")
	public RemoteWebElement ResultPopupMessage;

	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/fotoapparatFocusView\")")
	public RemoteWebElement FocusViewOnCapture;

	//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
	public RemoteWebElement ResultPopupButtonOk;

//public void scrollToText(String text) {
//	
//	//sikinti verirse cift tirnaga don
//	//whatever textcomes here this will help you to scroll
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('+text+'));");
//}
}
