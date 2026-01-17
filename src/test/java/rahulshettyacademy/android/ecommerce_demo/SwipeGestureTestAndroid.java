package rahulshettyacademy.android.ecommerce_demo;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;

public class SwipeGestureTestAndroid extends AndroidBaseTest {

    @Test
    public void swipeGestureTest() throws InterruptedException {

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

        WebElement firstImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));
        WebElement secondImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[2]"));
        WebElement thirdImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[3]"));

        Assert.assertEquals(firstImage.getAttribute("focusable"),"true");

//        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
//                "elementId",((RemoteWebElement)firstImage).getId(),
//                "direction","left",
//                "speed",1500,
//                "percent",0.75
//        ));

        driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
                "elementId",((RemoteWebElement)firstImage).getId(),
                "speed",2000,
                "direction","left",
                "percent",0.75
        ));


//        swipe(firstImage,"left");
//        swipe(secondImage,"left");
//        swipe(thirdImage,"right");
//        swipe(secondImage,"right");

        Assert.assertEquals(firstImage.getAttribute("focusable"),"false");



    }

}
