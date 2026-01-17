package rahulshettyacademy.base;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import rahulshettyacademy.page_objects.ios.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class IOSBaseTest extends BaseTest {


    public IOSDriver driver;
    public HomePage homePage;


    @BeforeClass(alwaysRun = true)
    public void setup() throws IOException {

        FileInputStream propertiesStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/global.properties");
        Properties properties = new Properties();
        properties.load(propertiesStream);

        String ipAddresss = System.getProperty("ipaddress")!=null? System.getProperty("ipaddress"):properties.getProperty("ipaddress");
        String portNumber = System.getProperty("portnumber")!=null? System.getProperty("portnumber"):properties.getProperty("portnumber");
        String iphoneDeviceName = System.getProperty("iphonedevicename")!=null? System.getProperty("iphonedevicename"):properties.getProperty("iphonedevicename");
        String iosVersion = System.getProperty("iosversion")!=null? System.getProperty("iosversion"):properties.getProperty("iosversion");
        String appPath = System.getProperty("apppath")!=null? System.getProperty("apppath"):properties.getProperty("apppath");

        AppiumDriverLocalService appiumServer = startAppiumServer(ipAddresss,Integer.parseInt(portNumber));
        XCUITestOptions xcuiTestOptions = new XCUITestOptions();
        xcuiTestOptions.setDeviceName(iphoneDeviceName);
        xcuiTestOptions.setApp(appPath);
        xcuiTestOptions.setPlatformVersion(iosVersion);
        xcuiTestOptions.setWdaLaunchTimeout(Duration.ofSeconds(10));

        //tell to your driver the appium server address and capabilities
        driver = new IOSDriver(appiumServer.getUrl(),xcuiTestOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        homePage = new HomePage(driver);

    }



    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
        stopAppiumServer();
    }



}
