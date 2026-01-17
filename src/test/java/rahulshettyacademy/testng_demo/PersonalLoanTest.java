package rahulshettyacademy.testng_demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PersonalLoanTest {

    @BeforeSuite
    public void setup(){
        System.out.println("Before Suite is executed");
    }


    @Test
    public void personalLoanTest(){
        System.out.println("Personal loan test!");
    }


    @Test
    public void personalLoanTest2(){
        System.out.println("Personal loan test2!");
    }


}
