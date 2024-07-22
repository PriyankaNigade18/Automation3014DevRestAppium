package seleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLessTest {
  @Test
  public void f()
  {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.google.com");
	  System.out.println("Url: "+driver.getCurrentUrl());
	  driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
	  System.out.println("JavaPageUrl: "+driver.getCurrentUrl());
	  
	  
  }
}
