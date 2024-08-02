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
		
		//element2
		WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
		
		System.out.println("Element2 text is: "+ele2.getText());
		ele2.click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		//class name
	//	WebElement ele3=driver.findElement(AppiumBy.className("android.widget.TextView"));
		WebElement ele3=driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
		System.out.println("Elemenet 3 text is: "+ele3.getText());
		ele3.click();
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		//app-resource-id(id)
		
		WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(3);
		System.out.println("Text of Elemenet4 is: "+ele4.getText());
		ele4.click();
		
		
		driver.navigate().back();
		
		//content
		WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
		System.out.println("Text of element 5: "+ele5.getText() );
		ele5.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	  
  }
}
