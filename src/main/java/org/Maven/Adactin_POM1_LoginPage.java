package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_POM1_LoginPage{
	public static WebDriver driver;
	
	public Adactin_POM1_LoginPage(WebDriver abc) {
		this.driver=abc;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="username")
	private WebElement name;
	
	@FindBy(id="password")
	private WebElement pwrd;
	
	@FindBy(id="login")
	private WebElement loginbutton;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPwrd() {
		return pwrd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
}
