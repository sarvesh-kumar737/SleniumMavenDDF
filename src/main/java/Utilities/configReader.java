package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader 
{
	
	Properties prop;
	
	public configReader()
	{
		
		try
		{
			
			FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            // Properties class helps to retrieve information from the config.properties file
            prop = new Properties();
            
            prop.load(fis);
			
		}
		
		catch(IOException e)
		{
			
			e.printStackTrace();
		}
		
	}
	
	public String getBrowser()
	 {
	    
		return prop.getProperty("browser");
		
		
	    }
	
	
	public String getUrl()
	{
       return prop.getProperty("url");
   }
	
	public String getUsername()
	{
		
		return prop.getProperty("UserName");
		
	}
	
	public String getPassword()
	{
		
		return prop.getProperty("password");
	}
	
	public String getImplicitWait()
	{
       return prop.getProperty("implicitWait");
   }

   public String getPageLoadTimeout()
   {
       return prop.getProperty("pageLoadTimeout");
   }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
