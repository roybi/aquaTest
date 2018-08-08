package listenerspackage;

import org.testng.*;

public class CustomListener3 implements ISuiteListener {


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

