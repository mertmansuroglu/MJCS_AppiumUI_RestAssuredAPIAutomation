package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;


public class CustomerJourneyPage {


	public CustomerJourneyPage(AppiumDriver<AndroidElement> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);


	}

//@AndroidFindBy(xpath="//android.widget.TextView[1]")sometimes get(2)de olur
//@AndroidFindBy(id = "android:id/text1")
//@AndroidFindBy(className = "android.widget.TextView")
//@AndroidFindBy(xpath="//android.widget.Button[@text='START CUSTOMER JOURNEY']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
//@AndroidFindBy(xpath="//android.widget.Button[@text='DOCUMENT SCANNER SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/customer_journey_start\")")
public RemoteWebElement StartCustomerJourneyButton;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/captureButton\")")
public RemoteWebElement CaptureButton;

@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='1']")
public RemoteWebElement JourneyIdExtract;


@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/alert_text\")")
public RemoteWebElement AlertView;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/alert_container\").childSelector(resourceId(\"com.idscan.mjcs.sample:id/alert_image\"))")
public RemoteWebElement AlertImage;



@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.FrameLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='1']")
public RemoteWebElement HLRExtract;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/popupContainerView\").childSelector(className(\"android.widget.TextView\"))")
public RemoteWebElement Infopopup;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/popup_root\").childSelector(resourceId(\"com.idscan.mjcs.sample:id/popup_title\"))")
public RemoteWebElement UploadingPopup;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/popup_root\").childSelector(resourceId(\"com.idscan.mjcs.sample:id/popup_image\"))")
public RemoteWebElement UploadingPopupImage;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/popup_root\").childSelector(resourceId(\"com.idscan.mjcs.sample:id/popup_message\"))")
public RemoteWebElement UploadingPopupMessage;


@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='1']")
public RemoteWebElement ErrorMessageForExit;


@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/textViewCustomerJourneyFragmentSampleTitle\")")
public RemoteWebElement ScreenInjectionText;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/buttonCustomerJourneyFragmentSampleFinish\")")
public RemoteWebElement ScreenInjectionFinish;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/textViewCustomerJourneyLoadingFragmentSampleTitle\")")
public RemoteWebElement ScreenInjectionTextLoading;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/intro_button_proceed\")")
public RemoteWebElement LivenessProceedButton;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/intro_descrition_label\")")
public RemoteWebElement LivenessDetectionDescription;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/liveness_message_label\")")
public RemoteWebElement LivenessMessageLabel;

@AndroidFindBy(uiAutomator = "resourceId(\"com.idscan.mjcs.sample:id/liveness_animation_view\")")
public RemoteWebElement LivenessAnimationView;

}






//always androidfindby element should be used

//there are certain rule for page factory we have to follow , we have to initialize page factory elements 
		//inside constructor