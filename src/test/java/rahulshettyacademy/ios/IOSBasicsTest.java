package rahulshettyacademy.ios;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.IOSBaseTest;

public class IOSBasicsTest extends IOSBaseTest {

    @Test
    public void iosBasicsTest(){

       WebElement alertViews = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`value==\"Alert Views\"`]"));
       alertViews.click();

       WebElement textEntry  = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Text Entry\" AND type == \"XCUIElementTypeStaticText\""));
       textEntry.click();

       WebElement messageField = driver.findElement(AppiumBy.xpath("//XCUIElementTypeTextField"));
       messageField.sendKeys("Hello World!");

       WebElement okButton = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label=='OK' and name=='OK'`]"));
       okButton.click();

       WebElement confirmCancel = driver.findElement(AppiumBy.iOSNsPredicateString("value BEGINSWITH[c] \"Confirm\""));
       confirmCancel.click();

       WebElement confirmCancelText = driver.findElement(AppiumBy.iOSNsPredicateString("label BEGINSWITH[c] \"A message\""));
       Assert.assertEquals(confirmCancelText.getText(),"A message should be a short, complete sentence.");

       WebElement confirmButton = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Confirm\" AND name ENDSWITH[c] \"firm\""));
       confirmButton.click();

       
    }

}
