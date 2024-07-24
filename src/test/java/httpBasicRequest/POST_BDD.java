package httpBasicRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
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
public class POST_BDD {
  @Test
  public void postUsingHashMap()
  {
	  
	  // Request Payload
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("name","Jay");
	  map.put("job","QA");
	  
	  
	  given()
	  	.contentType("application/json")
	  	.body(map)
	  	
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .body("name",equalTo("Jay"))
	  .body("job",equalTo("QA"))
	  .log().all();
	  
	  
	  
  }
}
