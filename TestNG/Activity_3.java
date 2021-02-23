package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_3 {
	WebDriver dr;
  
  @BeforeClass
  public void beforeClass() {
	//Create a new instance of the Firefox driver
	dr = new FirefoxDriver();
				
	//Open Browser
	dr.get("https://www.training-support.net/selenium/login-form");
  }
  
  @Test
  public void loginTest() {
	//Find the username and password fields
      WebElement username = dr.findElement(By.id("username"));
      WebElement password = dr.findElement(By.id("password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("password");
      
      //Click login
      dr.findElement(By.xpath("//button[text()='Log in']")).click();
      
      //Read login message
      String loginMessage = dr.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals("Welcome Back, admin", loginMessage);
  }

  @AfterClass
  public void afterClass() {
	//close the browser
	  dr.close();
  }
  

}
