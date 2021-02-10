package seleniumsession1;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// $x - to search xpath in console
		// $$ - to search cssselector in console
		
		// Create a new instance of Firefoxdriver
		WebDriver dr = new FirefoxDriver();
		//Open a browser
		dr.get("https://training-support.net/selenium/simple-form");
		//Get the title of the page
		String pageTitle = dr.getTitle();
		System.out.println("The title of the page is: " +pageTitle);
		// Find element Firstname
		//WebElement Firstname = dr.findElement(By.id("firstName"));
		//WebElement Firstname = dr.findElement(By.xpath("//*[@id=\"firstName\"]"));
		WebElement Firstname = dr.findElement(By.cssSelector("#firstName"));
		Firstname.sendKeys("Athiyan");
		Thread.sleep(1000);
		// Find element Lastname
		WebElement Lastname = dr.findElement(By.id("lastName"));
		Lastname.sendKeys("Anbarasan");
		Thread.sleep(1000);
		// Find element Email
		WebElement email = dr.findElement(By.id("email"));
		email.sendKeys("athiyananbarasan@gmail.com");
		Thread.sleep(1000);
		// Find element ContactNumber
		WebElement contactNumber = dr.findElement(By.id("number"));
		contactNumber.sendKeys("8667487219");
		Thread.sleep(1000);
		// Find element Message
		WebElement message = dr.findElement(By.xpath("//*[@id='simpleForm']/div/div[5]/textarea"));
		message.sendKeys("Test Message");
		Thread.sleep(2000);
		 //Click Submit
        dr.findElement(By.cssSelector("input[type='submit']")).click();
        //dr.findElement(By.cssSelector("")).click();
    	Thread.sleep(3000);
    	
    	//Switch to alert window
		Alert SimpleAlert = dr.switchTo().alert();
		
		//Get text in the alert box and print it
		String alerttext = SimpleAlert.getText();
		System.out.println("Alert text is: " + 	alerttext);
		Assert.assertEquals(alerttext, "Thank You for reaching out to us, Athiyan Anbarasan");
		Thread.sleep(2000);
		
		//Close the alert box
		SimpleAlert.accept();
    	
		
        //Close the browser
        dr.close();
	}

}
