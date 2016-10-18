package com.GeneralTests;

import com.google.api.client.util.DateTime;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.Date;

import Appium.infrastructure.Driver;

import static junit.framework.Assert.assertEquals;

public class UsingApk {
	@Test
	public void test() throws MalformedURLException {
		Driver.initialize();
String email="bede" +  System.currentTimeMillis();
		Driver.Instance.findElementById("com.bt.bms:id/btnLogin").click();
		Driver.Instance.findElementById("com.bt.bms:id/btnSignUp").click();

        Driver.Instance.findElementById("com.bt.bms:id/edtFirstName").sendKeys("BedeTester");

        Driver.Instance.findElementById("com.bt.bms:id/edtLastName").sendKeys("Ngaruko");

        Driver.Instance.findElementById("com.bt.bms:id/edtEmailId").sendKeys(email + "@testing.com");

        Driver.Instance.findElementById("com.bt.bms:id/edtPassword").sendKeys("password1236");
        Driver.Instance.findElementById("com.bt.bms:id/rightMenu").click();
        Driver.Instance.findElementById("com.bt.bms:id/edtMobile").sendKeys("0952841468977");
        Driver.Instance.findElementById("com.bt.bms:id/rightMenu").click();

       WebElement title=Driver.Instance.findElementById("com.bt.bms:id/txvTitle");
       assertEquals(title.getText(), "PICK A REGION");
		//close the driver
		Driver.Instance.quit();
	}

}
