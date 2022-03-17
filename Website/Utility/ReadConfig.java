package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	
	Properties prop;
	
	public ReadConfig() throws FileNotFoundException
	{
		try {

			File fi=new File("E:\\OrangeHRM\\OrangeHRMS\\Website\\Common\\Config.properties");
			FileInputStream fis=new FileInputStream(fi);
			prop=new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUrl()
	{
		String url=prop.getProperty("Url");
		return url;
	}
	
	public String getUserName()
	{
		String username=prop.getProperty("Username");
		return  username;
	}

	public String getPassword()
	{
		String password=prop.getProperty("Password");
		return password;
		
	}
	public String getDriver()
	{
		String driver=prop.getProperty("Driver");
		return driver;
	}
	
}
