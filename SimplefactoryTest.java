package com.listeners;

import org.testng.annotations.Factory;

public class SimplefactoryTest {

	 @Factory
	   public Object[] factoryMethod() {
	       return new Object[] { new factory(10), new factory(10) };
	   }
	}


