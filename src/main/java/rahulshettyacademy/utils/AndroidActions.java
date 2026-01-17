package rahulshettyacademy.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import java.util.List;

public class AndroidActions extends AppActions {

   protected  DeviceRotation deviceRotation;
   protected  AndroidDriver driver;

   @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
   protected WebElement screenTitle;


    public AndroidActions(AndroidDriver driver){
       this.driver = driver;

    }

    public void longPress(WebElement element){

        driver.executeScript("mobile: longClickGesture",  ImmutableMap.of(
                "elementId",((RemoteWebElement)element).getId(),
                "duration", 2000)
        );
    }

    public void scrollIntoView(String elementText){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))"));
    }

    public void scrollToEnd()
    {
        boolean isScrollable;
        do{

            isScrollable = ((Boolean) (driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left",100,
                    "top",100,
                    "width",200,
                    "height",200,
                    "direction","down",
                    "percent",1.0
            ))));

        }while (isScrollable);
    }

    public void scrollAndClick(By by, String elementText) throws InterruptedException {

        List<WebElement> elements = driver.findElements(by);
        for(int i = 0; i < elements.size();i++) {

            if(elements.get(i).getText().equalsIgnoreCase(elementText)){
                elements.get(i).click();
                break;

            }else{

                scrollIntoView(elementText);
                elements = driver.findElements(by);

                if(elements.get(i).getText().equalsIgnoreCase(elementText)){
                    elements.get(i).click();
                    break;

                }
            }

        }



    }


    public void scrollToTop()
    {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)"));
    }

    public void swipe(WebElement element,String direction){

        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)element).getId(),
                "speed",1500,
                "direction",direction,
                "percent",0.75
        ));


    }

    public void dragAndDrop(WebElement element,int x , int y){

        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)element).getId(),
                "endX",x,
                "endY",y
        ));
    }

    public void pressButton(String buttonName){

        if(buttonName.equalsIgnoreCase("back")){
            ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
        }else if(buttonName.equalsIgnoreCase("home")){
            ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.HOME));
        }else if(buttonName.equalsIgnoreCase("switch")){
            ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        }else {
            System.out.println("Invalid button name");
        }

    }

    public void setToLandscapeMode(){
        deviceRotation = new DeviceRotation(0,0,90);
        ((AndroidDriver)driver).rotate(deviceRotation);
    }


    public String copyAndPaseToClipboard(String text){
        ((AndroidDriver)driver).setClipboardText(text);
        return  ((AndroidDriver)driver).getClipboardText();
    }


}
