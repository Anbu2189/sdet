package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		
		//Open the browser
		dr.get("https://training-support.net/selenium/dynamic-controls");
		
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find the checkbox
		WebElement checkboxInput = dr.findElement(By.cssSelector("label.willDisappear"));
		System.out.println("The checkbox input is displayed: " + checkboxInput.isDisplayed());
		
		//Click the toggle checkbox
		dr.findElement(By.cssSelector("button#toggleCheckbox")).click();
		
		//Print the result again
		System.out.println("The checkbox input is displayed: " + checkboxInput.isDisplayed() );
		
		//Close the browser
		dr.close();
	}

}
