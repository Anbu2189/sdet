package orangeHRMproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity_5 {
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
	    
	    //Find myInfo item and click it
	    WebElement myInfo = dr.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b"));
	    wait.until(ExpectedConditions.visibilityOf(myInfo));
	    myInfo.click();
	    
	    WebElement Edit = dr.findElement(By.id("btnSave"));
	    wait.until(ExpectedConditions.visibilityOf(Edit));
	    Edit.click();
	    
	    WebElement fName = dr.findElement(By.id("personal_txtEmpFirstName"));
	    fName.click();
	    fName.clear();
	    fName.sendKeys("Athiyan");
	    
	    WebElement lastName = dr.findElement(By.id("personal_txtEmpLastName"));
	    lastName.click();
	    
		action.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build().perform();
		  Thread.sleep(1000);
		  //lastName.clear();
	     lastName.sendKeys("Anbarasan");
	     
	     Select dropdown = new Select(dr.findElement(By.id("personal_cmbNation")));
	     dropdown.selectByVisibleText("Indian");
	     WebElement dob =dr.findElement(By.id("personal_DOB"));
	     dob.clear();
	     dob.sendKeys("2020-12-05");
	  
	    
	    dr.findElement(By.id("btnSave")).click();
	    Thread.sleep(1000);
	    
	  }

  @AfterClass
  public void afterClass() {
	  //Close the browser
	  dr.close();
  }

}
