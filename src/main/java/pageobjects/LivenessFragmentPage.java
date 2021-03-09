package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class LivenessFragmentPage {
	public LivenessFragmentPage(AppiumDriver<AndroidElement> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);


	}

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/buttonSettings\")")
public RemoteWebElement LivenessSettingsButton;


//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/buttonStartLiveness\")")
public RemoteWebElement StartLivenessTest;

}
