package seleniumsession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Create a new instance of Firefoxdriver
		WebDriver dr = new FirefoxDriver();
		//Open a browser
		dr.get("https://www.training-support.net");
		Thread.sleep(2000);
		//Close the browser
		dr.close();
	}

}
