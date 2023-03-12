package advselenium.wcsm27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfilePractice 
{
public static void main(String[] args) throws IOException {
	//step 1:- load the file in java readable format by using file input stream
	FileInputStream fis= new FileInputStream(".\\src\\main\\resources\\CommonData.Properties");
	// step 2: create a object of properties from java.util
	Properties pobj= new Properties();
	// step 3:  load file input stream into properties
	pobj.load(fis);
	//step 4:  using the key read the value
	String BROWSER=pobj.getProperty("browser");
	System.out.println(BROWSER);
}
}
