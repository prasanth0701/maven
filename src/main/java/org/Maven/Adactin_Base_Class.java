package org.Maven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Adactin_Base_Class {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsertype) {
		if (browsertype.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsertype.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new FirefoxDriver();

		}
		return driver;
	}

	public static void getURL(String url) {
		driver.get(url);
	}

	public static void max() {
		driver.manage().window().maximize();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public static void inputValueElement(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	// register page
	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public static void selectByIndex(WebElement element, int number) {
		Select select = new Select(element);
		select.selectByIndex(number);
	}

	public static void clearAndInput(WebElement element, String date) {
		element.clear();
		element.sendKeys(date);

	}
	public static void explicitWait(WebElement element,int seconds) {
	 WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement expected_element = wait.until(ExpectedConditions.elementToBeClickable(element));
		expected_element.click();

}
	
	
	

	
	public static void explicitWaitForAlert(int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	private void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void screenshot() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\ScreenShot\\adactin1.png");
		FileUtils.copyFile(source, des);

	}

}
