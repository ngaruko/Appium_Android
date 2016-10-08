package GeneralTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Appium.infrastructure.Driver;

public class SwipeGestureTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Driver.initialize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		// Driver.Instance.findElementById("com.meetup:id/intro_next_button")
		// .click();

		//Driver.Instance.scrollTo("GET STARTED").click();
		//Driver.Instance.

		//Driver.Instance.findElementById("com.meetup:id/button_continue")
			//	.click();

		/*
		 * List<WebElement> categories = Driver.Instance.findElements(By
		 * .id("com.meetup:id/metacategory_name"));
		 * 
		 * for (WebElement category : categories)
		 * System.out.print(category.getText());
		 */
		// MobileElement education = (MobileElement) Driver.Instance
		// .findElementByAndroidUIAutomator("new UiSelector().text(\"Education\")");

		// ((MobileElement) education).swipe(SwipeElementDirection.DOWN, 6000);

		//Driver.Instance.scrollTo("Women");
		//Driver.Instance.scrollTo("Education").click();

		/*
		 * 
		 * if
		 * (Driver.Instance.getOrientation().equals(ScreenOrientation.PORTRAIT))
		 * 
		 * education.swipe(SwipeElementDirection.UP, 2000);
		 * 
		 * else education.swipe(SwipeElementDirection.RIGHT, 2000);
		 */
	}

}
