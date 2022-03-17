package TestRunner;

import org.junit.AfterClass;
import org.junit.gen5.api.AfterAll;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

import Common.BaseClass;
import Utility.BatchExecution;
import Utility.EmailWithAttachedReport;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\OrangeHRM\\OrangeHRMS\\Website\\Testcases\\Features\\Login.feature",
		glue={"Testcases.StepDefinition","Hooks"},
		monochrome=true,
		plugin={"pretty:STDOUT",
				"html:target/cucumber-html-reports/","json:E:\\OrangeHRM\\OrangeHRMS\\target\\cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:E:\\OrangeHRM\\OrangeHRMS\\Reports\\report.html"
                }
		
		)


public class MyRunner extends AbstractTestNGCucumberTests{
    public EmailWithAttachedReport email;
    public BatchExecution batExecution;
	@AfterTest
	public void utilityExec()
	{
		email=new EmailWithAttachedReport();
		email.EmailSent();
		batExecution=new BatchExecution();
		batExecution.batchExecution();
	}
	
	
}
