package testNGActivities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
  
	@BeforeSuite
	  public void beforesuite() {
			  System.out.println("Before Suite"); 
			  }
	
  @BeforeTest
  public void beforetest() {
		  System.out.println("Before Test"); 
		  }

  @BeforeClass
  public void beforeclass() {
	  System.out.println("Before Class"); 
	  }
	
  @BeforeMethod
  public void beforem() {
	  System.out.println("Before Method"); 
  }
	
  @Test
  public void first() {
	  System.out.println("Hello World");
  }
  @Test
  public void second() {
	  System.out.println("Welcome to TestNG");
  }
  
  @AfterMethod
  public void afterm() {
	  System.out.println("After Method"); 
  }
  
  @AfterClass
  public void afterclass() {
	  System.out.println("After Class"); 
	  }
  @AfterTest
  public void aftertest() {
	  System.out.println("After Test"); 
	  }
  @AfterSuite
  public void aftersuite() {
		  System.out.println("After Suite"); 
		  }
}
