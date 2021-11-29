package org.lao.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	/*
	 * Object [][] data={
	 * 
	 * {"pras",45136}, {"fty",56546}
	 * 
	 * };
	 * 
	 * 
	 * 
	 * @DataProvider(name="logindata") private Object[][] data() { return data;
	 * 
	 * }
	 */
	
	@DataProvider
	private Object[][] logindata()  {
		return new Object[][] {
			
			{"pras",45136},
			{"fty",56546}
			
		};

	}

	
	
	
	@Test(dataProvider = "logindata")
	private void login(String name, int password) {
		System.out.println("Enter the name : "+name);
		System.out.println("Enter the password : "+password);


	}

}
