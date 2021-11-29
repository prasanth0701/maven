package org.lao.testng;

import org.testng.annotations.Test;

public class DependencyManagement {
	@Test()
	private void tenth() {

	}

	@Test(dependsOnMethods="tenth",enabled=true)
	private void highSchool() {

	}

	@Test(dependsOnMethods="highSchool")
	private void college() {

	}
	@Test(dependsOnMethods="college")
	private void companytrainees() {

	}
	@Test(dependsOnMethods="companytrainees")
	private void managers() {

	}
}
