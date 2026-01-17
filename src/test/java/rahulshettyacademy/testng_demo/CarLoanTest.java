package rahulshettyacademy.testng_demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoanTest {

    @BeforeTest
    public void prerequisite(){
        System.out.println("Before Test is executed!");
    }

    @Test
    public void webLoginCarLoan(){
        System.out.println("web login car loan");
    }

    @Test
    public void mobileLoginCarLoan(){
        System.out.println("mobile login car loan");
    }

    @Test
    public void apiLoginCarLoan(){
        System.out.println("api login car loan");
    }


    @AfterTest
    public void cleanup(){
        System.out.println("After Test is executed!");
    }

}
