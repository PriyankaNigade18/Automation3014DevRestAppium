package apiScenarios;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import httpBasicRequest.PojoData;

public class DataConversion 
{
	
	/*
	 * Serialization POJO--->JSON
	 * 
	 * De-serialization JSON---->POJO
	 */
	
  @Test
  public void testSerialization() throws JsonProcessingException
    {
	  	PojoData data=new PojoData();
	  	data.setName("Tanavi");
	  	data.setJob("QA");
	  	
	  	ObjectMapper obj=new ObjectMapper();
	  	String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
	  	
	  	System.out.println(json);
	  		  
  }
  
  @Test
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	  String json="{\n"
	  		+ "  \"name\" : \"Tanavi\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
	  
	  ObjectMapper obj=new ObjectMapper();
	  
	 PojoData data= obj.readValue(json,PojoData.class);
	 
	 System.out.println(data.getName());
	 System.out.println(data.getJob());
	 
	 
	 
	  
  }
}
