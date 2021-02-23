package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Before Suite-->Before Test-->Before class-->Before Method--> Test-->After Method-->After class-->
// -->After Test-->After Suite

public class Activity_1 {
	  WebDriver dr;
	
	  @BeforeMethod
	  public void beforeMethod() {
		//Create a new instance of the Firefox driver
		dr = new FirefoxDriver();
		
		//Open Browser
		dr.get("https://www.training-support.net");
	  }
	
	
	@Test
  public void exampleTestCase() {
		// Check the title of the page
		String title = dr.getTitle();
		//Print the title of the page
		System.out.println("The page title is: " + title);
		//Assertion for page title
		Assert.assertEquals("Training Support", title);
		   //Find the clickable link on the page and click it
        dr.findElement(By.id("about-link")).click();
                    
        //Print title of new page
        System.out.println("New page title is: " + dr.getTitle());
        
        Assert.assertEquals("About Training Support", dr.getTitle());
    }
		
  @AfterMethod
  public void afterMethod() {
	  //Close the browser
	  dr.quit();
  }

}
