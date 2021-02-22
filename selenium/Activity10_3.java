package seleniumsession3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(dr, 10);
		
		//Open the browser
		dr.get("https://training-support.net/selenium/drag-drop");
		
		//Get title of the page and print it
		String title = dr.getTitle();
		System.out.println("The page title is: " + title);
		
		// Wait for the ball to load
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		
		// Save the different elements in variables
		 WebElement ball = dr.findElement(By.id("draggable"));
	     WebElement drop1 = dr.findElement(By.id("droppable"));
	     WebElement drop2 = dr.findElement(By.id("dropzone2"));
	     
	   // Compile a custom action for Drag/Drop and perform it.
		Actions draganddrop = new Actions(dr);
		draganddrop.dragAndDrop(ball, drop1).build().perform();
		
		 // Wait for the Dropzone's color to change 
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("ENTERED DROPZONE 1");
        
        // Repeat for the second dropzone
        draganddrop.dragAndDrop(ball, drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");
        
        // Close the browser
        dr.close();
		
	}

}
