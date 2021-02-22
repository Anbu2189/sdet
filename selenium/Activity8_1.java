package seleniumsession3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
		
		//Open the browser
		dr.get("https://www.training-support.net/selenium/tables");
		
		//Get Number of columns
		List<WebElement> cols = dr.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		//Get Number of rows
		List<WebElement> rows = dr.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		
		//Print them
		System.out.println("Number of columns are: " + cols.size());
		System.out.println("Number of rows are: " + rows.size());
		
		//Get third row values and print them
		List<WebElement> thirdRow = dr.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[3]/td"));
		for(WebElement i :thirdRow ) {
			System.out.println("Cell values in third row is :" + i.getText());
		}
		
		//Cell value of second row, second column
		WebElement cell2 = dr.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("The cell value of second row & second column: " + cell2.getText());
		
		//Close the browser
		dr.close();
	}

}
