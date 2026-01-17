package rahulshettyacademy.android.ecommerce_demo.ecommerce_tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;
import rahulshettyacademy.page_objects.android.FormPage;
import rahulshettyacademy.utils.JSONUtility;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ecommerce_TC_2 extends AndroidBaseTest {

    @BeforeMethod(alwaysRun = true)
    public void preCondition(){
       formPage.goToHomePage();
    }

    @Test(priority = 1,groups ={"smoke"})
    public void letsShopErrorTest() {

        formPage.clickLetsShopBtn();
        Assert.assertEquals(formPage.getErrorMsg(),"Please enter your name");

    }


    @Test(priority = 2,dataProvider = "getHomePageData",groups = {"smoke"})
    public void fillFormTest(HashMap<String,String> data)  {

        formPage.selectCountry(data.get("country"));
        formPage.fillNameField(data.get("name"));
        formPage.clickRadioButton(data.get("gender"));
        formPage.clickLetsShopBtn();


    }


    @DataProvider
    public Object[][] getHomePageData() throws IOException {

        List<HashMap<String,Object>> data =  JSONUtility.convertJsonFileToHashMap("homepagetestdata.json");
        return new Object[][] { {data.get(0)},{data.get(1)} };

    }




}
