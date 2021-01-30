package session4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Create a new text file using the default file class
		File file = new File("src/session4/newfile.txt");
		boolean fstatus = file.createNewFile();
		if(fstatus) {
			System.out.println("File created successfully");
		}
		else {
			System.out.println("File already exists at this path");
		}
		
		//get the File object
		File f = FileUtils.getFile("src/session4/newfile.txt");
		//Read file
		System.out.println("Data in file: " + FileUtils.readFileToString(f, "UTF8"));
		
		//Create Directory
		File dir = new File("resources");
		//Copy file to Directory
		FileUtils.copyFileToDirectory(file, dir);
		
		//Get file from new directory
		File newFile = FileUtils.getFile(dir, "newfile.txt");
		//Read data from file
		String newFiledata = FileUtils.readFileToString(newFile, "UTF8");
		//Print it
		System.out.println("Data in new File: " + newFiledata);
	}

}
