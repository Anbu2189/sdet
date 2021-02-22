package orangeHRMproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity_8 {
	 WebDriver dr;
	 WebDriverWait wait;
 
  @BeforeClass
  public void beforeClass() throws InterruptedException   {
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
	
	//Click applyleave
	WebElement Applyleave = dr.findElement(By.linkText("Apply Leave"));
	Applyleave.click();
	  
	Select dropdown = new Select(dr.findElement(By.id("applyleave_txtLeaveType")));
	dropdown.selectByVisibleText("Paid Leave");
	
	  WebElement fromDate = dr.findElement(By.id("applyleave_txtFromDate"));
	    WebElement toDate = dr.findElement(By.id("applyleave_txtToDate"));
	    fromDate.clear();
	    fromDate.sendKeys("2021-02-25");
	    toDate.clear();
	    toDate.sendKeys("2021-02-25");
	    WebElement comment = dr.findElement(By.id("applyleave_txtComment"));
	    comment.sendKeys("Paid Leave");
	    Thread.sleep(2000);
	    
	    //Save after changes
	    WebElement apply = dr.findElement(By.id("applyBtn"));
	    apply.click();
	    
	    //Find My Leave and click
	    WebElement myLeave = dr.findElement(By.id("menu_leave_viewMyLeaveList"));
	    myLeave.click();
	    
	    //MyLeave List
	    WebElement fromDate1 = dr.findElement(By.id("calFromDate"));
	    WebElement toDate1 = dr.findElement(By.id("calToDate"));
	    fromDate1.clear();
	    fromDate1.sendKeys("2021-02-25");
	    toDate1.clear();
	    toDate1.sendKeys("2021-02-25");
	    
	    //Search button
	    WebElement search = dr.findElement(By.id("btnSearch"));
	    search.click();
	    
	    //Check the status of leave application
	    WebElement status = dr.findElement(By.xpath("//tbody/tr[1]/td[6]/a"));
	    System.out.println("The status is: " + status.getText());
	    Assert.assertEquals("Pending Approval(1.00)", status.getText());
	    
  }

  @AfterClass
  public void afterClass() {
	  //Close the browser
	  dr.close();
  }

}
