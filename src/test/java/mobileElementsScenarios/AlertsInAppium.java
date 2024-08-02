package mobileElementsScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertsInAppium {
  @Test
  public void testAlert() throws InterruptedException 
    {
	  
	  /*
	   * Alert is interface in selenium
	   * Support 4 methods
	   * accept()====>Ok
	   * dismiss()===>Cancel
	   * getText()====>text of alert
	   * sendKeys()====>Prompt
	   * 
	   */
	  
	  //create a driver session
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alerts
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //alert
	  
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  Thread.sleep(2000);
	  
	  //alert open
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
