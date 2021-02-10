package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (dr,10);
		
		//Open the browser
		dr.get("https://training-support.net/selenium/dynamic-controls");
				
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find the checkbox
		WebElement checkbox = dr.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement togglecheckbutton = dr.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		
		togglecheckbutton.click();
		
		//Wait for checkbox to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		togglecheckbutton.click();
		
		//Wait for checkbox to appear
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		checkbox.click();
		
		//Close the browser
		dr.close();
	}

}
