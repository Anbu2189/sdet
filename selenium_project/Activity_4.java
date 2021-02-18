package orangeHRMproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Activity_4 {
  
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
  public void addnewEmployee() throws InterruptedException {
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
    
    //Find PIM option
    WebElement PIM = dr.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
    PIM.click();
    WebElement Add = dr.findElement(By.id("btnAdd"));
    wait.until(ExpectedConditions.visibilityOf(Add));
    
    //Click Add button
    Add.click();
    
    //Add data
    WebElement firstName = dr.findElement(By.id("firstName"));
    WebElement lastName = dr.findElement(By.id("lastName"));
    
    //SendKeys
    firstName.sendKeys("Adhiyan");
    lastName.sendKeys("Anbarasan");
    
    dr.findElement(By.id("btnSave")).click();
    dr.findElement(By.id("menu_pim_viewEmployeeList")).click();
    Thread.sleep(1000);
    
    //Search Employee
    WebElement empName = dr.findElement(By.id("empsearch_employee_name_empName"));
    Thread.sleep(1000);
    empName.sendKeys("Adhiyan Anbarasan");
    dr.findElement(By.id("searchBtn")).click();
    
    //Verify record is displayed
    WebElement cell = dr.findElement(By.xpath("//tbody/tr[1]/td[3]/a"));
    System.out.println("The first name is: " + cell.getText());
    
    WebElement cell1 = dr.findElement(By.xpath("//tbody/tr[1]/td[4]/a"));
    System.out.println("The last name is: " + cell1.getText());
    
    System.out.println("The full name is :" + cell.getText() + " " + cell1.getText());
    String fname = cell.getText();
    String lname = cell1.getText();
    
    Assert.assertEquals("AdhiyanAnbarasan", fname + lname);
    
  }

  @AfterClass
  public void afterClass() {
	//Close the browser
	dr.close();
  }

}
