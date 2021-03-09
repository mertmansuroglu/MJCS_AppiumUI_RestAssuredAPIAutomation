package appiumframework;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class Utilities extends Base {
//  AndroidDriver<AndroidElement> driver;


    public Utilities(AndroidDriver<AndroidElement> driver) {
        Base.driver = driver;
    }

    public static void singleTappingFunction(WebElement element) {
        TouchAction action = new TouchAction(driver);
        action.tap(tapOptions().withElement(element(element))).perform();
    }

    public static void DoubleTappingFunction(WebElement element) throws Exception {
        TouchAction action = new TouchAction(driver);
        if (element.isDisplayed()) {
            action.tap(tapOptions().withElement(element(element))).perform();
            action.tap(tapOptions().withElement(element(element))).perform();
        } else
            throw new Exception("element not found");
    }

    public static boolean LongTappingFunction(WebElement element) throws Exception {
        TouchAction action = new TouchAction(driver);
        if (element.isDisplayed()) {
            action.longPress(LongPressOptions.longPressOptions().withElement(element(element)).withDuration(Duration.ofSeconds(6))).perform();
        } else
            throw new Exception("element not found");
        return true;
    }

    public WebElement ListedJourneyDefinitions(String journeydefinition_Text) throws Exception {
        return driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + journeydefinition_Text + "\"]"));

    }

    public void scrollToText(String text) {

      WebElement element=  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");

        new WebDriverWait(driver,30).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.visibilityOf(element));
    }

    public boolean checkIfElementIsVisible(WebElement element) {
        try {
            if (new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element)) != null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public void CleanAppium() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");

    }

    public void AllowPopupButton() {
        WebElement allow = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
        Assert.assertTrue(allow.isDisplayed());
        allow.click();
    }

    public void DenyPopupButton() {
        WebElement allow = driver.findElement(By.id("com.android.packageinstaller:id/permission_deny_button"));
        Assert.assertTrue(allow.isDisplayed());
        allow.click();
    }

    public static void BackButton(){
        driver.context("NATIVE_APP");
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

    }
    public WebElement CaptureButton() throws InterruptedException {
        return driver.findElement(By.id("com.idscan.mjcs.sample:id/captureButton"));
    }

    public void WaitUntilElementDisplay(WebElement element){
        new WebDriverWait(driver,30).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement ServerUnreachable(){
        WebElement serverUnreached = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"Server unreachable\"]"));
        Assert.assertTrue(serverUnreached.isDisplayed());
        return serverUnreached;
    }

    public WebElement QualityChecksDummy(String Check){
        return driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"" + Check + "\"]"));
    }

    public WebElement ScannerType(String type){
        return driver.findElement(By.xpath("//android.widget.CheckedTextView[@text=\"" + type + "\"]"));
    }




}
//    public void HandleUpdatePopup() {
//    	boolean visible = false;  // assume it is invisible
//	    try {
//	        // try to find the element
//	        WebElement w = driver.findElementByClassName("android.widget.FrameLayout");
//	        // if I get to here the element exists
//	        // if it is visible
//	        //burda her 50 kisimda bir 3 saniye gelmesini bekliyor boyleykende exceptionlari handle ediyor
//	        if(w.isDisplayed())
//	            visible = true;
//	        new WebDriverWait(driver,10).pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
//	        until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1"))).click();
//
//			new WebDriverWait(driver,10).pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
//	        until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='IGNORE']"))).click();
//
//	    } catch(Exception e) {}
//
//    }

//    public void HandleUpdatePage() throws InterruptedException{
//    	Thread.sleep(4000);
////    	Set<String> contexts= driver.getContextHandles();
////    	for(String contextName: contexts) {
////    		System.out.println(contextName);
////    	}
//    	driver.context("WEBVIEW_chrome");
//    	driver.pressKey(new KeyEvent(AndroidKey.BACK));
//    	driver.context("NATIVE_APP");
//
//   }


//    List<MobileElement> mobileElements = (MobileElement) driver.findElementsByClassName(“android.widget.ImageButton”);
//    MobileElement mobileElement = mobileElement.get(1);


//driver.pressKey(new KeyEvent(AndroidKey.BACK));