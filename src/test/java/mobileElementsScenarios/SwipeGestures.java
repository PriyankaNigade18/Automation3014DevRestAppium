package mobileElementsScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;



public class SwipeGestures {
  @Test
  public void testSwipe() 
  {
	  //create a driver session
	  AppiumDriver driver=Utility.createDriverSession();	
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","left",
			  "percent",0.75
		  	  ));
	  
	  System.out.println("SwipeGesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
