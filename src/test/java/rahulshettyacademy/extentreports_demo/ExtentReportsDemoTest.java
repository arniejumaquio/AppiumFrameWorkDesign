package rahulshettyacademy.extentreports_demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import rahulshettyacademy.base.AndroidBaseTest;
import rahulshettyacademy.page_objects.android.CartPage;
import rahulshettyacademy.page_objects.android.ProductCataloguePage;

public class ExtentReportsDemoTest extends AndroidBaseTest {

    ProductCataloguePage productCataloguePage;
    CartPage cartPage;
    ExtentReports extentReports;

    @BeforeTest
    public void createReport(){

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports");
        extentSparkReporter.config().setDocumentTitle("Extent Report Demo");
        extentSparkReporter.config().setReportName("Extent Report Demo Test");

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);


    }


    @Test
    public void extentReportsDemoTest(){

          ExtentTest extentTest =  extentReports.createTest("extentReportsDemoTest()");

          formPage.selectCountry("India");
          formPage.fillNameField("Test Name");
          formPage.clickRadioButton("Male");
          productCataloguePage =  formPage.clickLetsShopBtn();
          productCataloguePage.addToCartFirstProduct();
          cartPage = productCataloguePage.clickCartIcon();
          cartPage.longPressPleaseReadOurTAndCBtn();
          cartPage.clickTAndCCloseBtn();
          cartPage.clickSendMeEmailChkbox();
          cartPage.clickVstToWebBtn();



    }


    @Test
    public void extentReportsDemoTest2(){

        ExtentTest extentTest =  extentReports.createTest("extentReportsDemoTest()");

        formPage.goToHomePage();
        formPage.clickLetsShopBtn();

        System.out.println(formPage.getErrorMsg());



    }


    @Test
    public void extentReportsDemoTest3(){

        ExtentTest extentTest =  extentReports.createTest("extentReportsDemoTes3t()");

        formPage.selectCountry("India");
        formPage.fillNameField("Test Name");
        formPage.clickRadioButton("Male");
        productCataloguePage =  formPage.clickLetsShopBtn();



    }

    @AfterTest
    public void generateReport(){
        extentReports.flush();
    }

}
