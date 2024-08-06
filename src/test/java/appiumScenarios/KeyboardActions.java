package appiumScenarios;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyboardActions {
  @Test
  public void testKeyboardAction()
  {
	
	  //create a driver session
	  
	  AppiumDriver driver=Utility.createDriverSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //scroll down action
	  //area to scroll
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  Utility.scrollDownAsPerCount(ele, 3);
	  
	  //textview
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //area
	  
	  WebElement typeArea=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  //typeArea.sendKeys("Hello All!");
	  
	  //KeyEvent class
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.H));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.E));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.L));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.L));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.O));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.A));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.L));
	( (AndroidDriver )driver).pressKey(new KeyEvent(AndroidKey.L));
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
