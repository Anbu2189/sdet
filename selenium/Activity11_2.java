package seleniumsession3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
				
		//Open the browser
		dr.get("https://www.training-support.net/selenium/javascript-alerts");
		
		//Get the title and print it
		System.out.println("The title of the page is: " + dr.getTitle());
		
		//Find button
		WebElement button = dr.findElement(By.id("confirm"));
		button.click();
		Thread.sleep(1000);
		
		//Switch to alert window
		Alert ConfirmAlert = dr.switchTo().alert();
		
		//Get text in the alert box and print it
		String CAtext = ConfirmAlert.getText();
		System.out.println("The Confirm alert text is: " + CAtext);
		
		//accept alert
		Thread.sleep(1000);
		ConfirmAlert.accept();
		
		
		//dismiss alert
		button.click();
		dr.switchTo().alert();
		Thread.sleep(1000);
		ConfirmAlert.dismiss();
		
		//CLose the browser
		dr.close();
	}

}
