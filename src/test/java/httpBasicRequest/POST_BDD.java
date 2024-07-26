package httpBasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

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
public class POST_BDD 
{
  @Test(priority=1)
  public void postUsingHashMap()
  {
	  
	  System.out.println("Post request using HashMap");

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
  
  @Test(priority=2)
  public void postUsingPOJO()
  {
	  System.out.println("Post request using POJO");
	  
	  //payload
	  PojoData data=new PojoData();
	  data.setName("Sarang");
	  data.setJob("QA");
	  
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  	
	  .when().post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .body("name", equalTo("Sarang"))
	  .body("job",equalTo("QA"))
	  .log().all();
  }
  
  
  @Test
  public void testPojoResponse()
  {
	  //payload
	  PojoData data=new PojoData();
	  data.setName("Surabhi");
	  data.setJob("Dev");
	  
	int id=  given()
	  	.contentType("application/json")
	  	.body(data)

	  	.when()
	  	.post("https://reqres.in/api/users")
	  	.jsonPath().getInt("id");
	
	System.out.println("Generated Id is: "+id);
	  
	  
	  
	  
	  /*
	  Response res=given()
			  	.contentType("application/json")
			  	.body(data)
	  	
			  	.when()
			  	.post("https://reqres.in/api/users");
	  
	  System.out.println(res.asPrettyString());
	  
	  String name=res.jsonPath().getString("name");
	 
	  Assert.assertTrue(name.equals("Surabhi"),"Test Fail: name not matched!");
	  System.out.println("Test Pass: name is matched!");
	   */
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
}
