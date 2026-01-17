package rahulshettyacademy.testng_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalLoanTest2 {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("Before method is executed");
    }

    @Test
    public void personalLoanTest(){
        System.out.println("Personal loan test!");
    }


    @Test
    public void personalLoanTest2(){
        System.out.println("Personal loan test2!");
    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("After method is executed");
    }


}
