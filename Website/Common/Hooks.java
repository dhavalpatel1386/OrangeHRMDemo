package Common;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Utility.ReadConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public WebDriver driver;
	public ReadConfig readConfig;
	@Before
	public void setUp() throws FileNotFoundException
	{
		readConfig=new ReadConfig();
		System.setProperty("webdriver.chrome.driver",readConfig.getDriver());
		driver=new ChromeDriver();
		driver.get(readConfig.getUrl());
		driver.manage().window().maximize();
	}
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	
}
