package com.itelematic.ibrightDriveUI;

import static org.junit.Assert.*;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;

import Dashboard.screens.DashboardMainScreen;

public class AddWidgetTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

        SignInProcessTest.signIn();
        //TODO: ...
        DashboardMainScreen.removeWidget("Forms");




	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//TODO clean up Dashboard
	}
	
	@Test
	public void UserCanAddFormsToDashboard() {
	
		DashboardMainScreen.addWidget("Forms");
		assertTrue(DashboardMainScreen.widgetIsAdded("Forms"));

	}

}
