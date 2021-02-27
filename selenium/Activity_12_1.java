package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity_12_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("The Title of the page: " + driver.getTitle());
		
		//Frame1
		WebElement frame1 = driver.findElement(By.cssSelector("[src='/selenium/frame1']"));        
		driver.switchTo().frame(frame1);
		
        WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println("The Heading of the first frame: " + frameHeading1.getText());
        
        WebElement framebtn1 = driver.findElement(By.id("actionButton"));
        System.out.println("The Text of the button at first frame: " + framebtn1.getText());
        System.out.println("The Color of the button at first frame: " + framebtn1.getCssValue("background-color"));
        
        framebtn1.click();
        System.out.println("The Text of the button at first frame after first click: " + framebtn1.getText());
        System.out.println("The Color of the button at first frame after first click: " + framebtn1.getCssValue("background-color"));
        
        framebtn1.click();
        System.out.println("The Text of the button at first frame after second click: " + framebtn1.getText());
        System.out.println("The Color of the button at first frame after second click: " + framebtn1.getCssValue("background-color"));
        
        //Frame2
        driver.switchTo().parentFrame();
        WebElement frame2 = driver.findElement(By.cssSelector("[src='/selenium/frame2']"));        
		driver.switchTo().frame(frame2);
		
        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println("\nThe Heading of the second frame: " + frameHeading2.getText());
        
        WebElement framebtn2 = driver.findElement(By.id("actionButton"));
        System.out.println("The Text of the button at second frame: " + framebtn2.getText());
        System.out.println("The Color of the button at second frame: " + framebtn2.getCssValue("background-color"));
        
        framebtn2.click();
        System.out.println("The Text of the button at second frame after first click: " + framebtn2.getText());
        System.out.println("The Color of the button at second frame after first click: " + framebtn2.getCssValue("background-color"));
        
        framebtn2.click();
        System.out.println("The Text of the button at second frame after second click: " + framebtn2.getText());
        System.out.println("The Color of the button at second frame after second click: " + framebtn2.getCssValue("background-color"));
        

        driver.close();
	
    }
	
}