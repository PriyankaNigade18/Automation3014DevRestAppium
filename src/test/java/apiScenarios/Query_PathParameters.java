package apiScenarios;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Query_PathParameters {
  @Test
  public void path_QueryParam()
  {
	  
	  //https://reqres.in/api/users?page=2
	  
	  given()
	  .pathParam("path","users")
	  .queryParam("page", 2)
	  
	    .when()
	    .get("https://reqres.in/api/{path}")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
  }
}
