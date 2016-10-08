package Dashboard.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Appium.infrastructure.Driver;
import Navigation.MenuSelector;

public class SignOutScreen {

	private static List<WebElement> users;

	public static String getUser() {

		users = Driver.Instance.findElements(By
				.id("com.itelematic.drive.dashboard:id/user_name"));
		return users.get(1).getText();
	}

	public static void signOut(int i) {

		users = Driver.Instance.findElements(By
				.id("com.itelematic.drive.dashboard:id/sign_out_button"));
		users.get(i).click();
	}

	public static void signOutAll() {

		MenuSelector.SignOutUser();
		List<WebElement> users = Driver.Instance.findElements(By
				.id("com.itelematic.drive.dashboard:id/sign_out_button"));
		for (WebElement user : users) {
			user.click();
		}

	}

	public static boolean singleUserRemoved() {

		return AssignEquipmentScreen.isAt();
	}

	public static boolean secondUserRemoved() {

		return Driver.Instance.findElements(
				By.id("com.itelematic.drive.dashboard:id/user_name")).size() == 1;
	}

}
