package rahulshettyacademy.ios;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.IOSBaseTest;
import rahulshettyacademy.utils.IOSActions;

import java.util.HashMap;
import java.util.Map;

/**
public class IOSPickerTest extends IOSActions {

    @Test
    public void iosPickerTest() throws InterruptedException {

        WebElement pickerView = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Picker View\""));
        pickerView.click();

        String firstPickerWheelValue = "15";
        WebElement firstPickerWheel = driver.findElement(AppiumBy.accessibilityId("Red color component value"));
        selectFromPickerWheel(firstPickerWheel,firstPickerWheelValue,"previous");

        String secondPickerWheelValue = "25";
        WebElement secondPickerWheel = driver.findElement(AppiumBy.accessibilityId("Green color component value"));
        selectFromPickerWheel(secondPickerWheel,secondPickerWheelValue,"previous");


        String thirdPickerWheelValue = "10";
        WebElement thirdPickerWheel = driver.findElement(AppiumBy.accessibilityId("Blue color component value"));
        //selectFromPickerWheel(thirdPickerWheel,thirdPickerWheelValue,"previous");


        Assert.assertEquals(firstPickerWheel.getAttribute("value"),firstPickerWheelValue);
        Assert.assertEquals(secondPickerWheel.getAttribute("value"),secondPickerWheelValue);
        Assert.assertEquals(thirdPickerWheel.getAttribute("value"),thirdPickerWheelValue);

    }




}


 **/