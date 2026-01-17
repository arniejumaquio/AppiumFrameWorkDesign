package rahulshettyacademy.page_objects.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import rahulshettyacademy.utils.AndroidActions;

public class FormPage extends AndroidActions {


    @AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']")
    private WebElement countryDropdown;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement yourNameField;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Male']")
    private WebElement maleRadioBtn;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Female']")
    private WebElement femaleRadioBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]")
    private WebElement letsShopBtn;
    @AndroidFindBy(xpath ="(//android.widget.Toast)[1]")
    private WebElement errorMsg;

    public FormPage(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void goToHomePage(){
        String appPackage = "com.androidsample.generalstore";
        ((AndroidDriver)driver).terminateApp(appPackage);
        ((AndroidDriver)driver).activateApp(appPackage);
    }


    public void selectCountry(String country){

        countryDropdown.click();
        scrollIntoView(country);
        WebElement countryOption = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+country+"']"));
        countryOption.click();
    }

    public void fillNameField(String name){
        yourNameField.sendKeys(name);
        ((AndroidDriver)driver).hideKeyboard();
    }

    public void clickRadioButton(String gender){

        if(gender.equalsIgnoreCase("female")){
            femaleRadioBtn.click();
        }else{
            maleRadioBtn.click();
        }

    }


    public ProductCataloguePage clickLetsShopBtn(){
        letsShopBtn.click();

        return new ProductCataloguePage(driver);

    }

    public String getErrorMsg(){

        return errorMsg.getText();
    }





}
