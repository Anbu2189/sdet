package seleniumsession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// Ctrl+Shift+O -----> imports all import ones(shortcut)

public class Welcome {

	public static void main(String[] args) throws InterruptedException {
		
		// Initiating driver object
		WebDriver dr = new FirefoxDriver();
		
		//Launching URL
		dr.get("https://www.google.com");
		
		//wait
		Thread.sleep(1000);
		
		// Close the browser
		dr.close();

	}

}
