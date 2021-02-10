package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		
		// Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		
		//Open the browser
		dr.get("https://www.training-support.net/selenium/dynamic-controls");
		
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
				
		//Find the checkbox
		WebElement checkbox = dr.findElement(By.xpath("//input[@type = 'checkbox']"));
		System.out.println("The checkbox is selected: " + checkbox.isSelected());
		
		//Select the checkbox
		checkbox.click();
		
		//Print status
		System.out.println("The checkbox is selected: " + checkbox.isSelected());
		
		//Close the browser
		dr.close();

	}

}
