package seleniumsession3;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) throws HeadlessException, UnsupportedFlavorException, IOException {
		
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		Actions action = new Actions(dr);
		String pressedKeyText;
		
		//Open the browser
		dr.get("https://www.training-support.net/selenium/input-events");
				
		//Get the title of page
		System.out.println("The page title is: " + dr.getTitle());
		WebElement pressedKey = dr.findElement(By.cssSelector("div#keyPressed"));
		
		//Key press for initials
		action.sendKeys("A").build().perform();
		pressedKeyText = pressedKey.getText();
		System.out.println("The pressed key is: " + pressedKeyText);
		
		 //Create action sequence for Spacebar
		action.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.sendKeys("C")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		//Copying the data from clipboard to console
		String copieddata = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println("=====================================");
		System.out.println("The copied data from web page is: " + copieddata);
		
		//Close the browser
		dr.close();
		
	}

}
