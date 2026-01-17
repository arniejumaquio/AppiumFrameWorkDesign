package rahulshettyacademy.android.ecommerce_demo.ecommerce_tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;
import rahulshettyacademy.page_objects.android.CartPage;
import rahulshettyacademy.page_objects.android.FormPage;
import rahulshettyacademy.page_objects.android.ProductCataloguePage;

import java.time.Duration;
import java.util.List;

public class Ecommerce_TC_1 extends AndroidBaseTest {

    @Test(priority = 1)
    public void letsShopErrorTest() {


        formPage.clickLetsShopBtn();

        Assert.assertEquals(formPage.getErrorMsg(),"Please enter your name");

    }


    @Test(priority = 2)
    public void fillFormTest()  {

        String country ="Andorra";
        String name = "Test Name";

        FormPage formPage = new FormPage(driver);
        formPage.selectCountry(country);
        formPage.fillNameField(name);
        formPage.clickRadioButton("female");
        formPage.clickLetsShopBtn();


    }


    @Test(priority = 3)
    public void addProductTest() throws InterruptedException {

        String productToAdd = "Nike SFB Jungle";
        ProductCataloguePage productCataloguePage = new ProductCataloguePage(driver);
        productCataloguePage.addToCart(productToAdd);

        //cart screen
        CartPage cartPage  = productCataloguePage.clickCartIcon();
        cartPage.waitForCartScreenTitle("text","Cart");
        Assert.assertEquals(cartPage.getProductName(),productToAdd);

    }


    @Test(priority = 4)
    public void totalPriceTest() throws InterruptedException {

        CartPage cartPage = new CartPage(driver);
        ProductCataloguePage productCataloguePage = cartPage.clickCartScreenBackBtn();
        productCataloguePage.scrollToFirstProduct();
        productCataloguePage.addToCartFirstProduct();

        cartPage = productCataloguePage.clickCartIcon();
        Assert.assertEquals(cartPage.getTotalPrice(),cartPage.getTotalPurchaseAmount());
        cartPage.longPressPleaseReadOurTAndCBtn();
        Assert.assertEquals(cartPage.getTAndCTitle(), "Terms Of Conditions");
        Assert.assertEquals(cartPage.gettAndCText(),"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        cartPage.clickTAndCCloseBtn();
        cartPage.clickSendMeEmailChkbox();
        cartPage.clickVstToWebBtn();


    }

    @Test(priority = 5)
    public void webViewTest() throws InterruptedException {

        WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(190));
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


}
