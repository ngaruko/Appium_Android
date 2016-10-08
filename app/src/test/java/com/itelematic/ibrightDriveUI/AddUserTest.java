package com.itelematic.ibrightDriveUI;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Dashboard.screens.DashboardMainScreen;
import Dashboard.screens.SignInScreen;
import Dashboard.screens.SignOutScreen;
import Navigation.MenuSelector;

public class AddUserTest extends SignInProcessTest {
	/*
	 * *add a user. check if user is signed in then remove the added user for
	 * other tests
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		signIn();
		MenuSelector.AddUser();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Sign out the second user.
		SignOutScreen.signOut(1);
	}

	@Test
	public void UserCanLogIn() {
		if (SignInScreen.IsAt())
			SignInScreen.enterSecondPinCode();
		assertTrue(DashboardMainScreen.isHome());
	}

	@Test
	public void DeviceGoesToSignInScreen() {
		MenuSelector.SignOutUser();

		assertTrue(SignOutScreen.getUser().equals("SalesPerson"));

	}

}
