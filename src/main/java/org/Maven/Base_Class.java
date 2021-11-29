package org.Maven;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

	public static String value;

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
	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void getURL(String url) {
		driver.get(url);
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
	public static void frame(String type,int value) {
		if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame(value);
		}else if (type.equalsIgnoreCase("name")) {
		  String Stringvalue = String.valueOf(value);
		  driver.switchTo().frame(Stringvalue);
			
			
		}
	}
	public static void Dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
	}

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
	public static void scrollUpandDown(WebElement element) {
		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoview();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void explicitWait(WebElement element,int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement expected_element = wait.until(ExpectedConditions.elementToBeClickable(element));
		expected_element.click();

	}

	public static String Particular_Data_From_Excel(String path, int row_index, int cell_index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();

		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int val = (int) numericCellValue;
			value = String.valueOf(val);

		}


		return value;

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

}
