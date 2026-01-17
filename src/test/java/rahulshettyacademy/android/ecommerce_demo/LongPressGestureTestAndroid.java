package rahulshettyacademy.android.ecommerce_demo;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;

public class LongPressGestureTestAndroid extends AndroidBaseTest {

    @Test
    public void longPressGestureTest() throws InterruptedException {

//        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Views']")).click();
//        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
//        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

        driver.executeScript("mobile: startActivity",ImmutableMap.of(
                "intent","io.appium.android.apis/io.appium.android.apis.view.ExpandableList1"
        ));

        WebElement fishName =driver.findElement(AppiumBy.xpath("(//android.widget.TextView)[5]"));
//        driver.executeScript("mobile:longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)fishName).getId(),"duration",3000));
        //longPress(fishName);


        WebElement sampleMenu = driver.findElement(AppiumBy.xpath(" //android.widget.TextView[@text='Sample menu']"));
        Assert.assertTrue(sampleMenu.isDisplayed());
        Assert.assertEquals(sampleMenu.getText(),"Sample menu");

        WebElement sampleAction = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sample action']"));
        sampleAction.click();



    }

}
