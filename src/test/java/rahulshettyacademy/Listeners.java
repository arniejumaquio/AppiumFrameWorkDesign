package rahulshettyacademy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import rahulshettyacademy.utils.AppActions;
import rahulshettyacademy.utils.ReportUtility;

import java.io.IOException;

public class Listeners extends AppActions implements ITestListener {

    ExtentReports extentReports =   ReportUtility.getExtentReports();;
    ExtentTest extentTest;
    AppiumDriver driver;

    @Override
     public void onTestStart(ITestResult result) {

      extentTest =  extentReports.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.fail(result.getThrowable());
        try {
            driver = (AppiumDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        try {
            extentTest.addScreenCaptureFromPath(takeScreenShot(result.getMethod().getMethodName(),driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }


}
