package Testcases.StepDefinition;
import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.gen5.api.AfterAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Common.BaseClass;
import Pages.LoginPage;
import Utility.BatchExecution;
import Utility.EmailWithAttachedReport;
import Utility.ReadConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest extends BaseClass {
	
	@Before
	public void setUp() throws FileNotFoundException
	{
		readConfig=new ReadConfig();
		System.setProperty("webdriver.chrome.driver",readConfig.getDriver());
		driver=new ChromeDriver();
		driver.get(readConfig.getUrl());
		driver.manage().window().maximize();
	}
	@After(order=0)
	public void tearDown()
	{
		driver.close();
	}
	

//TCNO.1	
@Given("^I Open valid url$")
public void i_Open_valid_url() throws Throwable {
	
//	setUp();
}

@And("^I enter valid credential$")
public void i_enter_valid_credential() throws Throwable {

	loginPage=new LoginPage(driver);
	loginPage.setUserName(readConfig.getUserName());
	loginPage.setPassword(readConfig.getPassword());
	
}

@Then("^I redirect to Dashbord$")
public void i_redirect_to_Dashbord() throws Throwable {
	loginPage.clkLogin();
	
	String Title=driver.getTitle();
	Assert.assertEquals(Title,"OrangeHRM");
}

//TCNO.2
@When("^I click on the Login button without entering username password$")
public void i_click_on_the_Login_button_without_entering_username_password() throws Throwable {
	loginPage=new LoginPage(driver);
	loginPage.clkLogin();
}

@Then("^It should shows expected validation error message$")
public void it_should_shows_expected_validation_error_message() throws Throwable {
	loginPage.valErrorMessage();
}

//TCNo.3
@When("^I click on ForgotPassword link$")
public void i_click_on_ForgotPassword_link() throws Throwable {
	loginPage=new LoginPage(driver);
	loginPage.clkForgotPasswordlnk();
}

@When("^I click on Cancel button$")
public void i_click_on_Cancel_button() throws Throwable {
    loginPage.clkCancel();
}

@Then("^I redirect to Login Screen$")
public void i_redirect_to_Login_Screen() throws Throwable {
	String Title=driver.getTitle();
	Assert.assertEquals(Title,"OrangeHRM");
}

	
}
