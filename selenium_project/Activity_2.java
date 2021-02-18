package orangeHRMproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {

	public static void main(String[] args) throws InterruptedException {
		//Create an instance of Firefox driver
		WebDriver dr = new FirefoxDriver(); 
				
		//Open the browser
		dr.get("http://alchemy.hguy.co/orangehrm");
		Thread.sleep(1000);
		
		//Get the header URL
		WebElement img = dr.findElement(By.xpath("//img"));
		
		//print the header url of src attribute
		System.out.println("The header URL is: " + img.getAttribute("src"));
		
		//Close the browser
		dr.close();

	}

}
