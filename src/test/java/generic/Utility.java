package generic;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Utility 
{
	public  static  AppiumDriver driver;
	
	public static  AppiumDriver  createDriverSession()
	{
		UiAutomator2Options options=new UiAutomator2Options();
		 options.setPlatformName("Android");
		 
		 //application path
		 String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		 options.setCapability("appium:app", path);
		 
		 //server address
		 URL url;
		try {
			url = new URL("http://0.0.0.0:4723");
			 //create driver session
			 driver=new AndroidDriver(url,options);
			 System.out.println("Session id is: "+driver.getSessionId());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return driver;
	}
	
	
	
	public static void scrollDown(WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",0.75
				  ));
		  
	}
	
	public static void scrollUp(WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","up",
				  "percent",0.75
				  ));
		  
	}
	
	public static void scrollDownAsPerCount(WebElement ele,int count)
	{
		for(int i=1;i<=count;i++)
		{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",0.75
				  ));
		  System.out.println("Coun interation is: "+i);
		}
	}
	
	
	public static void swipeLeft(WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","left",
				  "percent",0.75
			  	  ));
		  
	}
	
	
	public static void swipeRight(WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","right",
				  "percent",0.75
			  	  ));
		  
	}
	
	
	
	public static void getScreenshot() 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//ScreenShots//appium"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
