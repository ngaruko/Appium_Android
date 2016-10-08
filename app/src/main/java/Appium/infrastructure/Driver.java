package Appium.infrastructure;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Driver {

	public static AndroidDriver Instance;

	public static void initialize() throws MalformedURLException {

		// setting desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
				MobilePlatform.ANDROID);

		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");


//1. with apk
		File appDir = new File("C:/testprojects/appium/app");
		File app = new File(appDir, "testApp.apk");
		cap.setCapability("app", app.getAbsolutePath());


		//2. with app installed and activity known
		//cap.setCapability(MobileCapabilityType.APP_PACKAGE,"com.meetup");

		//cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "MainActivity");


		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "500");

		// Android Driver

		Instance = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
Instance.currentActivity();
		// Wait for element to load
		Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// please remove this code to test
		// Instance.quit();

	}

}
