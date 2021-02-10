package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Create WebDriver Instance
		WebDriver dr = new FirefoxDriver();
		
		//Launch link
		dr.get("https://www.training-support.net");
		
		//Get the title of the page
		String pageTitle = dr.getTitle();
		System.out.println("The title of the page is: " + pageTitle);
		
		//Find element using xpath()
		//Relative xpath by id
		//WebElement Aboutus = dr.findElement(By.xpath("//a[@id='about-link']"));
		
		//Relative xpath by class
		//WebElement Aboutus = dr.findElement(By.xpath("//a[@class='ui inverted huge green button']"));
		
		////Relative xpath by function
		//WebElement Aboutus = dr.findElement(By.xpath("//a[text()='About Us']"));
		
		//Absolute Xpath
		WebElement Aboutus = dr.findElement(By.xpath("//div[3]/div/div[2]/a"));
		Aboutus.click();
		
		//Get the new title of the page
		String newpageTitle = dr.getTitle();
		System.out.println("The title of new page is: " + newpageTitle);
		Thread.sleep(2000);
		
		//Close the browser
		dr.close();
	}

}
