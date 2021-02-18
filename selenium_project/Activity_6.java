package orangeHRMproject;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity_6 {
	
	 WebDriver dr;
	 WebDriverWait wait;
	 

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	//Create an instance of Firefox driver
	dr = new FirefoxDriver();
	wait  = new WebDriverWait(dr,10);
	
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
	
	//Find Directory menu
	WebElement directory = dr.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']/b"));
	wait.until(ExpectedConditions.visibilityOf(directory));
	directory.click();
	
	//
	WebElement heading = dr.findElement(By.xpath("//div[@class = 'head']/h1"));
	System.out.println("The heading text is: " + heading.getText());
	Assert.assertEquals("Search Directory", heading.getText());
	
  }

  @AfterClass
  public void afterClass() {
	//Close the browser
	  dr.close();
  }

}
