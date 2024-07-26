package httpBasicRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PUT_DeleteRequest {
  @Test
  public void Update_PUTCall() 
  {
	  //payload
	  PojoData pojo=new PojoData();
	  pojo.setName("Anita");
	  pojo.setJob("SDET");
	  
	  given()
	  	.contentType("application/json")
	  	.body(pojo)
	  	
	  .when().put("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .log().all();
	  
	    }
  
  
  @Test
  public void deleteUser()
  {
	
	  	given()
	  	
	  	.when()
	  	.delete("https://reqres.in/api/users/2")
	  	
	  	.then()
	  	.statusCode(200)
	  	.log().all();
	  
	  
	  
	  
  }
  
}
