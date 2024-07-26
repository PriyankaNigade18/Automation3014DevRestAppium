package httpBasicRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Create_Update_deleteSameUser 
{
	int id;
	
  @Test(priority=1)
  public void createUSer()
  {
	  //payload
	  PojoData pojo=new PojoData();
	  pojo.setName("Kiran");
	  pojo.setJob("Tester");
	  
	  id= given()
	  .contentType("application/json")
	  .body(pojo)
	  
	  .when()
	  .post("https://reqres.in/api/users")
	  .jsonPath().getInt("id");
	 
	 System.out.println("User Created with id:  "+id);
	  
	   
  }
  
  @Test(priority=2,dependsOnMethods = "createUSer")
  public void updateSameUser()
  {
	  System.out.println("Same user is updating....................");
	  PojoData pojo=new PojoData();
	  pojo.setName("Kavita");
	  pojo.setJob("SDET");
	  
	  given()
	  .contentType("application/json")
	  .body(pojo)
	  
	  .when()
	  .put("https://reqres.in/api/users/"+id)
	  
	  .then()
	  .log().body();
	  
	  System.out.println("User updated with id: "+id);
	
			  
  }
  
  
  @Test(priority=3,dependsOnMethods = "updateSameUser") 
  public void deleteSameUser()
  {
	  System.out.println("Same user is deleting....................");
	  given()
	  .when().delete("https://reqres.in/api/users/"+id)
	  .then()
	  .statusCode(204);
	  
	  System.out.println("User deleted with id: "+id);
	  
	  
  }
  
}
