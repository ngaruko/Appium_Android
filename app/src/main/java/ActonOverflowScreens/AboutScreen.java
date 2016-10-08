package ActonOverflowScreens;

import Appium.infrastructure.Driver;
import Navigation.PageChecker;

public class AboutScreen {

	public static boolean IsAt() {
		
		return PageChecker.getTitle().equals("About") ;
	}


public static int getBuild() {
	
	return Integer.parseInt(Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/build").getText());
}

}
