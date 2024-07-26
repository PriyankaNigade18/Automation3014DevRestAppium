package apiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class HaderValidation {
  @Test(priority=1)
  public void getAllHeaders()
  {
	  System.out.println("Get all headers");
	  given()
	  
	  .when()
	  .get("https://www.google.com")
	  
	  .then()
	  .log().headers();
	  
  }
  
  
  @Test(priority=2)
  public void testHeaders()
  {
	  
	  System.out.println("Test header!");
	 Response res= given()
	  
	  .when()
	  .get("https://www.google.com");
	  
	  String header=res.getHeader("Content-Type");
	  
	  System.out.println(header);
	  
	  Assert.assertEquals(header, "text/html; charset=ISO-8859-1");
  }
}
