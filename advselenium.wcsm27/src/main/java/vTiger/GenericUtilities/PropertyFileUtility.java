package vTiger.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class consists of generic methods related to property file
 * @author vivek
 *
 */
public class PropertyFileUtility 
{
	/**
	 * This method will read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String readDataFromPropertyFile(String key) throws IOException 
{
    FileInputStream fis =new FileInputStream(IConstantsUtility.propertyFilepath);	
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(key);
	return value;
	
	
}
}
