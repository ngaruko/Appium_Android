package com.GeneralTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import Appium.infrastructure.Driver;

import static org.junit.Assert.assertEquals;

public class UsingApk {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws MalformedURLException {
		Driver.initialize();
		Driver.Instance.findElementById("com.bt.bms:id/btnLogin").click();
		Driver.Instance.findElementById("com.bt.bms:id/btnSignUp").click();


        Driver.Instance.findElementById("com.bt.bms:id/edtFirstName").sendKeys("BedeTester");

        Driver.Instance.findElementById("com.bt.bms:id/edtLastName").sendKeys("Ngaruko");

        Driver.Instance.findElementById("com.bt.bms:id/edtEmailId").sendKeys("bedenhhgaruko@testing.com");

        Driver.Instance.findElementById("com.bt.bms:id/edtPassword").sendKeys("password1236");
        Driver.Instance.findElementById("com.bt.bms:id/rightMenu").click();
        Driver.Instance.findElementById("com.bt.bms:id/edtMobile").sendKeys("0952841468977");
        Driver.Instance.findElementById("com.bt.bms:id/rightMenu").click();


       WebElement title=Driver.Instance.findElementById("com.bt.bms:id/txvTitle");
       assertEquals(title.getText(), "PICK A REGION");

	}

}
