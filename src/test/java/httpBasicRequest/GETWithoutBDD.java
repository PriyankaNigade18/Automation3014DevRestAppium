package httpBasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETWithoutBDD {
  @Test
  public void singleUser()
  {
	  
	  	Response res=RestAssured.get("https://reqres.in/api/users/2");
	  	System.out.println("Status code is: "+res.getStatusCode());
	  	System.out.println("Statuc line is: "+res.getStatusLine());
	  	System.out.println("get the time: "+res.getTime());
	  	System.out.println(res.getContentType());
	  	System.out.println(res.asString());
	  	System.out.println("**************************");
	  	System.out.println(res.asPrettyString());
	  	
	  	Assert.assertEquals(res.getStatusCode(),200,"Test Fail: Status code is not matched!");
	  	System.out.println("Test Pass: Status code matched!");
	  	
	  
  }
  
  @Test
  public void getAllUsers()
  {		
	  
	  				Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  				int pagenumber=res.jsonPath().getInt("page");
	  				System.out.println("Page number is: "+pagenumber);
	  				
	  				
	  				
	  				
	  				
	  				
	  				
	  				
	  
  }
}
