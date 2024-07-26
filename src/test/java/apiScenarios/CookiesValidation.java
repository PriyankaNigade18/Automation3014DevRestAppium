package apiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CookiesValidation {
  @Test(priority=1)
  public void getAllCookies()
  {
	  
	  System.out.println("Test for All Cookies");
	  given()
	  
	  .when().get("https://www.google.com")
	  .then()
	  .log().cookies();
  }
  
  
  @Test(priority=2)
  public void getSingleCookie()
  {
	  System.out.println("Test for Single Cookie");

	  
	  Response res=given()
	  
			  .when()
			  .get("https://www.google.com");
	  
	  String actCookie=res.getCookie("AEC");
	  
	  System.out.println(actCookie);
	  
	  String exp="AVYB7cpeUi7CgTGktAcmg5qe3-aJbsCumu5e5xt8DJjeAUkgXU1eaXKgjg";
	  
	  
	  /*
	   * Cookies are always dynamic
	   */
	  
	  Assert.assertFalse(actCookie.equals(exp),"Test Fail:  As cookies are same");
	  System.out.println("Test Pass: As cookies are dynamic");
	  
  }
  
  
}
