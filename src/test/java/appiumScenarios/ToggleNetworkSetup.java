package appiumScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ToggleNetworkSetup {
  @Test
  public void testToggleSetup() throws InterruptedException 
  {
	  /*
	   * toggleWifi()
	   * toggleData()-mobileData
	   * toggleAirplaneMode()
	   */
	  
	  
	  //create a driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  System.out.println("Initially Wifi is On State");
	  //ON--->OFF
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi state is OFF");
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi state is ON");
	  
	  //swipe left
	  WebElement ele=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  
	  Utility.swipeLeft(ele);
	  
	  //Mobile data
	  Thread.sleep(2000);
	  System.out.println("MobileData state is ON");
	  
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("MobileData state is OFF");
	  
	  Thread.sleep(2000);
	  
      ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("MobileData state is ON");
	  
	  Thread.sleep(2000);
	  
	  System.out.println("AirplaneMode state is OFF");
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("AirplaneMode state is ON");
	  
	  Thread.sleep(2000);
	  
((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("AirplaneMode state is OFF");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
