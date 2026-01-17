package rahulshettyacademy.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserBaseTest {

    AppiumDriverLocalService appiumServer;
    public AndroidDriver driver;


    @BeforeClass
    public void setup() throws MalformedURLException {
        appiumServer = new AppiumServiceBuilder().withAppiumJS(new File("/Users/arniejumaquio/.nvm/versions/node/v24.11.1/lib/node_modules/appium/build/lib/main.js")).
                withIPAddress("127.0.0.1").usingPort(4723).build();
        appiumServer.start();

        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setChromedriverExecutable(System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver");
        uiAutomator2Options.setDeviceName("Pixel 9a");
        uiAutomator2Options.setCapability("browserName", "Chrome");

        //tell to your driver the appium server address and capabilities
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @AfterClass
    public void teardown(){
        driver.quit();
        appiumServer.stop();
    }

}
