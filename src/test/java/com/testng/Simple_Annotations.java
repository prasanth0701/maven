package com.testng;

	import org.junit.Ignore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@Test(priority=0,enabled=false)
	public void button1() {
		System.out.println("first method deployed");

	}
	
	@Test(dependsOnMethods = "button1")
	private void button2() {
		System.out.println("Second method deployed");

	}
	@Test
	private void button3() {
		System.out.println("third method deployed");

	}
	@BeforeMethod
	private void login() {
		System.out.println("logged-in");
	}
	@AfterMethod
	private void logout() {
		System.out.println("logged-out");
	}

}
