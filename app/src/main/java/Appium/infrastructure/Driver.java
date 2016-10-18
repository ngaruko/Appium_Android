package Appium.infrastructure;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class Driver {
	public static final String LOCAL_URL = "http://127.0.0.1:4723/wd/hub";
	public static AndroidDriver Instance;
	private static String username=Constants.USERNAME;
	private static String accessKey=Constants.ACCESS_KEY;
	public static final String URL = "https://" + username + ":"
			+ accessKey + "@ondemand.saucelabs.com:443/wd/hub";

	public static void initialize() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("name", "WeTest Demo");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("appiumVersion", "1.5.3");
		//app to test
		capabilities.setCapability("app", "sauce-storage:testApp.apk");

		Instance = new AndroidDriver(new URL(URL),capabilities);
		Instance.currentActivity();

		// Wait for element to load
		Instance.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
