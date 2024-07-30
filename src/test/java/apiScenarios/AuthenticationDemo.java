package apiScenarios;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/*
 * 	given()-prerequisite
 *  request headers,request payload,query and path parameters, cookies, authentication
 *  
 * when()-Api request
 * 
 * GET,POST,PUT,PATCH,DELETE
 * 	
 * then()-validation
 *  Status code,message,time,response payload,headers,cookies
 * 
 */

public class AuthenticationDemo {
  @Test
  public void basicAuth() 
  {
	  
	  given()
	  	.auth().basic("postman","password")
	  	
	  .when()
	  .get("https://postman-echo.com/basic-auth")
	  
	  .then()
	  .statusCode(200)
	  .body("authenticated",equalTo(true))
	  .log().body();
	  
	 System.out.println("Basic Authentication is comepleted!"); 
	  
  }
  
  
  
  
  @Test
  public void digestAuth() 
  {
	  
	  given()
	  	.auth().digest("postman","password")
	  	
	  .when()
	  .get("https://postman-echo.com/digest-auth")
	  
	  .then()
	  .statusCode(200)
	  .body("authenticated",equalTo(true))
	  .log().body();
	  
	 System.out.println("Digest Authentication is comepleted!"); 
	  
  }
  
  @Test
  public void bearerTokenAuth()
  {
	  given()
	  .header("Authorization","Bearer 12345")
	  
	  .when()
	  .get("https://postman-echo.com")
	  
	  .then()
	  .statusCode(200)
	  .log().all();
  }
  
  
  @Test
  public void auth2Test()
  {
	  given()
	  .auth().oauth2("12345")
	  
	  .when()
	  .get("https://postman-echo.com")
	  
	  .then()
	  .statusCode(200)
	  .log().all();
  }
  
  
  
  
  
  
  
}
