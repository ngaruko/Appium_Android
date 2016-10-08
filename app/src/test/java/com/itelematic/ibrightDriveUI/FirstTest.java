package com.itelematic.ibrightDriveUI;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Test;

import Appium.infrastructure.Driver;

public class FirstTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Driver.Instance.quit();
	}

	@Test
	public void test() throws MalformedURLException {
		Driver.initialize();

	}

}
