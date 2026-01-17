package rahulshettyacademy.ios;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import rahulshettyacademy.base.IOSBaseTest;

public class IOSBasicsTestTwo extends IOSBaseTest {

    @Test
    public void iosBasicsTestTwo(){

        WebElement alertViews = driver.findElement(AppiumBy.iOSNsPredicateString("value == \"Alert Views\" AND label == \"Alert Views\""));
        alertViews.click();

        WebElement Other = driver.findElement(AppiumBy.iOSNsPredicateString("value == \"Other\" AND label == \"Other\""));
        Other.click();

        WebElement cancelBtn = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == 'Cancel'`]"));
        cancelBtn.click();

        String text = "Test";
        WebElement textEntry = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`value == \"Text Entry\"`]"));
        textEntry.sendKeys(text);

        WebElement cancelBtnTwo = driver.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] \"Cance\""));
        cancelBtnTwo.click();




    }


}
