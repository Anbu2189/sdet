package orangeHRMproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_7 {
	
	 WebDriver dr;
	 WebDriverWait wait;
	 Actions action;

  @BeforeClass
  public void beforeClass() throws InterruptedException {
		//Create an instance of Firefox driver
		dr = new FirefoxDriver();
		wait  = new WebDriverWait(dr,10);
		action = new Actions(dr);
		
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
	
	//Find myInfo item and click it
    WebElement myInfo = dr.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b"));
    wait.until(ExpectedConditions.visibilityOf(myInfo));
    myInfo.click();
    
    //Find qualification option on left side and click
    WebElement q = dr.findElement(By.linkText("Qualifications"));
    q.click();
    
    //Click add work experience button
    WebElement add = dr.findElement(By.id("addWorkExperience"));
    add.click();
    
    //Fill data
    WebElement Company = dr.findElement(By.id("experience_employer"));
    WebElement title = dr.findElement(By.id("experience_jobtitle"));
    WebElement comment = dr.findElement(By.id("experience_comments"));
    WebElement fromDate = dr.findElement(By.id("experience_from_date"));
    WebElement toDate = dr.findElement(By.id("experience_to_date"));
    
    Company.sendKeys("IBM");
    title.sendKeys("Test Specialist-Automation");
    comment.sendKeys("Test");
    
	fromDate.clear();
    fromDate.sendKeys("1989-01-21");
    toDate.clear();
    toDate.sendKeys("2021-02-17");
    
    WebElement save = dr.findElement(By.id("btnWorkExpSave"));
    save.click();
    Thread.sleep(1000);
  }

  @AfterClass
  public void afterClass() {
	  //Close the browser
	  //dr.close();
  }

}
