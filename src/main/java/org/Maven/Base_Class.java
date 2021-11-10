package org.Maven;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//gecko.exe");
			driver = new FirefoxDriver();

		}
		return driver;

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void selectByIndex(WebElement element, int number) {
		Select select = new Select(element);
	    select.selectByIndex(number);
		
	}

	public static void selectByIndex1(WebElement element, int value ) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}
	
	public static void selectByValue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}
	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void getURL(String url) {
		driver.get(url);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("The Title of the current page is :"+title);
	}
	
	public static void getElementText(WebElement element) {
		String text = element.getText();
		System.out.println("The text in the Element :"+text);
		}
	public static void keyboard_action() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		
		
	}
	
	
	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}
	public static void scrollUpandDown(WebElement element) {
		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoview();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//element to be clickabel
	public static void explicitwait(WebElement ele,int seconds) {
		WebDriverWait wait=new WebDriverWait(driver,seconds);
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(ele));
		button.click();
	}
	public static void sleep() throws InterruptedException{
		Thread.sleep(2000);
	}
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
}
