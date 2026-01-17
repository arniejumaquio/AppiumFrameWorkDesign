package rahulshettyacademy.page_objects.ios;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import rahulshettyacademy.utils.IOSActions;

public class AlertViewsPage extends IOSActions {


    @iOSXCUITFindBy(iOSNsPredicate="label == \"Text Entry\" AND type == \"XCUIElementTypeStaticText\"")
    private WebElement textEntry;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement messageField ;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='OK' and name=='OK'`]")
    private  WebElement okButton;

    @iOSXCUITFindBy(iOSNsPredicate ="value BEGINSWITH[c] \"Confirm\"" )
    private WebElement confirmCancel;

    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH[c] \"A message\"")
    private WebElement confirmCancelText;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Confirm\" AND name ENDSWITH[c] \"firm\"")
    private WebElement confirmButton;


    public AlertViewsPage(IOSDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clickTextEntry(){
        textEntry.click();
    }

    public void fillMessageField(String message){
        messageField.sendKeys(message);
    }

    public void clickOkButton(){
        okButton.click();
    }

    public void clickConfirmCancel(){
        confirmCancel.click();
    }


    public String getConfirmCancelText(){
        return confirmCancelText.getText();
    }

    public void clickConfirmButton(){
        confirmButton.click();
    }


}
