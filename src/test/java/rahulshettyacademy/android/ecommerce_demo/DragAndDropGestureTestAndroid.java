package rahulshettyacademy.android.ecommerce_demo;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;

public class DragAndDropGestureTestAndroid extends AndroidBaseTest {

    @Test
    public void dragAndDropGestureTest() throws InterruptedException {

       WebElement viewSection = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
       viewSection.click();
       WebElement dragAndDropSection = driver.findElement(AppiumBy.accessibilityId("Drag and Drop"));
       dragAndDropSection.click();

       WebElement firstCircle = driver.findElement(AppiumBy.xpath("(//android.view.View)[1]"));
       //dragAndDrop(firstCircle,615,640);

       WebElement dropText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dropped!']"));
        Assert.assertEquals(dropText.getText(),"Dropped!");

    }

}
