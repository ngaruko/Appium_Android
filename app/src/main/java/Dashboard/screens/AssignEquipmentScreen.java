package Dashboard.screens;

import Appium.infrastructure.Driver;
import Navigation.PageChecker;

public class AssignEquipmentScreen {

	public static void addVehicle() {
		Driver.Instance
				.findElementById("com.itelematic.drive.dashboard:id/add")
				.click();

	}

	public static boolean isAt() {

		return PageChecker.getTitle().equals("Assign Equipment");

	}

	public static void clearPreviousSelection() {
		// if there is a selected item, remove:
		// com.itelematic.drive.dashboard:id/vehicle_name
		try {

			Driver.Instance.findElementById(
					"com.itelematic.drive.dashboard:id/vehicle_name").click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}

}
