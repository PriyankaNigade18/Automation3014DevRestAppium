package appiumScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NotificationTesting {
  @Test
  public void testNotificationsInAppium()
  {
	  
	  //create a driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  //Open Notifications
	  ((AndroidDriver)driver).openNotifications();
	  System.out.println("Notification window is open!");
	  
	  System.out.println("*********Notification Header**************");
	  List<WebElement> headers=driver.findElements(AppiumBy.id("android:id/title"));
	  System.out.println("Total Notifications are: "+headers.size());
	  
	  for(WebElement i:headers)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("********Subheadings of Notifications*************");
	  
	  List<WebElement> list=driver.findElements(AppiumBy.id("android:id/text"));	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
	  
	  //android:id/big_text
	  String text=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
  }
}
