package listenerspackage;

import org.testng.*;

public class CustomListenerS implements IInvokedMethodListener, ITestListener,ISuiteListener  {

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        // Before every method in the Class
        System.out.println("Before infokation " + iTestResult.getTestClass().getName() +
                " = > "+ iInvokedMethod.getTestMethod().getMethodName());

    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        // After every method in the Class
        System.out.println("After infokation " + iTestResult.getTestClass().getName() +
                " = > "+ iInvokedMethod.getTestMethod().getMethodName());
    }


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

    @Override
    public void onStart(ISuite iSuite) {
        // When <suite> tag Start
        System.out.println("onStart: Before suite start");
    }

    @Override
    public void onFinish(ISuite iSuite) {
        // When <suite> tag Finish
        System.out.println("onFinish: After suite start");
    }


}

