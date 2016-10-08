package Navigation;

import Appium.infrastructure.Driver;

public class MenuSelector {
	public static void AddUser(){
		Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/action_sign_in").click();
	}
	public static void GoToOverflow(){
		Driver.Instance.findElementByClassName("android.widget.ImageButton").click();
	}
	
	
	public static void SignOutUser() {
		Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/action_sign_out").click();
	}
	
	public static void ChangeVehicle() {
		Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/action_change_vehicle").click();
	}

}
