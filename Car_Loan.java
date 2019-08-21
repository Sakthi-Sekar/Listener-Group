package com.grouping;

import org.testng.annotations.Test;

public class Car_Loan {
	@Test(groups="carloan1")
	public void WebLogin() {

		System.out.println("User Web Login");
	}

	@Test(groups ="carloan2")
	public void MobileLogin() {

		System.out.println("User Mobile Login");
	}

	@Test(groups ="carloan3")
	public void APILogin() {
		System.out.println("User API login ");
	}
}
