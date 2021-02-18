package orangeHRMproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity_2_TNG {
	WebDriver dr;
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	//Create an instance of Firefox driver
	dr = new FirefoxDriver(); 
				
	//Open the browser
	dr.get("http://alchemy.hguy.co/orangehrm");
	Thread.sleep(1000);
  }

  @Test
  public void test() {
	//Get the header URL
	WebElement img = dr.findElement(By.xpath("//img"));
			
	//print the header url of src attribute
	System.out.println("The header URL is: " + img.getAttribute("src"));
  }
  
  @AfterClass
  public void afterClass() {
	//Close the browser
	dr.close();
  }

}
