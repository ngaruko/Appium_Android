package com.itelematic.ibrightDriveUI;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Dashboard.screens.AssignEquipmentScreen;
import Dashboard.screens.ChangeVehicleScreen;
import Dashboard.screens.SelectVehicleScreen;
import Navigation.DeviceNavigation;
import Navigation.MenuSelector;

public class ChangeVehicleTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		SignInProcessTest.signIn();
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		MenuSelector.ChangeVehicle();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void VehicleCanBeRemoved() {
		assertTrue(ChangeVehicleScreen.lastVeicleIsGone());
		//ChangeVehicleScreen.save();
		DeviceNavigation.GoBack();
	}
	
	@Test
	public void UsercanAddATrailer() {
		AssignEquipmentScreen.addVehicle();
		//SelectVehicleScreen.ChoseVehicle();
		SelectVehicleScreen.ChooseTrailer();
		MenuSelector.ChangeVehicle();
		assertTrue(ChangeVehicleScreen.trailerIsAdded());
		ChangeVehicleScreen.removeAddedTrailer();
		ChangeVehicleScreen.save();
		
	}

}
