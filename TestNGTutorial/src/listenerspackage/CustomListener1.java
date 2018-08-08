package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {


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
}

