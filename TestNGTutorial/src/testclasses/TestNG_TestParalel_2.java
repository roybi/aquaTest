package testclasses;

import org.testng.annotations.Test;

public class TestNG_TestParalel_2 {
	

	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("TestNG_TestParalel_2 -> testMethod1");
		Thread.sleep(6000);
		System.out.println("TestNG_TestParalel_2 -> testMethod1 -> More Steps");
	}
	
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_TestParalel_2 -> testMethod2");
		Thread.sleep(6000);
		System.out.println("TestNG_TestParalel_2 -> testMethod2 -> More Steps");
	}
}