package mobileElementsScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGuesture {
  @Test
  public void clickGestureTest() 
  {
	  //create a driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  //ele
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //click guesture
	  
	  driver.executeScript("mobile:clickGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId()
			 ));
	  
	  
	  System.out.println("Click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
