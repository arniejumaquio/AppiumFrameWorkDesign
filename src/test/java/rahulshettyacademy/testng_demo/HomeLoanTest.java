package rahulshettyacademy.testng_demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class HomeLoanTest {

    @Test
    public void webLoginHomeLoan() {
        System.out.println("web login home loan");
    }

    @Test
    public void mobileLoginHomeLoan(){
        System.out.println("mobile login home loan");
    }

    @Test
    public void apiLoginHomeLoan() {
        System.out.println("api login home loan");
    }

    @AfterSuite
    public void teardown(){
        System.out.println("After Suite is executed");
    }
}
