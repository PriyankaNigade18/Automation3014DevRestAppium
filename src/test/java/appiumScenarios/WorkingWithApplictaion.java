package appiumScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApplictaion {
  @Test
  public void testApp() throws InterruptedException
  {
	  //create a driver session
	  
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  System.out.println("CurrentState of Application: "+((AndroidDriver )driver).queryAppState("io.appium.android.apis"));
	  
	 //terminateApp()
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  System.out.println("After terminate status is: "+((AndroidDriver )driver).queryAppState("io.appium.android.apis"));
	  
	  //Activate App
	  Thread.sleep(2000);
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After Activate status is: "+((AndroidDriver )driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(2000);
	  //unistall-removeApp()
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("After Uninstallation status is: "+((AndroidDriver )driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(2000);
	  //installation
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After Installation status is: "+((AndroidDriver )driver).queryAppState("io.appium.android.apis"));

	  //Activate App
	  Thread.sleep(2000);
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After Activate status is: "+((AndroidDriver )driver).queryAppState("io.appium.android.apis"));

	  //background
	  Thread.sleep(2000);
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	  System.out.println("After Background Execution status is: "+((AndroidDriver )driver).queryAppState("io.appium.android.apis"));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
