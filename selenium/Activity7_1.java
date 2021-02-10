package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) throws InterruptedException {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
				
		//Open the browser
		dr.get("https://www.training-support.net/selenium/dynamic-attributes");
				
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find username and password fields
		//WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        //WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
		WebElement username = dr.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
		WebElement password = dr.findElement(By.xpath("//input[contains(@class, 'password')]"));
		
		//Type credentials
		username.sendKeys("admin");
		password.sendKeys("password");
		Thread.sleep(2000);
		
		//Click Log in
		WebElement login = dr.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		//Print login message
		String loginMessage = dr.findElement(By.id("action-confirmation")).getText();
		System.out.println("The login message is: " + loginMessage);
		
		//Close browser
		dr.close();
	}

}
