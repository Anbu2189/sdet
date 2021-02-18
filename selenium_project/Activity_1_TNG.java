package orangeHRMproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_1_TNG {
  WebDriver dr;
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	//Create an instance of Firefox driver
	dr = new FirefoxDriver(); 
			
	//Open the browser
	dr.get("http://alchemy.hguy.co/orangehrm");
  }
  
  @Test
  public void testCase1() {
	//Get PageTitle and print it
	String title = dr.getTitle();
	System.out.println("The page title is: " + title);
			
	//Assert pagetitle
	Assert.assertEquals(title, "OrangeHRM");
  }

  @AfterClass
  public void afterClass() {
	//Close the browser
	dr.close();
  }

}
