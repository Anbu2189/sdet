package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
				
		//Open the browser
		dr.get("https://training-support.net/selenium/dynamic-controls");
				
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find the checkbox
		WebElement checkbox = dr.findElement(By.cssSelector("input#input-text"));
		System.out.println("The checkbox is enabled: " + checkbox.isEnabled());
		//Toggle input
		dr.findElement(By.id("toggleInput")).click();
		
		//Print status
		System.out.println("The checkbox is enabled: " + checkbox.isEnabled());

        //Close the browser
        dr.close();
	}

}
