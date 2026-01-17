package rahulshettyacademy.android.ecommerce_demo;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;

public class ScrollGestureTestAndroid extends AndroidBaseTest {

    @Test
    public void scrollGestureTest() throws InterruptedException {

       WebElement viewSection = driver.findElement(AppiumBy.accessibilityId("Views"));
       viewSection.click();

       //String elementText = "Switches";
       //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))"));
        boolean canScrollMore = true;

        while (canScrollMore) {

            canScrollMore = ((Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "top", 200,
                    "left", 200,
                    "width", 200,
                    "height", 200,
                    "direction", "down",
                    "percent", 0.75
            )));


        }


    }

}
