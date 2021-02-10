package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(dr,10);
				
		//Open the browser
		dr.get("https://training-support.net/selenium/ajax");
		
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find and click the button
		WebElement button = dr.findElement(By.cssSelector("button.ui.violet"));
		button.click();
		
		//Wait for text to load
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div/h1"), "HELLO!"));
		
		//getText() and print it
		String ajaxtext = dr.findElement(By.xpath("//h1")).getText();
		System.out.println("The ajax text is: " + ajaxtext);
		
        //Wait for late text
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div/h3"), "I'm late!"));
		
		//get late Text() and print it
		String latetext = dr.findElement(By.xpath("//h3")).getText();
		System.out.println("The ajax text is: " + latetext);
		
		//Close browser	
		dr.close();
	}

}
