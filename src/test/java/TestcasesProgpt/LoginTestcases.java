package TestcasesProgpt;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjectProgpt.LoginPage;
import UtilityFileProgpt.DataproviderProgpt;

public class LoginTestcases extends LoginPage {
	
	 @Parameters({"browser"})	
	 @BeforeMethod
	public void beforetestrun(String browserName) throws IOException
	{
		launchbrowser( browserName);
		webURL( progptStaging);
	}
	
	@Test( dataProviderClass = DataproviderProgpt.class,   dataProvider = "Usernameandpassword")
	public void loginus(String username , String password, String title) throws InterruptedException
	{
		log.info("loginus Start");
		loginuser( username ,  password);
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), title);
		quit();
	}

}
