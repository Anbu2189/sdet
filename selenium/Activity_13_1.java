package Selenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


public class Activity_13_1 {
	public static void main(String[] args) throws IOException, CsvException 
	{
        
        CSVReader reader = new CSVReader(new FileReader("src\\CSVTest.csv"));
        
        List<String[]> csvvalues = reader.readAll();
        System.out.println("The total number of rows: " + csvvalues.size());
        
      //Create Iterator reference
        Iterator<String[]> itr = csvvalues.iterator();

        //Iterate all values
        while(itr.hasNext()) {
            String[] str = itr.next();

            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
                System.out.println(" ");
        }
        
        reader.close();
	
    }
	
}