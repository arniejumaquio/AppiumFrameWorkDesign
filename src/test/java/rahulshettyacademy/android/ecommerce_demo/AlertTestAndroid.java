package rahulshettyacademy.android.ecommerce_demo;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;

public class AlertTestAndroid extends AndroidBaseTest {

    @Test
    public void alertTest() {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Alert Dialogs']")).click();
        WebElement firstOption = driver.findElement(AppiumBy.id("io.appium.android.apis:id/two_buttons"));
        //long press
        firstOption.click();

        WebElement cancelButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Cancel']"));
        WebElement okButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='OK']"));
        okButton.click();

        WebElement lastOption = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='OK Cancel dialog with Holo Light theme']"));
        lastOption.click();
        WebElement lastOptionText = driver.findElement(AppiumBy.id("android:id/alertTitle"));
        Assert.assertEquals(lastOptionText.getText(), "Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.");
        cancelButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Cancel']"));
        cancelButton.click();


        WebElement textEntryDialog = driver.findElement(AppiumBy.accessibilityId("Text Entry dialog"));
        textEntryDialog.click();
        WebElement textEntryDialogText = driver.findElement(AppiumBy.id("android:id/alertTitle"));
        Assert.assertEquals(textEntryDialogText.getText(), "Text Entry dialog");
        String name = "TestName";
        String password = "TestPassword";
        WebElement nameField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='io.appium.android.apis:id/username_edit']"));
        WebElement passwordField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='io.appium.android.apis:id/password_edit']"));
        nameField.sendKeys(name);
        passwordField.sendKeys(password);
        okButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='OK']"));
        okButton.click();


        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Text Entry dialog\"))"));

        boolean isScrollable = true;

        while (isScrollable) {

            isScrollable = ((Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "top", 200,
                    "left", 200,
                    "width", 200,
                    "height", 200,
                    "direction", "down",
                    "percent", 1.0
            )));


        }

        //swipe
        driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
                "elementId",((RemoteWebElement)firstOption).getId(),
                "speed",2000,
                "direction","left",
                "percent",0.75
        ));


        driver.executeScript("mobile: longClickGesture",ImmutableMap.of(
                "elementId",((RemoteWebElement)firstOption).getId(),
                "duration",3_000
        ));




    }


}
