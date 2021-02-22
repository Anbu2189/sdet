package seleniumsession3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(dr, 10);
		//Open the browser
		dr.get("https://www.training-support.net/selenium/javascript-alerts");
		
		//Get the title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find sImplealert
		WebElement SA = dr.findElement(By.id("simple"));
		SA.click();
		Thread.sleep(1000);
		
		//Switchto Alert
		Alert SimpleAlert = dr.switchTo().alert();
		System.out.println("Alert text is: " + SimpleAlert.getText());
		wait.until(ExpectedConditions.alertIsPresent());
		//Close the alert
		SimpleAlert.accept();
		
		//Close the browser
		dr.close();

	}

}
