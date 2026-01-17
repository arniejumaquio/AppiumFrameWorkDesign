package rahulshettyacademy.testng_demo;

import org.testng.annotations.*;

public class CarLoanTest {

    @BeforeTest(alwaysRun = true)
    public void prerequisite(){
        System.out.println("Before Test is executed!");
    }

    //@Parameters({"webUrl"})
    @Test(dependsOnMethods = "apiLoginCarLoan",timeOut=50000,dataProvider = "getDataSets")
    public void webLoginCarLoan(String username,String password){
        //System.out.println("web login car loan url "+url);
        System.out.println("username = "+username);
        System.out.println("password = "+password);
    }

    @Parameters({"mobilepackage"})
    @Test
    public void mobileLoginCarLoan(String packageName){
        System.out.println("mobile login car loan");
        System.out.println("Package name ="+packageName);
    }

    @Test(groups={"Smoke"})
    public void apiLoginCarLoan(){
        System.out.println("api login car loan");
    }


    @AfterTest(alwaysRun = true)
    public void cleanup(){
        System.out.println("After Test is executed!");
    }


    @DataProvider
    public Object[][] getDataSets(){

        Object[][] testData = new Object[3][2];

        testData[0][0] = "testusername";
        testData[0][1] = "testpassword";
        testData[1][0] = "testusername2";
        testData[1][1] = "testpassword2";
        testData[2][0] = "testusername3";
        testData[2][1] = "testpassword3";

        return testData;

    }

}
