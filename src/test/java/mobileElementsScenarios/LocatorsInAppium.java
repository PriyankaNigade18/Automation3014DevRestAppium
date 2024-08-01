package mobileElementsScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LocatorsInAppium {
  @Test
  public void testMobileElements() throws InterruptedException
  {
	  //create a driver session
	AppiumDriver driver=Utility.createDriverSession();

	
	//accessibility-id
	WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		System.out.println("Text of elelement1: "+ele1.getText());
		ele1.click();
		
	Thread.sleep(2000);
		
		//come back 
		driver.navigate().back();
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	  
  }
}
