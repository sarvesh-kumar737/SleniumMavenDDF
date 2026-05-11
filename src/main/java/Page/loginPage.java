 package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage
{
	
	
	WebDriver driver;
	
	
	@FindBy(xpath="//button[@class='action-button' and text()='Get Started']")
	WebElement getstrt;
	
	@FindBy(xpath="//*[@id='mat-radio-3-input']")
	WebElement extr;
	
	
	//@FindBy(id="user-name")
	@FindBy(id="mat-input-0")
	WebElement username;
	
	
	//@FindBy(id="password")
	@FindBy(id="mat-input-1")
	WebElement password;
	
	
	@FindBy(xpath="//*[@id='mat-mdc-dialog-0']/div/div/app-login-modal/div/div[2]/div/div[2]/form/div/div/div[3]/button")
	WebElement login;
	
	
	
	
	public loginPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	// Action Logic
	
	public void getstartedLogin()
	{
		
		getstrt.click();
		
		
	}
	
	public void externalUser()
	{
		
		extr.click();
		
		
		
	}
	
	
	public void verifyLogin(String uname, String pwd)
	{
		
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pwd);
		login.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
