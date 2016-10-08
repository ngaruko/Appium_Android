package Navigation;

import Appium.infrastructure.Driver;

public class PageChecker {

	public static String getTitle() {
		return Driver.Instance.findElementById("android:id/action_bar_title")
				.getText();
	}

	public static String getSubtitle() {

		String subtitle = Driver.Instance.findElementById(
				"android:id/action_bar_subtitle").getText();
		return subtitle;

	}

}
