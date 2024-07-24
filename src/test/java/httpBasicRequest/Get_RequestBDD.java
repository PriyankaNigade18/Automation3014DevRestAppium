package httpBasicRequest;

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
public class Get_RequestBDD {
  @Test
  public void getSingleUsers()
  {
	  given()
	  
	  .when()
	  .get("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .body("data.id",equalTo(2))
	 .body("support.url",equalTo("https://reqres.in/#support-heading"))
	.log().all();
	  
	  
  }
  
  /*
   * hasItems() -> Check all elements are in a collection
   * contains() -> Check all elements are in a collection and in a strict order
   */
  
  @Test
  public void getListOfUsers()
  {
	  given()
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  .statusCode(200)
	  .body("data[1].id", equalTo(8))
	  //hasItems() -> Check all elements are in a collection
	  .body("data.id", hasItems(7,8,9,10,11,12))//pass
	  .body("data.id", hasItems(7,10,12))//pass
	  .body("data.id", hasItems(10,7,9,8,11,12))//pass
	  //contains() -> Check all elements are in a collection and in a strict order
	  .body("data.id", contains(7,8,9,10,11,12))//pass
	//  .body("data.id", contains(10,8,9,7,12,11))//fail
	 // .body("data.id", contains(7,10,12))//fail
	  .log().body();
	  
	  
  }
}
