package rahulshettyacademy.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUtility {

    static ExtentReports extentReports;

    public static ExtentReports getExtentReports(){

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports");
        extentSparkReporter.config().setDocumentTitle("Extent Report Demo");
        extentSparkReporter.config().setReportName("Extent Report Demo Test");

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        return extentReports;

    }

}
