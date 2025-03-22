package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
       // TestLogger.info("===== Starting Test Execution: " + context.getName() + " =====");
    }

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        TestLogger.setTestContext(testName);
        TestLogger.info("---- Starting test: " + testName + " ----");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        TestLogger.info("---- Test Passed: " + result.getMethod().getMethodName() + " ----");
        TestLogger.clearTestContext();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        TestLogger.info("---- Test Failed: " + result.getMethod().getMethodName() + " ----");
        TestLogger.clearTestContext();
    }

    @Override
    public void onFinish(ITestContext context) {
     //   TestLogger.info("===== Finish Test Execution: " + context.getName() + " =====\n");
    }
}