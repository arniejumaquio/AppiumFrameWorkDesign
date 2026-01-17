package rahulshettyacademy.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class IOSActions  extends AppActions{

    protected  IOSDriver driver;

    public IOSActions(IOSDriver driver){
       this.driver = driver;
    }

    public void longPress(WebElement element, int duration){

        driver.executeScript("mobile: touchAndHold", ImmutableMap.of(
                "element",((RemoteWebElement)element).getId(),
                "duration",duration
        ));

    }

    public void selectFromPickerWheel(WebElement element,String value,String order){

        String firstPickerWheelActualValue = element.getAttribute("value");

        while (!firstPickerWheelActualValue.equals(value)){

            driver.executeScript("mobile: selectPickerWheelValue", ImmutableMap.of(
                    "element", ((RemoteWebElement) element).getId(),
                    "order", order,
                    "offset", 0.15
            ));

            firstPickerWheelActualValue = element.getAttribute("value");
        }


    }

    public void slide(WebElement element,String valueInPercent){
        element.sendKeys(valueInPercent);
    }

    public void swipe(String direction){

        driver.executeScript("mobile: swipe",ImmutableMap.of(
                "direction",direction
        ));

    }

    public void swipe(WebElement element,String direction){

        driver.executeScript("mobile: swipe",ImmutableMap.of(
                "element",((RemoteWebElement) element).getId(),
                "direction",direction
        ));

    }

}
