package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
						
		//Open the browser
		dr.get("https://www.training-support.net/selenium/dynamic-attributes");
						
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find username and password fields
		WebElement username = dr.findElement(By.xpath("//input[contains(@class, '-username')]"));
		WebElement password = dr.findElement(By.xpath("//input[contains(@class, '-password')]"));
		WebElement confirmpw = dr.findElement(By.xpath("//input[contains(@name, 'name-')]"));
		WebElement email = dr.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
		
		//Type credentials
		username.sendKeys("Athiyan");
		password.sendKeys("Athiyan");
		confirmpw.sendKeys("Athiyan");
		email.sendKeys("anbuadonis2010@gmail.com");
		
		//Click Sign Up
		WebElement signup = dr.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
		signup.click();
		//Print login message
		String loginmsg = dr.findElement(By.id("action-confirmation")).getText();
		System.out.println("The login message is: " + loginmsg);
		
		//Close the browser
		dr.close();
	}

}
