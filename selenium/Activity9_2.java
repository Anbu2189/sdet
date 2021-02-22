package seleniumsession3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		
		//Open the browser
		dr.get(" https://training-support.net/selenium/selects");
		
		//Find the page title and print it
		String title = dr.getTitle();
		System.out.println("The title of the page is: " + title);
		
		//Find the multiselect chosen option
		WebElement chosen = dr.findElement(By.cssSelector("h3#multi-value"));
		
		//Find the MultiList
		Select Multiselect = new Select(dr.findElement(By.cssSelector("select#multi-select")));
		
		//
		if(Multiselect.isMultiple()) {
			
			//Select 'JavaScript' by Visible text
			Multiselect.selectByVisibleText("Javascript");
			System.out.println(chosen.getText());
			//Select 'NodeJS' by value
			Multiselect.selectByValue("node");
			System.out.println(chosen.getText());
			//Select 4,5, and 6 options by index
			for (int i=4;i<=6;i++) {
				Multiselect.selectByIndex(i);
			}
			
			//Deselect 'NodeJS' by value
			Multiselect.deselectByValue("node");
			System.out.println("The De-selected option from Multilist is: " + chosen.getText());
			
			//Deselect 7th opttion by index
			Multiselect.deselectByIndex(7);
			System.out.println("The De-selected option from Multilist is: " + chosen.getText());
			//Get all selected options
			List<WebElement> options = Multiselect.getAllSelectedOptions();
			//Print all selected options
			for(WebElement option : options) {
				System.out.println("Selected option: " + option.getText());
			}
			//Deselect all options
			Multiselect.deselectAll();
			System.out.println(chosen.getText());
		}
		
		//Close the browser
		dr.close();

	}

}
