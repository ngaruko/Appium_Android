package Dashboard.screens;

import Appium.infrastructure.Driver;

public class SelectVehicleScreen {

	public static void ChoseVehicle() {
		Driver.Instance.findElementById(
				"com.itelematic.drive.dashboard:id/inputSearch").sendKeys("d3");
		Driver.Instance.findElementByAndroidUIAutomator(
				"new UiSelector().text(\"D3\")").click();
		Driver.Instance.findElementById(
				"com.itelematic.drive.dashboard:id/save").click();

	}

	public static void ChooseTrailer() {
		Driver.Instance.findElementByAndroidUIAutomator(
				"new UiSelector().text(\"DryTrailer\")").click();
		Driver.Instance.findElementById(
				"com.itelematic.drive.dashboard:id/save").click();

	}

}
