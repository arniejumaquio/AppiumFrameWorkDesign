package rahulshettyacademy.android.ecommerce_demo;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;

public class MiscellanousTestAndroid  {

    /**
    @Test
    public void miscellanousTest() throws InterruptedException {


        //to set the device orientation to landscape
        //setToLandscapeMode();

        Thread.sleep(5_000);

        By options = AppiumBy.xpath("//android.widget.TextView");
        scrollAndClick(options,"Preference");

        //By graphicsOptions= AppiumBy.xpath("//android.widget.TextView");
        //scrollAndClick(graphicsOptions,"Vertices");

        //start the app using package and activity
//        driver.executeScript("mobile: startActivity", ImmutableMap.of(
//                "intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"
//        ));

        //press the android back button
       // pressButton("lol");

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        WebElement wifiSettings =driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]"));
        wifiSettings.click();

        WebElement wifiSettingsLabel = driver.findElement(AppiumBy.xpath("//android.widget.TextView "));
        Assert.assertEquals(wifiSettingsLabel.getText(),"WiFi settings");

        //copy to clipboard and paste functionalitiy
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(copyAndPaseToClipboard("Testing"));
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

    }

    **/

}
