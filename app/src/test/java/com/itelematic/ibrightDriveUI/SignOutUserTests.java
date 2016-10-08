package com.itelematic.ibrightDriveUI;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Dashboard.screens.SignInScreen;
import Dashboard.screens.SignOutScreen;
import Navigation.DeviceNavigation;
import Navigation.MenuSelector;
import Workflows.Processes;

public class SignOutUserTests {

	// TODO add before or after statements

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		SignInProcessTest.signIn();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// System.out.println(SignOutScreen.SignOut(0));
		SignOutScreen.signOut(1);
	}

	@Test
	public void SingleUserCanBeSignedOut() {

		MenuSelector.SignOutUser();
		SignOutScreen.signOut(0);

		assertTrue(SignOutScreen.singleUserRemoved());
		// Processes.userSignOut(0);

	}

	@Test
	public void SecondUserCanBeSignedOut() {
		MenuSelector.AddUser();
		SignInScreen.enterSecondPinCode();
		Processes.userSignOut(1);
		MenuSelector.SignOutUser();

		assertTrue(SignOutScreen.secondUserRemoved());
		DeviceNavigation.GoBack();
	}

}
