package UtilityFileProgpt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyProgpt {
	
//	URL
	public static String progptStaging ;
	public static String progptProd ;

	
	public static void readdata() throws IOException 
	{		
		
		Properties url = new Properties();
		FileInputStream urlInput = new FileInputStream("C:\\Users\\Rakib\\eclipse-workspace\\Progpttest\\src\\main\\java\\UtilityFileProgpt\\URLprogpt.properties");
		url.load(urlInput);
		
		progptStaging = url.getProperty("progptStaging");
		progptProd = url.getProperty("progptProd");
		
	}	

}
