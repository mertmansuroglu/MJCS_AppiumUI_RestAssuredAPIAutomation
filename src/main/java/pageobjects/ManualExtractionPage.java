package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ManualExtractionPage {
    public ManualExtractionPage(AppiumDriver<AndroidElement> Driver) {

        PageFactory.initElements(new AppiumFieldDecorator(Driver), this);


    }

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_bitmap\")")
public RemoteWebElement InputBitmap;



//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_file\")")
public RemoteWebElement InputPath;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.idscan.mjcs.sample:id/button_uri\")")
public RemoteWebElement InputURL;

//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")
@AndroidFindBy(xpath="//android.widget.Button[@text='Manual Extraction Sample']")
public RemoteWebElement ManualExtractionLabel;

}


