package mobileElementsScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGestureTest {
  @Test
  public void testDragGesture()
  {
	  //create a driver session
	  
	 AppiumDriver driver= Utility.createDriverSession();
	  
  //views
	 driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 
	 
	 //drag
	 driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	 
	  //dot3
	 WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	 
	 
	 //dragGesture
	 driver.executeScript("mobile: dragGesture",ImmutableMap.of(
			 "elementId",((RemoteWebElement)ele).getId(),
			 "endX",629,
			 "endY",1102
			  ));
  
  String resultmsg=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
  System.out.println("After GragGesture result message is: "+resultmsg);
  
  
  
  
  
  
  }
}
