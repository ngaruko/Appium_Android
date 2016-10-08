package com.itelematic.ibrightDriveUI;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dashboard.screens.DashboardMainScreen;

public class SignInTest extends SignInProcessTest {

	@Before
	public void setUp() throws Exception {
		signIn();

	}

	@After
	public void tearDown() throws Exception {

		String[] details = DashboardMainScreen.getSubtitle().split("\\s+");

		try {
			System.out.println(details.length);
			if (details.length == 4)

				System.out.println(" Your vehicle is " + details[0]
						+ " and you are signed in as  " + details[2] + " "
						+ details[3]);
			else
				System.out.println(" Your vehicle is " + details[0]
						+ " and you are signed in as  " + details[2]);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void usercanLogIn() {
		assertTrue(DashboardMainScreen.isHome());

	}

}
