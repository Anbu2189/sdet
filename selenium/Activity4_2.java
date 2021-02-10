package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of Firefoxdriver
		WebDriver dr = new FirefoxDriver();
		//Open a browser
		dr.get("https://training-support.net/selenium/simple-form");
		//Get the title of the page
		String pageTitle = dr.getTitle();
		System.out.println("The title of the page is: " +pageTitle);
		
		//Find the input fields and enter text
		WebElement Firstname = dr.findElement(By.xpath("//form/div/div/input"));
		WebElement Lastname = dr.findElement(By.xpath("//*[@id='lastName']"));
		
		Firstname.sendKeys("Athiyan");
		Lastname.sendKeys("Anbarasan");
		Thread.sleep(1500);
		
		
        //Enter the email
        dr.findElement(By.xpath("//input[@type = 'email']")).sendKeys("test@example.com");
 
        //Enter the contact number
        dr.findElement(By.xpath("//form/div/div[4]/input")).sendKeys("1234567890");
 
        //Enter Message
        dr.findElement(By.xpath("//textarea")).sendKeys("This is my message");
 
        //Click Submit
        dr.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        Thread.sleep(2000);
		
		//Close the browser
		dr.close();
	}

}
