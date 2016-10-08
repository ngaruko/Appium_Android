package Navigation;

import Appium.infrastructure.Driver;



public class ActionOverflowNavigation {
	public static void DisplaySettingcards( ){
		Driver.Instance.findElementByAndroidUIAutomator("new UiSelector().text(\"Display Test Cards\")").click();  
	}
	
	public static void DisplaySettings( ){
		Driver.Instance.findElementByAndroidUIAutomator("new UiSelector().text(\"Settings\")").click(); 
	}
	public static void DisplayDiagnostics( ){
		Driver.Instance.findElementByAndroidUIAutomator("new UiSelector().text(\"Diagnostics\")").click(); 
	}
	public static void DisplayAboutScreen( ){
		
		Driver.Instance.findElementByAndroidUIAutomator("new UiSelector().text(\"About\")").click(); 
	}

}
