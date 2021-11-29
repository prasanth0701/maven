package org.lao.testng;

import org.testng.annotations.Test;

public class Grouping_Class {
	@Test(groups = "apple")
	private void apple1() {
		System.out.println("apple model 1");
	}

	@Test(groups = "apple")
	private void apple2() {
		System.out.println("apple model 2");
	}

	@Test(groups = "vivo")
	private void vivo1() {
		System.out.println("vivo model 1");
	}

	@Test(groups = "vivo")
	private void vivo2() {
		System.out.println("vivo model 2");
	}

	@Test(groups = "redmi")
	private void redmi1() {
		System.out.println("redmi model 1");
	}

	@Test(groups = "redmi")
	private void redmi2() {
		System.out.println("redmi model 2");
	}

	@Test(groups = "samsung")
	private void samsung1() {
		System.out.println("samsung model 1");
	}

	@Test(groups = "samsung")
	private void samsung2() {
		System.out.println("samsung model 2");
	}
}
