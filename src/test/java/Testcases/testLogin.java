package Testcases;
import Base.baseClass;
import Utilities.configReader;

import java.util.Properties;

import org.testng.annotations.Test;
import Page.loginPage;

public class testLogin extends baseClass
{
	
	Properties prop;
	loginPage lp;
	
	@Test
	public void login()
	{
		
		

		//configReader cr = new configReader();
		
		String User = cr.getUsername();
		String pwd = cr.getPassword();
		
		System.out.print(User +" " +pwd);
		
		
		lp = new loginPage(driver);
		
		lp.getstartedLogin();
		lp.externalUser();
		lp.verifyLogin(User, pwd);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
