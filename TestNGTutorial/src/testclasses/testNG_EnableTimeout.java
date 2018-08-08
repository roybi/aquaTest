package testclasses;

import org.testng.annotations.*;

public class testNG_EnableTimeout
{

    @BeforeClass
    public void setUp() {
        System.out.println("TestNG_TestClass1 -> before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("TestNG_TestClass1 -> after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("TestNG_TestClass1 -> before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("TestNG_TestClass1 -> after method");
    }

    @Test(enabled = false)
    public void testMethod1() {
        System.out.println("TestNG_TestClass1 -> testMethod1");
    }

    @Test(timeOut = 100 )// applay timeout for the test
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG_TestClass1 -> testMethod2");
        Thread.sleep(200);
    }


}
