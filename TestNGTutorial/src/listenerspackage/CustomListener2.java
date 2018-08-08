package listenerspackage;

import org.testng.*;

public class CustomListener2 implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        // When test method starts
        System.out.println("onTest Start =>  test Name "+ iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        // When test method Success
        System.out.println("on Test Success =>  test Name "+ iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        // When test method Failed
        System.out.println("on Test Failed =>  test Name "+ iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        // If test method is failed
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        //Ignore  this
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        // before <test> tag of xml file
        System.out.println(" On start ->  Test tag name : " + iTestContext.getName());
        ITestNGMethod method []=iTestContext.getAllTestMethods();
        System.out.println(" These methods will be executed in this test tag: ");
        for (ITestNGMethod method1:method)
        {
            System.out.println(method1.getMethodName());
        }

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        //After <test? tag of xml file
        System.out.println(" onFinish -> Test tag name : "+ iTestContext.getName());

    }
}

