package seleniumsession3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
	
	public static void main(String[] args) throws InterruptedException {
	
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
				
		//Open the browser
		dr.get("https://www.training-support.net/selenium/javascript-alerts");
		
		//Print title of page and heading on page
		System.out.println("Page title is: " + dr.getTitle());
		
		//Click the button to open a prompt
		WebElement button = dr.findElement(By.id("prompt"));
		button.click();
		Thread.sleep(1000);
		
		//Switch to prompt window
		Alert prompt = dr.switchTo().alert();
		
		//Get text in the prompt box and print it
		System.out.println("Prompt text is: " + prompt.getText());
		
		//Type "Awesome!" into the prompt
		prompt.sendKeys("Awesome!");
		Thread.sleep(1000);
		
		//Close the prompt
		prompt.accept();
		
		//Close the browser
		dr.close();
	}

}
