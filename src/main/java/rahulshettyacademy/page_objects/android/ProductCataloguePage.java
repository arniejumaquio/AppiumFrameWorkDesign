package rahulshettyacademy.page_objects.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import rahulshettyacademy.utils.AndroidActions;

import java.time.Duration;
import java.util.List;

public class ProductCataloguePage extends AndroidActions {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']")
    List<WebElement> productNames;

    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")
    List<WebElement> addToCartButtons;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    WebElement cartIcon;

    public ProductCataloguePage(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    public void addToCart(String productToAdd){

        scrollIntoView(productToAdd);

        for(int i = 0; i < productNames.size();i++){

            if(productNames.get(i).getText().equalsIgnoreCase(productToAdd)){
                addToCartButtons.get(i).click();
                break;
            }
        }

    }

    
    public CartPage clickCartIcon(){
        cartIcon.click();

        return  new CartPage(driver);
    }

    public void scrollToFirstProduct(){
       scrollToTop();
    }

    public void addToCartFirstProduct(){
        addToCartButtons.get(0).click();
    }


}
