package orangeHRMproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity_3_TNG {
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
  public void f() throws InterruptedException {
	//Find Username and Password fields
	WebElement username = dr.findElement(By.id("txtUsername"));
	WebElement password = dr.findElement(By.id("txtPassword"));
			
	//Enter login credentials
	username.sendKeys("orange");
	password.sendKeys("orangepassword123");
			
	//Click Login
	WebElement login = dr.findElement(By.id("btnLogin"));
	login.click();
	Thread.sleep(1000);
			
	//Verify homepage is displayed
	WebElement homepage = dr.findElement(By.id("welcome"));
	System.out.println("Welcome message is: " + homepage.getText());
			
	String welcomeMessage = homepage.getText();
	Assert.assertEquals(welcomeMessage, "Welcome Ankit");
			
  }

  @AfterClass
  public void afterClass() {
	//Close the browser
	dr.close();
  }

}
