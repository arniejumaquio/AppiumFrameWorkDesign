package rahulshettyacademy.testng_demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoanTest {

    @Parameters({"webUrl"})
    @Test
    public void webLoginHomeLoan(String url) {
        System.out.println("web login home loan "+url);
    }

    @Parameters({"mobilepackage"})
    @Test
    public void mobileLoginHomeLoan(String packageName){
        System.out.println("mobile login home loan");
        System.out.println("Package name ="+packageName);
    }

    @Test(groups={"Smoke"})
    public void apiLoginHomeLoan() {
        System.out.println("api login home loan");
    }

    @AfterSuite(alwaysRun = true)
    public void teardown(){
        System.out.println("After Suite is executed");
    }
}
