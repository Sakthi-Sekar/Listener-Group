package com.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases {
	@Test
	public void testtopass() {
		Assert.assertTrue(false);
	}

	@Test
	public void testtofail() {
		Assert.assertFalse(false);
	}
}