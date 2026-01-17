package rahulshettyacademy.page_objects.ios;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import rahulshettyacademy.utils.IOSActions;

public class HomePage extends IOSActions {

    public HomePage(IOSDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`value==\"Alert Views\"`]")
    private WebElement alertViewsMenu;


    public AlertViewsPage clickAlertViewsMenu(){
        alertViewsMenu.click();

        return new AlertViewsPage(driver);
    }

}
