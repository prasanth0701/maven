package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Elements {
	public WebDriver driver;
	
	public POM_Elements(WebDriver driver2) {
		this.driver=driver2;
				PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	private WebElement clickcart;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClickcart() {
		return clickcart;
	}

	public WebElement getProceedbutton() {
		return proceedbutton;
	}

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedbutton;

	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkoutbutton;

	@FindBy(id="email_create")
	private WebElement email;

	@FindBy(name="SubmitCreate")
	private WebElement submit;
	
	@FindBy(id="customer_firstname")
	private WebElement fname;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getPassword() {
		return password;
	}

	


	@FindBy(id="customer_lastname")
	private WebElement lname;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	private WebElement date;

	@FindBy(id="months")
	private WebElement month;

	@FindBy(xpath="//select[@id='years']")
	private WebElement years;
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2;

	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	private WebElement state;

	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postcode;

	@FindBy(id="other")
	private WebElement otherss;

	public WebElement getOtherss() {
		return otherss;
	}



	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement phone_no;

	@FindBy(xpath="//input[@id='alias']")
	private WebElement street;

	@FindBy(xpath="//button[@id='submitAccount']")
	private WebElement submit2;

	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
	private WebElement proceed2;

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getProceed3() {
		return proceed3;
	}



	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkboxbutton;

	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
	private WebElement proceed3;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit3;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	
	public WebElement getBankwire() {
		return bankwire;
	}



	@FindBy(xpath="//div[@class='box']")
	private WebElement purchasestatement;
	
	
	
	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	
	public WebElement getPhone_no() {
		return phone_no;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getSubmit2() {
		return submit2;
	}

	

	public WebElement getCheckboxbutton() {
		return checkboxbutton;
	}

	
	public WebElement getSubmit3() {
		return submit3;
	}

	public WebElement getPurchasestatement() {
		return purchasestatement;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYears() {
		return years;
	}

}



