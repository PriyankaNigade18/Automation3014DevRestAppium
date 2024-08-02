package mobileElementsScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void scrollTest() throws InterruptedException 
  {
	  	//create a driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  Utility.scrollDown(area);
	  
	  Utility.getScreenshot();
	  Thread.sleep(3000);
	  
	  Utility.scrollUp(area);
	  Utility.getScreenshot();
	  Thread.sleep(2000);
	  
	  Utility.scrollDownAsPerCount(area, 3);
	  Utility.getScreenshot();
	  
	  
	  
	  /*
	  //scroll
	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","down",
			  "percent",0.75
			  ));
	  */
	  System.out.println("ScrollDown is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
