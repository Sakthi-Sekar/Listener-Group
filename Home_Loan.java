package com.grouping;

import org.testng.annotations.Test;

public class Home_Loan {
	@Test(priority=1,groups ="homeloan1")
	public void WebLogin() {

		System.out.println("User Web Login");
	}

	@Test(priority=3,groups ="homeloan2")
	public void MobileLogin() {

		System.out.println("User Mobile Login");
	}

	@Test(priority=2,groups ="homeloan3")
	public void APILogin() {
		System.out.println("User API login ");
	}
}
