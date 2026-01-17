package rahulshettyacademy.utils;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public abstract class AppActions {

    protected  WebDriverWait explicitWait;

    public void waitForElementForAttribContains(AppiumDriver driver,WebElement element, String attribute, String value){
        this.explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.attributeContains(element,attribute,value));
    }


    public Double getActualPrice(String priceInString){
        //remove dollar sign
        priceInString = priceInString.substring(1).trim();
        //convert to double
        return  Double.parseDouble(priceInString);
    }

    public String takeScreenShot(String testCaseName,AppiumDriver driver) throws IOException {

        File screenShot = driver.getScreenshotAs(OutputType.FILE);
        String screenShotPath = System.getProperty("user.dir")+"/reports/"+testCaseName+".png";
        FileUtils.copyFile(screenShot,new File(screenShotPath));

        return screenShotPath;

    }


}
