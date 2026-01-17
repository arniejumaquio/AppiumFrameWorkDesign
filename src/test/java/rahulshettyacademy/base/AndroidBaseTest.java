package rahulshettyacademy.base;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import rahulshettyacademy.page_objects.android.FormPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;


public class AndroidBaseTest extends BaseTest {

    public AndroidDriver driver;
    protected FormPage formPage ;

    @BeforeClass(alwaysRun = true)
    public void setup() throws IOException {

        FileInputStream propertiesStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/global.properties");
        Properties properties = new Properties();
        properties.load(propertiesStream);

        String ipAddresss = System.getProperty("ipaddress")!=null?  System.getProperty("ipaddress"):properties.getProperty("ipaddress");
        String portNumber = System.getProperty("portnumber")!=null?  System.getProperty("portnumber"):properties.getProperty("portnumber");
        String chromeDriverPath = System.getProperty("chromedriverpath")!=null? System.getProperty("chromedriverpath"):properties.getProperty("chromedriverpath");
        String apkPath = System.getProperty("apkpath")!=null? System.getProperty("apkpath"):properties.getProperty("apkpath");
        String androidDeviceName = System.getProperty("androiddevicename")!=null? System.getProperty("androiddevicename"):properties.getProperty("androiddevicename");


        AppiumDriverLocalService appiumServer = startAppiumServer(ipAddresss,Integer.parseInt(portNumber));
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setChromedriverExecutable(System.getProperty("user.dir")+chromeDriverPath);
        uiAutomator2Options.setDeviceName(androidDeviceName);
        uiAutomator2Options.setApp(System.getProperty("user.dir")+apkPath);

        //tell to your driver the appium server address and capabilities
         driver = new AndroidDriver(appiumServer.getUrl(),uiAutomator2Options);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         formPage = new FormPage(driver);

    }


    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
        stopAppiumServer();
    }

}
