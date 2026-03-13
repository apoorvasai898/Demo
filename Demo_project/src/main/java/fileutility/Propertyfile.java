package fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
		
	public String getDatafromProperty(String key) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/Commondata/Config data");
		Properties poj=new Properties();
		poj.load(fis);
		String data=poj.getProperty(key);
		return data;
		
		
		
		
		
		
		}

	}



