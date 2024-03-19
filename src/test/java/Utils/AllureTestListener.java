package Utils;

import com.mifmif.common.regex.Main;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import io.qameta.allure.Allure;

public class AllureTestListener implements ITestListener {

    private Main AllureCommandLine;

    @Override
    public void onStart(ITestContext context) {
        // Not used
    }

    @Override
    public void onFinish(ITestContext context) {
        // Not used
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Not used
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Not used
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Not used
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Not used
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not used
    }

    public void onStart(ISuite suite) {
        // Not used
    }

    public void onFinish(ISuite suite) {
        // Generate Allure report
        AllureCommandLine.main(new String[]{"serve", "allure-results"});
    }
}