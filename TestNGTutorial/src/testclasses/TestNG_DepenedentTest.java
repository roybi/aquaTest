package testclasses;

import org.testng.Assert;
import org.testng.annotations.*;
import appcode.SomeClassToTest;



public class TestNG_DepenedentTest
{

    SomeClassToTest obj;

    @BeforeClass
    public void setUp() {
        System.out.println("  before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("  after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("  before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("  after method");
    }

    @Test (dependsOnMethods = {"testMethod2"},alwaysRun = true)

    public void testMethod1() {
        System.out.println("TestNG_TestClass1 -> testMethod1");

    }

    @Test
    public void testMethod2() {
        System.out.println("testMethod2");
        int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test (dependsOnMethods = {"testMethod1"})
    public void testMethod3() {
        System.out.println("TestNG_TestClass1 -> testMethod3");
    }

    @Test (dependsOnMethods = {"testMethod3"})
    public void testMethod4() {
        System.out.println("TestNG_TestClass1 -> testMethod4");
    }
}
