package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserttionTest {
  @Test
  public void hardAssertionTest() 
  {
	  
	  String act="Selenium WebDriver is API for WEbUi Test";
	  String exp="Selenium WebDriver is API for WEbUi library";
	  
	  Assert.assertEquals(act,exp,"Test Fail: Strings are not equal!");
	  System.out.println("Test Pass: Strings are equal!");
	  
	  
  }
}
