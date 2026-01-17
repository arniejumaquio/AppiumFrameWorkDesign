package rahulshettyacademy.page_objects.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import rahulshettyacademy.utils.AndroidActions;

import java.util.List;

public class CartPage extends AndroidActions {

@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\"]")
private WebElement cartProductName;

@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_back")
private WebElement cartScreenBackBtn;

@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
private List<WebElement> prices;

@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
private WebElement totalPurchasedAmount;

@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/termsButton\"]" )
private  WebElement pleseReadOurTAndCBtn;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms Of Conditions']")
private WebElement tAndCTitle;

@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
WebElement tAndCText;

@AndroidFindBy(xpath ="//android.widget.Button[@text='CLOSE']" )
WebElement tAndCCloseBtn;

@AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]")
WebElement sendMeEmailChkbox;

@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
WebElement vstToWebBtn;


public CartPage(AndroidDriver driver){
    super(driver);
    PageFactory.initElements(new AppiumFieldDecorator(driver),this);
}


public String getProductName(){
    return cartProductName.getText();
}


public void waitForCartScreenTitle(String attribute,String value){
        waitForElementForAttribContains(driver,screenTitle,attribute,value);
    }

public ProductCataloguePage clickCartScreenBackBtn(){
        cartScreenBackBtn.click();

        return  new ProductCataloguePage(driver);


}


public double getTotalPrice(){

    double totalPrice = 0;
    for(int i = 0;i < prices.size();i++){
        String priceStr = prices.get(i).getText();
        double price = getActualPrice(priceStr);

        totalPrice += price;
    }

    return totalPrice;

}


public double getTotalPurchaseAmount(){

    double totalPurchaseAmount = getActualPrice(totalPurchasedAmount.getText());

    return totalPurchaseAmount;
}

public void longPressPleaseReadOurTAndCBtn(){
    longPress(pleseReadOurTAndCBtn);
}


public String getTAndCTitle(){
    return tAndCTitle.getText();
}

public String gettAndCText(){
    return tAndCText.getText();
}


public void clickTAndCCloseBtn(){
    tAndCCloseBtn.click();
}

public void clickSendMeEmailChkbox(){
    sendMeEmailChkbox.click();
}


public void clickVstToWebBtn(){
    vstToWebBtn.click();
}

}
