package testclasses;

import listenerspackage.CustomListener1;
import listenerspackage.CustomListener2;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners( CustomListener2.class)

public class TestNG_ListenerTest2 {



	@BeforeClass
	public void setUp() {
		System.out.println("  TestNG_ListenerTest2 -> This runs once before class");

	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println(" TestNG_ListenerTest2 -> This runs once after class");
	}
	

	@Test
	public void testMethod1() {
		System.out.println("  TestNG_ListenerTest2 -> testMethod1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("  TestNG_ListenerTest2 -> testMethod2");
		Assert.assertTrue(false);
	}
}