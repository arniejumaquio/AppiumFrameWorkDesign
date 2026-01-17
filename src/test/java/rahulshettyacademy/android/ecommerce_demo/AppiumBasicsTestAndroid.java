package rahulshettyacademy.android.ecommerce_demo;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;

import java.net.MalformedURLException;

public class AppiumBasicsTestAndroid extends AndroidBaseTest {

    @Test
    public void appiumTest() throws MalformedURLException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        WebElement wifiSettings =driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]"));
        wifiSettings.click();

        WebElement wifiSettingsLabel = driver.findElement(AppiumBy.xpath("//android.widget.TextView "));
        Assert.assertEquals(wifiSettingsLabel.getText(),"WiFi settings");

        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Rahul Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();


        //android.widget.TextView[@text='WiFi settings']
    }

}
