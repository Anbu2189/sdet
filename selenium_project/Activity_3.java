package orangeHRMproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class Activity_3 {

	public static void main(String[] args) throws InterruptedException {
		//Create an instance of Firefox driver
		WebDriver dr = new FirefoxDriver(); 
						
		//Open the browser
		dr.get("http://alchemy.hguy.co/orangehrm");
		Thread.sleep(1000);
		
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
		
		//Verify homepage is displayed
		WebElement homepage = dr.findElement(By.id("welcome"));
		System.out.println("Welcome message is: " + homepage.getText());
		
		String welcomeMessage = homepage.getText();
		Assert.assertEquals(welcomeMessage, "Welcome deviS");
		
		//close the browser
		dr.close();
	}

}
