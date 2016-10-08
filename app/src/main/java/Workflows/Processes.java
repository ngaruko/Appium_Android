package Workflows;

import Dashboard.screens.SignOutScreen;
import Navigation.MenuSelector;

public class Processes {

	public static void userSignOut(int i) {
		MenuSelector.SignOutUser();
		SignOutScreen.signOut(i);
	}
}
