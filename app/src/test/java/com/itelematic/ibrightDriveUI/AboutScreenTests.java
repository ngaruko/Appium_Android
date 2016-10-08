package com.itelematic.ibrightDriveUI;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ActonOverflowScreens.AboutScreen;
import Appium.infrastructure.Driver;
import Dashboard.screens.DashboardMainScreen;
import Navigation.ActionOverflowNavigation;
import Navigation.DeviceNavigation;
import Navigation.MenuSelector;

@SuppressWarnings("unused")
public class AboutScreenTests {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		SignInProcessTest.signIn();
		MenuSelector.GoToOverflow();
		ActionOverflowNavigation.DisplayAboutScreen ();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		DeviceNavigation.GoBack();
		
	}
	
	

	@Test
	public void AboutScreenCanOpen() {
		
		assertTrue(AboutScreen.IsAt());	
			
		
	}
	
	
	@Test
	public void TheCurrentBuildIsDisplayed() {
		assert(AboutScreen.getBuild()==91);	
		
		
		
	}
	

	

}
