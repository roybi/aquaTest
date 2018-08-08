package testclasses;

import org.testng.annotations.*;

public class testNG_Grouping
{

    @BeforeClass (alwaysRun = true)
    public void setUp() {
        System.out.println("TestNG_TestClass1 -> before class");
    }

    @AfterClass (alwaysRun = true)
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

    @Test(groups = {"cars", "suv"})
    public void testBMWX6() {
        System.out.println("Running Test - BMX X6");
    }

    @Test(groups = {"cars","sadan"})
    public void testAudiA6() {
        System.out.println("Running Test - Audi  A6");
    }

    @Test (groups = {"bikes"})
    public void testNinja() {
        System.out.println("Running Test - kwasaki Ninja");
    }
    @Test(groups = {"bikes"})
    public void testHondaCBR() {
        System.out.println("Running Test - Honda CBR");
    }
}
