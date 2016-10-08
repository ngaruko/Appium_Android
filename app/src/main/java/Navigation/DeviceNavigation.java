package Navigation;

import io.appium.java_client.android.AndroidKeyCode;
import Appium.infrastructure.Driver;

public class DeviceNavigation {
	public static void GoHome(){
	Driver.Instance.pressKeyCode(AndroidKeyCode.HOME);
	Driver.Instance.pressKeyCode(AndroidKeyCode.BACK);
	
	}
	
	public static void GoBack(){
				Driver.Instance.pressKeyCode(AndroidKeyCode.BACK);
		
		}
	

}
