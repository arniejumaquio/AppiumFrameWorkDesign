package rahulshettyacademy.android.ecommerce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import rahulshettyacademy.base.BrowserBaseTest;

public class MobileBrowserTest extends BrowserBaseTest {

    @Test
    public void mobileBrowserTest() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        WebElement hamburgerIcon = driver.findElement(By.cssSelector("button[data-target='#navbarSupportedContent']"));
        hamburgerIcon.click();

        WebElement products = driver.findElement(By.cssSelector("a[routerlink='/products']"));
        products.click();

        WebElement devOpsCourse = driver.findElement(By.xpath("//a[text()='Devops']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", devOpsCourse);
        devOpsCourse.click();
    }



}
