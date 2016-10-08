package Dashboard.screens;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.infrastructure.Driver;
import Navigation.PageChecker;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class DashboardMainScreen extends PageChecker {

	// refactored===inserted getSubtitle() in PageChecker

	public static boolean isHome() {
		return getTitle().equals("Dashboard");
	}

	public static void addWidget(String widget) {

		// Add selected widget to the Dashboard
		List<WebElement> layouts = Driver.Instance.findElements(By
				.xpath("//android.widget.RelativeLayout[@NAF='true']"));
		System.out.println(layouts.size());

		layouts.get(0).click();

		// these are available apps
		WebElement appPage = Driver.Instance
				.findElementByAndroidUIAutomator("new UiSelector().text(\"Select Application\")");
		// WebElement appPage =
		// Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/gridViewCustom");
		System.out.println(appPage.getText());

		// Wait for the application page to load (takes some time, throws an
		// error if no wait).
		WebDriverWait wait = new WebDriverWait(Driver.Instance, 20);
		wait.until(ExpectedConditions.visibilityOf(appPage));

		Driver.Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Select wanted app from the grid
		List<WebElement> widgets = Driver.Instance.findElements(By
				.id("com.itelematic.drive.dashboard:id/textView"));
		System.out.println("Apps available= " + widgets.size());

		for (int n = 0; n <= widgets.size(); n++) {
			String app = widgets.get(n).getText();
			System.out.println(app);

			if (app.equals(widget)) {
				widgets.get(n).click();
				return;
			}

		}
	}

	public static boolean widgetIsAdded(String widget) {

		List<WebElement> addedWidgets = Driver.Instance.findElements(By
				.id("com.itelematic.drive.dashboard:id/title"));

		List<String> appNames = new ArrayList<String>();
		for (WebElement wid : addedWidgets)
			appNames.add(wid.getText());

		for (String widz : appNames)

			System.out.println(widz);

		return true;
		// appNames.contains(widget);
	}

    public static void removeWidget(String forms) {


            //TODO; some code to remove forms

        TouchAction action = new TouchAction(Driver.Instance);


        List<WebElement> addedWidgets = Driver.Instance.findElements(By
                .id("com.itelematic.drive.dashboard:id/title"));
        for (WebElement wid : addedWidgets)
        {
            if (wid.getText().equalsIgnoreCase(forms))
            {
                System.out.println(wid);
                action.longPress(wid).release().perform();

                wid.click();
            }
        }


    }
}
