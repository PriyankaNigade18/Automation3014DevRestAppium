package appiumScenarios;

import java.util.List;

import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestPerformanceParameterForDevice {
  @Test
  public void deviceTest()
  {
	  //create  a driver session
	  
	  AppiumDriver driver=Utility.createDriverSession();
	  
	  //PerformanceDataTypes
	  
	  System.out.println("Get the performance data types");
	List<String> datatype= ((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println(datatype);
  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  System.out.println("Performance parameters for Battery");
	List<List<Object>> batterydata=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	System.out.println(batterydata);
  
  
//	 System.out.println("Performance parameters for Memory");
//		List<List<Object>> memorydata=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
//		System.out.println(memorydata);
  
  
		 System.out.println("Performance parameters for Network");
			List<List<Object>> networkdata=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
			System.out.println(networkdata);
  
  
  }
}
