package seleniumsession3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(dr,10);
		
		//Open the browser
		dr.get("https://www.training-support.net/selenium/tab-opener");
		
		//Get title of the page and print it
		String title = dr.getTitle();
		System.out.println("The page title is: " + title);
		
		//Get parent window handle
		String Parentwindow = dr.getWindowHandle();
		System.out.println("The Parent window handle is: " + Parentwindow);
		
		//Find link to open new tab and click it
		WebElement Newtab = dr.findElement(By.linkText("Click Me!"));
		Newtab.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//Get Window handles
		Set<String> allWindowHandles = dr.getWindowHandles();
		System.out.println("All window handles: " + allWindowHandles);
		
		//Loop through each handle
		for(String handle : dr.getWindowHandles()) {
			dr.switchTo().window(handle);
		}
		
		//Print the handle of the current window
		System.out.println("Current window handle: " + dr.getWindowHandle() );
		
		//Wait for page to load completely
		wait.until(ExpectedConditions.titleIs("Newtab"));
		
		//Print New Tab Title
		System.out.println("New Tab title is: " + dr.getTitle());
		
		 //Wait for the elements to load completely
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content")));
		
		 //Get heading on new page
		WebElement heading = dr.findElement(By.cssSelector("div.content:nth-child(2)"));
		System.out.println("New Tab Heading is: " + heading.getText());
		
		//Open Another Tab
		dr.findElement(By.linkText("Open Another One!")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		  //Make sure the new tab's handle is part of the handles set
        allWindowHandles = dr.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);
 
        //Loop through the handles set till we get to the newest handle
        for (String handle : dr.getWindowHandles()) {
            dr.switchTo().window(handle);
        }
 
        //Print the handle of the current window
        System.out.println("New tab handle: " + dr.getWindowHandle());
        
        //Wait for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        
        //Print New Tab Title
        System.out.println("New Tab title is: " + dr.getTitle());
        
        //Wait for the elements to load completely
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content")));
        
        //Get heading on new page
        WebElement heading1= dr.findElement(By.cssSelector("div.content:nth-child(2)"));
        System.out.println("New tab heading is: " + heading1.getText());
 
        //Close the browser
        dr.quit();
	}

}
