package com.itelematic.ibrightDriveUI;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

import java.net.MalformedURLException;

import org.openqa.selenium.ScreenOrientation;

import Appium.infrastructure.Driver;
import Dashboard.screens.AssignEquipmentScreen;
import Dashboard.screens.DashboardMainScreen;
import Dashboard.screens.SelectVehicleScreen;
import Dashboard.screens.SignInScreen;
import Dashboard.screens.SignOutScreen;

public class SignInProcessTest {

	public static void signIn() throws MalformedURLException {

		Driver.initialize();

		// Check if the user is not signed in already if
		/*if (DashboardMainScreen.isHome())
			SignOutScreen.signOutAll();*/
        if (!DashboardMainScreen.isHome()) {
            AssignEquipmentScreen.clearPreviousSelection();

            AssignEquipmentScreen.addVehicle();

            SelectVehicleScreen.ChoseVehicle();

            SignInScreen.enterPinCode();
        }

		/*
		 * Scroll to see all the grid Scrolling down if device is in Portrait
		 * Scroll Right if in Landscape
		 */
		MobileElement message = (MobileElement) Driver.Instance
				.findElementById("com.itelematic.drive.dashboard:id/cardSpace");

		if (Driver.Instance.getOrientation().equals(ScreenOrientation.PORTRAIT))

			message.swipe(SwipeElementDirection.DOWN, 1000);

		else
			message.swipe(SwipeElementDirection.RIGHT, 2000);

	}

}
