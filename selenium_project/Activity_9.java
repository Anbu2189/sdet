package orangeHRMproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity_9 {
	 WebDriver dr;
	 WebDriverWait wait;
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
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
		
		WebElement myInfo = dr.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b"));
	    wait.until(ExpectedConditions.visibilityOf(myInfo));
	    myInfo.click();
	    
	    WebElement emerCont = dr.findElement(By.partialLinkText("Emergency"));
	    emerCont.click();
	    
	  //Get columns
	  List<WebElement> cols = dr.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr[1]/td"));
	  //List<WebElement> cols = dr.findElements(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th"));
	  //Get Rows
	  List<WebElement> rows = dr.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
	  //Number of columns
	  System.out.println("The Number of columns are: " + cols.size());
	  //Number of rows
	  System.out.println("The Number of rows are: " + rows.size());
	  
	  //Get all row values and print them
	  List<WebElement> header = dr.findElements(By.xpath("//table[@id='emgcontact_list']/thead"));
		for(WebElement i :header ) {
			System.out.println("Cell values in header is :" + i.getText());
		        }
	  List<WebElement> table = dr.findElements(By.xpath("//table[@id='emgcontact_list']/tbody"));
	  for(WebElement j :table ) {
	  System.out.println("Cell values in entire table is :" + j.getText());
		}
	  
  }


  @AfterClass
  public void afterClass() {
	  //Close the browser
	  dr.close();
  }

}
