package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_2 {
	WebDriver dr;
  
  @BeforeTest
  public void beforeTest() {
	//Create a new instance of the Firefox driver
	dr = new FirefoxDriver();
			
	//Open Browser
	dr.get("https://www.training-support.net/selenium/target-practice");
  }
  
  @Test
  public void testCase1() {
	//This test case will pass
      String title = dr.getTitle();
      System.out.println("Title is: " + title);
      Assert.assertEquals(title, "Target Practice");
  }
  
  @Test
  public void testCase2() {
	  //This test case will Fail
      WebElement blackButton = dr.findElement(By.cssSelector("button.black"));
      Assert.assertTrue(blackButton.isDisplayed());
      Assert.assertEquals(blackButton.getText(), "black");
  }
  
  @Test (enabled = false)
  public void testCase3() {
	//This test will be skipped and not counted
      String subHeading = dr.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }
  
  @Test
  public void testCase4() {
	  //This test will be skipped and will be be shown as skipped
      throw new SkipException("Skipping test case");  
  }

  @AfterTest
  public void afterTest() {
	  //close the browser
	  dr.close();
  }

}
