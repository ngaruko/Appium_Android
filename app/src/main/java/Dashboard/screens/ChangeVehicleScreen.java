package Dashboard.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Appium.infrastructure.Driver;

public class ChangeVehicleScreen {

	private static WebElement addedTrailer;

	public static boolean lastVeicleIsGone() {
		List<WebElement> vehicles=Driver.Instance.findElements(By.id("com.itelematic.drive.dashboard:id/vehicle_name"));
		int numberOfVehicles=vehicles.size();
		System.out.println("Original number of vehicles: " + vehicles.size());
	    String lastVehicle=vehicles.get(numberOfVehicles-1).getText();
		System.out.println("Last vehicle: " + lastVehicle);
		
	   vehicles.get(0).click();
	   System.out.println("Number of vehicles left: " + Driver.Instance.findElements(By.id("com.itelematic.drive.dashboard:id/vehicle_name")).size());

		return (Driver.Instance.findElements(By.id("com.itelematic.drive.dashboard:id/vehicle_name")).size()==numberOfVehicles-1);
				//lastVehicle.equals(null);
		    
		
		
	}

	public static boolean trailerIsAdded() {
		
		
		List<WebElement> vehicles=Driver.Instance.findElements(By.id("com.itelematic.drive.dashboard:id/vehicle_name"));
		

		 addedTrailer = vehicles.get(vehicles.size() - 1);
		
		
		return (addedTrailer.getText().equals("DryTrailer"));
		
			
	}

	public static void removeAddedTrailer() {
		
		addedTrailer.click();
				
		
	}

	public static void save() {
		Driver.Instance.findElementById("com.itelematic.drive.dashboard:id/save").click();
		
	}
	

}
