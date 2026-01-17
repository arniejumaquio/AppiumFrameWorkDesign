package rahulshettyacademy.android.ecommerce_demo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;
import java.time.Duration;
import java.util.List;

public class Ecommerce_TC_1 {

    /**
    @Test(priority = 1)
    public void letsShopErrorTest() {

        WebElement letsShopBtn = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]"));
        letsShopBtn.click();

        WebElement errorMessage = driver.findElement(AppiumBy.xpath("(//android.widget.Toast)[1]"));
        Assert.assertEquals(errorMessage.getAttribute("name"),"Please enter your name");

    }


    @Test(priority = 2)
    public void fillFormTest()  {

        WebElement countryDropdown = driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']"));
        countryDropdown.click();

        String country ="Andorra";
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+country+"\"))"));
        WebElement countryOption = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+country+"']"));
        countryOption.click();

        String name = "Test Name";
        WebElement yourNameField = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
        yourNameField.sendKeys(name);
        driver.hideKeyboard();

        WebElement femaleRadioBtn = driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']"));
        femaleRadioBtn.click();

        WebElement letsShopBtn = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]"));
        letsShopBtn.click();


    }


    @Test(priority = 3)
    public void addProductTest() throws InterruptedException {

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String productToAdd = "Nike SFB Jungle";
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+productToAdd+"\"))"));

        List<WebElement> productNames = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']"));
        for(int i = 0; i < productNames.size();i++){

            if(productNames.get(i).getText().equalsIgnoreCase(productToAdd)){

                List<WebElement> addToCartButtons = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']"));
                addToCartButtons.get(i).click();
                break;
            }

        }


        WebElement cartIcon = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
        cartIcon.click();

        //cart screen
        explicitWait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/toolbar_title")),"text","Cart"));
       String cartProductName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\"]")).getText();
       Assert.assertEquals(cartProductName,productToAdd);

    }


//    @Test(priority = 4)
//    public void totalPriceTest() throws InterruptedException {
//
//        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement cartScreenBackBtn = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_back"));
//        cartScreenBackBtn.click();
//
//         //here
//        //scrollToTop();
//        List<WebElement> addToCartBtns = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"]"));
//        addToCartBtns.get(0).click();
//
//
//        WebElement cartIcon = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
//        cartIcon.click();
//
//        List<WebElement> prices = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice"));
//        double actualSum = 0;
//        for(int i = 0;i < prices.size();i++){
//           String priceStr = prices.get(i).getText();
//            double price = getActualPrice(priceStr);
//
//            actualSum += price;
//        }
//
//
//        String totalPurchaseAmountStr = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//        double expectedSum = getActualPrice(totalPurchaseAmountStr);
//
//
//        Assert.assertEquals(actualSum,expectedSum);
//
//
//        WebElement pleseReadOurTAndCBtn = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/termsButton\"]"));
//        longPress(pleseReadOurTAndCBtn);
//
//        WebElement tAndCTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Terms Of Conditions']"));
//        WebElement tAndCText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/message']"));
//        WebElement tAndCCloseBtn = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='CLOSE']"));
//
//        Assert.assertEquals(tAndCTitle.getText(), "Terms Of Conditions");
//        Assert.assertEquals(tAndCText.getText(),"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
//        tAndCCloseBtn.click();
//
//        WebElement sendMeEmailChkbox = driver.findElement(AppiumBy.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]"));
//        sendMeEmailChkbox.click();
//        WebElement vstToWebBtn = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed"));
//        vstToWebBtn.click();


    }

    @Test(priority = 5)
    public void webViewTest() throws InterruptedException {

        Thread.sleep(5_000);

        //NATIVE_APP
        //switch to webview context
        driver.context("WEBVIEW_com.androidsample.generalstore");
        WebElement googleSearchBar = driver.findElement(By.name("q"));
        googleSearchBar.sendKeys("ears and rhyme video");
        googleSearchBar.sendKeys(Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[text()='December Avenue - Ears And Rhymes']")).click();
        driver.findElement(By.xpath("//div[@class='ytp-unmute-icon']")).click();


        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        //switch to native app context
        driver.context("NATIVE_APP");

    }
**/

}
