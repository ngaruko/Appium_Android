package Navigation;

import Appium.infrastructure.Driver;

public class TopMenuNavigation {
	
	public static void SignOutUser(){
		Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/action_sign_out").click();
	}

	public static void AddUser(){
		Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/action_sign_in").click();
	}
	
	public static void ChangeVehicle(){
		Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/action_change_vehicle").click();
	}
	
	public static void OpenOverflow(){
		MenuSelector.GoToOverflow();
	}
}
