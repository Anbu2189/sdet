package suiteExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeClass
  public void beforeClass() {
	//Create a new instance of the Firefox driver
      driver = new FirefoxDriver();
      wait = new WebDriverWait(driver,10);
          
      //Open the browser
      driver.get("https://www.training-support.net/selenium/login-form");
  }
	
  @Test (priority =0)
  @Parameters({"correctUsername","correctPassword"})
  public void loginSuccessTestCase(String username, String password) throws InterruptedException {
	  //Find username and password fields
	  WebElement usernameField = driver.findElement(By.id("username"));
	  WebElement passwordField = driver.findElement(By.id("password"));
	  
	  //Clear the input fields
	  usernameField.clear();
	  passwordField.clear();
	  
	  //Enter values
	  usernameField.sendKeys(username);
	  passwordField.sendKeys(password);
	  
	  //Click Login
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
	  
	  //Assert Message
	  String loginmessage = driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals(loginmessage, "Welcome Back, admin");
	  
  }
  
  @Test (priority =1)
  @Parameters({"wrongUsername","wrongPassword"})
  public void loginFailedTestCase(String username, String password) {
	  //Find username and password fields
	  WebElement usernameField = driver.findElement(By.id("username"));
	  WebElement passwordField = driver.findElement(By.id("password"));
	  
	  //Clear the input fields
	  usernameField.clear();
	  passwordField.clear();
	  
	  
	  //Enter values
	  usernameField.sendKeys(username);
	  passwordField.sendKeys(password);
	  
	  //Click Login
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
	  
	  //Assert Message
	  String loginmessage1 = driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals(loginmessage1, "Invalid Credentials");
}


 
  @AfterClass
  public void afterClass() {
          
      //Close the browser
      driver.close();
  }

}