package Dashboard.screens;

import Appium.infrastructure.Driver;
import Navigation.PageChecker;

public class SignInScreen {

	public static void enterPinCode() {

		// TODO This code is too slow. Needs change.
		for (int n = 0; n < 4; n++)
			Driver.Instance.findElementByAndroidUIAutomator(
					"new UiSelector().text(\"2\")").click();

	}

	public static boolean IsAt() {
		return PageChecker.getTitle().equalsIgnoreCase("sign in");
	}

	public static void enterSecondPinCode() {
		for (int n = 0; n < 4; n++)
			Driver.Instance.findElementByAndroidUIAutomator(
					"new UiSelector().text(\"5\")").click();

	}

}
