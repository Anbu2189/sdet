package seleniumsession3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver dr = new FirefoxDriver();
				
		//Open the browser
		dr.get("https://www.training-support.net/selenium/tables");
		
		//Get columns
		List<WebElement> cols = dr.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		//List<WebElement> cols = dr.findElements(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th"));
		//Get Rows
		List<WebElement> rows = dr.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		//Number of columns
		System.out.println("The Number of columns are: " + cols.size());
		//Number of rows
		System.out.println("The Number of rows are: " + rows.size());
		
		//Cell value of second row, second column
		WebElement cell2 = dr.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Second row, second column value(before sorting): " + cell2.getText());		
		
		//Sort the table
		WebElement sort = dr.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]"));
		sort.click();
		
		//Print the value again
		WebElement cell2aftersort = dr.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Second row, second column value(after sorting): " + cell2aftersort.getText());	
		
		
		
		//Print footer cell value
		WebElement fcellvalue = dr.findElement(By.xpath("//tfoot/tr"));
		System.out.println("The footer cell value: " + fcellvalue.getText());
		
		
		//Close the browser
		dr.close();

	}

}
