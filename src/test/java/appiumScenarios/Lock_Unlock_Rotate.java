package appiumScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_Rotate {
  @Test
  public void testDeviceFunctions() 
  {
	  /*
	   * lockDevice()
	   * unlockDevice()
	   * rotate(ScreenOrientation)
	   * 
	   */
	  
	  //create driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  //To lock the device
	 ( (AndroidDriver)driver).lockDevice();
	 System.out.println("Device Locked!");
	 
	 //To Unlock Device
	 ((AndroidDriver)driver)	.unlockDevice();  
	 System.out.println("Device UnLocked!");

	  //roatate
	 ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	 System.out.println("Application Rotate to Ladscape view!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
