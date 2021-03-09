package appiumframework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.PropertiesHandler;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public static AppiumDriverLocalService service;
    public static AndroidDriver<AndroidElement> driver;
    public static final PropertiesHandler properties = new PropertiesHandler("global.properties");
    private static Process p;


    public AppiumDriverLocalService startServer() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        return service;
    }

    public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException {
        File f = new File("src");
        File fs = new File(f, properties.getProperty(appName));

        String device;
        if (properties.getProperty("DeviceType").contains("real")) {
            device = properties.getProperty("RealDevice");
        } else {
            setupEmulator();
            device = properties.getProperty("EmulatedDevice");
        }
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability("chromedriverExecutable", "C:\\work\\chrome\\chromedriver.exe");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        if (properties.getProperty("InstallAPK").equalsIgnoreCase("true")) {
            cap.setCapability("appPackage", "com.idscan.mjcs.sample");
        }
        cap.setCapability(MobileCapabilityType.FULL_RESET, false);
        cap.setCapability(MobileCapabilityType.NO_RESET, true);
        cap.setCapability("appActivity", "com.idscan.mjcs.sample.MenuActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    public static void setupEmulator() throws IOException, InterruptedException {
        if (p == null || !p.isAlive()) {
            p = Runtime.getRuntime().exec("cmd /c start \"\" src\\main\\resources\\EmulatorStart.bat");
            if (properties.getProperty("ColdBoot").equalsIgnoreCase("true")) {
                Thread.sleep(30000);
            } else {
                Thread.sleep(5000);
            }
        }
    }

    public static void closeDownEmulator() {
        if (p != null && p.isAlive()) {
            p.destroy();
        }
    }

    public void stopServer() {
        service.stop();
    }

}

