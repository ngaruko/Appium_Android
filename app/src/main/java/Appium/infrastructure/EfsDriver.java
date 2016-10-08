package Appium.infrastructure;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class EfsDriver {

	public static AndroidDriver Instance;

	public static void initialize() throws MalformedURLException {

		File appDir = new File("src");
		File app = new File(appDir, "eFleetSuite.apk");
		// setting desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
				MobilePlatform.ANDROID);

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "3000");

		// Android Driver

		Instance = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),
				cap);

		// Wait for element to load
		Instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
