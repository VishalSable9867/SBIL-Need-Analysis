package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readfromproperties {
	
	String path ="C:\\Users\\Admin\\eclipse-workspace\\seleniumByPawanKumar\\openCart\\src\\test\\resources\\data.properties";
	public String readfromproperty(String key) throws IOException
	{
		Properties p =new Properties();
		FileInputStream file = new FileInputStream(path);
		p.load(file);
		return p.getProperty(key);
		
	}

}
