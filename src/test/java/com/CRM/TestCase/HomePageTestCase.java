package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail: Url not matched!");
	  System.out.println("Test pass: Url matched!");
  }
  
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String actTitle=hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail: Title is not matched!");
	  System.out.println("Test Pass! Title macthed");
  }
  
  
  @Test(priority=3)
  public void validateSIgnInLink() 
  {
	  String nextPageUrl=hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail: Login page not open");
	  System.out.println("Test Pass: Application navigating to Login page");
  }
}
