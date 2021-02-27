package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity_12_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions action = new Actions(driver);
        
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println("The Title of the page: " + driver.getTitle());
		
		//nested Frame0
		WebElement signin = driver.findElement(By.cssSelector("[onclick=\"openModal()\"]"));   
		action.moveToElement(signin).pause(Duration.ofSeconds(2)).build().perform();
		
        System.out.println("Signin Hover text: " + signin.getAttribute("data-tooltip"));
		
        signin.click();
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        
        driver.findElement(By.id("username")).sendKeys("admin");
    	
        driver.findElement(By.id("password")).sendKeys("password");
	
        driver.findElement(By.cssSelector("[onclick='signIn()']")).click();
        
		WebElement signinmsg = driver.findElement(By.id("action-confirmation"));   
		
        wait.until(ExpectedConditions.visibilityOf(signinmsg));

        System.out.println("Signin success message: " + signinmsg.getText());

        driver.close();
	
    }
	
}