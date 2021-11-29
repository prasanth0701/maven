package com.sdp;

import org.Maven.Adactin_POM1_LoginPage;
import org.Maven.Adactin_POM2_RoomBookPage;
import org.Maven.Adactin_POM3_RegisterPage;
import org.openqa.selenium.WebDriver;

public class Page_Object_manager_Adactin {
	public WebDriver driver;

	private Adactin_POM1_LoginPage lp;
	private Adactin_POM2_RoomBookPage rbp;
	private Adactin_POM3_RegisterPage rp;

	public Page_Object_manager_Adactin(WebDriver driver2) {
		this.driver = driver2;
	}

	public Adactin_POM1_LoginPage getInstanceLp() {
		if (lp == null) {
			lp = new Adactin_POM1_LoginPage(driver);
		}
		return lp;

	}

	public Adactin_POM2_RoomBookPage getInstanceRbp() {
		if (rbp == null) {
			rbp = new Adactin_POM2_RoomBookPage(driver);

		}
		return rbp;
	}

	public Adactin_POM3_RegisterPage getInstanceRp() {
		if (rp == null) {
			rp = new Adactin_POM3_RegisterPage(driver);
		}
		return rp;

	}
}
