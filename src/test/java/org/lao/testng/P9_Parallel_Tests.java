package org.lao.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P9_Parallel_Tests {
	@Test
	private void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.quit();
	}
	
	  @Test 
	  private void openBing() { 
		  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\Prasanth SP\\\\eclipse-workspace\\\\Maven\\\\Driver\\\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	   driver.get("https://www.bing.com");
	  
	  }

	  @Test
	  private void openAdactin() {
		  System.setProperty("webdriver.chrome.driver",
			  "C:\\\\Users\\\\Prasanth SP\\\\eclipse-workspace\\\\Maven\\\\Driver\\\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	   driver.get("https://adactinhotelapp.com/");
	  

	}
	  @Test
	  private void openAutomation() {
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\\\Users\\\\Prasanth SP\\\\eclipse-workspace\\\\Maven\\\\Driver\\\\chromedriver.exe");
				   WebDriver driver=new ChromeDriver(); 
				   driver.get("http://automationpractice.com/index.php");
				  
	}
	 
}
