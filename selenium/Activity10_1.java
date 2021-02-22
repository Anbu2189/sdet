package seleniumsession3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		Actions action = new Actions(dr);
		
		//Open the browser
		dr.get("https://www.training-support.net/selenium/input-events");
		
		//Get the title of page
		System.out.println("The page title is: " + dr.getTitle());
		
		//Find the cube
		WebElement cube = dr.findElement(By.id("D3Cube"));
		
		//Left click & print the value of side in front
		action.click(cube);
		WebElement cubeval = dr.findElement(By.className("active"));
		System.out.println("Left click: " +cubeval.getText() );
		Thread.sleep(1000);
		
		//Double click to show a random side and print the number
		action.doubleClick(cube).perform();
	    cubeval = dr.findElement(By.className("active"));
		System.out.println("Double click: " +cubeval.getText() );
		Thread.sleep(1000);
		
		//Right click and print the value shown on front of the cube
		action.contextClick(cube).perform();
		cubeval = dr.findElement(By.className("active"));
		System.out.println("Right click: " +cubeval.getText() );
		Thread.sleep(1000);
		
		//Close the browser
		dr.close();
	}

}
