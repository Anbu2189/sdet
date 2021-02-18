package orangeHRMproject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity_1 {

	public static void main(String[] args) throws InterruptedException {
		//Create an instance of Firefox driver
		WebDriver dr = new FirefoxDriver(); 
		
		//Open the browser
		dr.get("http://alchemy.hguy.co/orangehrm");
		Thread.sleep(1000);
		
		//Get PageTitle and print it
		String title = dr.getTitle();
		System.out.println("The page title is: " + title);
		
		//Assert pagetitle
		Assert.assertEquals(title, "OrangeHRM");
		//Assert.assertTrue(title.contentEquals("OrangeHRM"));
		//Close the browser
		dr.close();
	

	}

}
