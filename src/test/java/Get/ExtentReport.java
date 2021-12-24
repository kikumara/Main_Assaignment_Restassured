package Get;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentreport.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test= extent.createTest("Myfirst test,this test is to validate products is available or not");
        ExtentTest test2 =extent.createTest("Test to validate users");
        ExtentTest test3= extent.createTest("Test to validate Carts");
        ExtentTest test4=extent.createTest("Test to validate updated products");
    }
}
