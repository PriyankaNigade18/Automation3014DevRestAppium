package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithAppPackageNameAppActivityName {
  @Test
  public void createDriverSession() throws MalformedURLException 
  {
	  
	  	UiAutomator2Options options=new UiAutomator2Options();
	  	options.setPlatformName("Android");
	  	options.setCapability("appium:appPackage","com.android.deskclock");
	  	options.setCapability("appium:appActivity","com.android.deskclock.DeskClock");
	  
	  	//io.appium.android.apis
	  	//Server address
	  	URL url=new URL("http://0.0.0.0:4723");
	  	
	  	//create driver session
	  	AppiumDriver driver=new AndroidDriver(url,options);
	  	System.out.println("Session id is: "+driver.getSessionId());
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  
	  
	  
	  
  }
}
