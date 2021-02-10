package seleniumsession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// Create a new instance of Firefoxdriver
		WebDriver dr = new FirefoxDriver();
		//Open a browser
		dr.get("https://www.training-support.net");
		//get pageTitle and print it
		String pageTitle = dr.getTitle();
		System.out.println("The title of the page is: " + pageTitle);
		
		//Find the About Us link using id()
		WebElement idLocator = dr.findElement(By.id("about-link"));
		System.out.println("The Text in element: " + idLocator.getText());
		
		//Find the About Us link using className()
		WebElement classNameLocator = dr.findElement(By.className("green"));
		System.out.println("The Text in element: " + classNameLocator.getText());
		
		//Find the About Us link using cssSelector()
		WebElement cssSelectorLocator = dr.findElement(By.cssSelector("#about-link"));
		System.out.println("The Text in element: " + cssSelectorLocator.getText());
		
		//Find the About Us link using linkText()
		WebElement linkTextLocator = dr.findElement(By.linkText("About Us"));
		System.out.println("The Text in element: " + linkTextLocator.getText());
		
		//Close the browser
		dr.close();
		
	}

}
