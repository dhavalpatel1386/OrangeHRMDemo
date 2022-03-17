package Common;

import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Utility.BatchExecution;
import Utility.EmailWithAttachedReport;
import Utility.ReadConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public ReadConfig readConfig;
	public Hooks hooks;
	public EmailWithAttachedReport email;
	public static BatchExecution batExecution;
	
//	@Before
	public void setUp() throws FileNotFoundException
	{
		readConfig=new ReadConfig();
		System.setProperty("webdriver.chrome.driver",readConfig.getDriver());
		driver=new ChromeDriver();
		driver.get(readConfig.getUrl());
		driver.manage().window().maximize();
	}
//	@After
	public void tearDown()
	{
		driver.close();
	}


}
