package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver lDriver;
	public LoginPage(WebDriver rDriver)
	{
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
		
	}

	@FindBy(how=How.XPATH, using="//*[@id='txtUsername']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(how=How.XPATH, using="//*[@id='txtPassword']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how=How.XPATH, using="//*[@id='btnLogin']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(how=How.CSS, using="span#spanMessage")
	@CacheLookup
	WebElement valMessage;
	
	@FindBy(how=How.XPATH, using="//a[text()='Forgot your password?']")
	@CacheLookup
	WebElement lnkForgotPassword;
	
	@FindBy(how=How.XPATH, using="//*[@id='btnCancel']")
	@CacheLookup
	WebElement btnCancel;
	
	
	public void setUserName(String Uname)
	{
		txtUserName.clear();
		txtUserName.sendKeys(Uname);
	}
	
	public void setPassword(String Pass)
	{
		txtPassword.clear();
		txtPassword.sendKeys(Pass);
	}
	public void clkLogin()
	{
		btnLogin.click();
	}
	public void valErrorMessage()
	{
		String valText=valMessage.getText();
		if(valText.contains("Username cannot be empty"))
		{
			System.out.println("TestPass");
		}
		else
		{
			System.out.println("TestFailed");
		}
	}
	
	public void clkForgotPasswordlnk()
	{
		lnkForgotPassword.click();
	}
	
	public void clkCancel()
	{
		btnCancel.click();
	}
}
