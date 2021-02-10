package seleniumsession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		
		//Open the browser
		dr.get("https://www.training-support.net/selenium/target-practice");
		
        //Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		  //Find the third header
		WebElement Header3 = dr.findElement(By.cssSelector("h3.ui.yellow.header"));
		System.out.println("The third header is: " + Header3.getText());
		
		//Find the fifth header and get it's colour
		String Header5 = dr.findElement(By.xpath("//h5")).getCssValue("Color");
		System.out.println("The fifth header colour is: " + Header5);
		
		//Find the violet button and print it's classes
		//WebElement Violetbutton = dr.findElement(By.xpath("//button[contains(text(),'violet')]"));
		//WebElement Violetbutton = dr.findElement(By.xpath("//body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]"));
		WebElement Violetbutton = dr.findElement(By.xpath("//button[text()='Violet']"));
		System.out.println("The classes of violet button is: " + Violetbutton.getAttribute("class"));
		
		//Find the grey button with Absolute XPath
		String greybutton = dr.findElement(By.xpath("//body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("The text of grey button is: " + greybutton);
		
		//Close the browser
		dr.close();
	}

}
