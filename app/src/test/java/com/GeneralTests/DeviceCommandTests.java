package GeneralTests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;

import Appium.infrastructure.Driver;

public class DeviceCommandTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Driver.initialize();
		// SignInProcessTest.signIn();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		// Driver.Instance.removeApp("com.nuttyapps.newborn.pony");

		// Driver.Instance.sendKeyEvent(AndroidKeyCode.BACK);
		// Driver.Instance.sendKeyEvent(AndroidKeyCode.HOME);
		// Driver.Instance.sendKeyEvent(AndroidKeyCode.SETTINGS);
		// Driver.Instance.sendKeyEvent(AndroidKeyCode.BACKSPACE);
		// Driver.Instance.sendKeyEvent(AndroidKeyCode.ENTER);
		// Driver.Instance.sendKeyEvent(AndroidKeyCode.MENU);
		// Driver.Instance.sendKeyEvent(AndroidKeyCode.SPACE);

		Driver.Instance.rotate(ScreenOrientation.PORTRAIT);

		Driver.Instance.rotate(ScreenOrientation.LANDSCAPE);

	}

	@Test
	public void ScreenShotTests() throws InterruptedException {

		// Driver.Instance.manage().timeouts().wait(2000);
		try {

			File scrFile = ((TakesScreenshot) Driver.Instance)
					.getScreenshotAs(OutputType.FILE);
			FileUtils
					.copyFile(
							scrFile,
							new File(
									"C:\\Users\\itl\\Desktop\\Mythings\\Speaking\\screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		assertTrue(true);
	}

}
