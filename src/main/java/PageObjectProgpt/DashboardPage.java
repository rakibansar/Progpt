package PageObjectProgpt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityFileProgpt.BaseProgpt;

public class DashboardPage extends BaseProgpt{
	

	private String newAlagentLocator = "a[href='/new-project']";
	private String dashboardLocator = "a[href=\"/dashboard\"']";
	private String aiagentsLocator = "//span[contains(text(),'AI Agents')]";
	private String usermanualLocator = "//span[contains(text(),'User Manual')]";

	private String openprofileLocator = "//button[@aria-label=\"open profile\"]";
	private String profileLocator = "//span[contains(text(),'Profile')]";
	private String orgnizationLocator = "//span[contains(text(),'Organizations')]";
	private String contactusLocator = "//span[contains(text(),'Contact Us')]";
	private String logoutLocator = "//span[contains(text(),'Logout')]";

	
	
	public  void createnewAIagent ( ) 
	{
		waitelement(newAlagentLocator); 
		WebElement NewAlagenttab = driver.findElement(By.xpath(newAlagentLocator));
		NewAlagenttab.click();
	}
	
	
	public  void dashboardtab () 
	{
		waitelement(dashboardLocator); 
		WebElement Dashboardtab = driver.findElement(By.xpath(dashboardLocator));
		Dashboardtab.click();
	}
	

	public  void alagenttab () 
	{
		waitelement(aiagentsLocator); 
		WebElement AIagenttab = driver.findElement(By.xpath(aiagentsLocator));
		AIagenttab.click();
	}
	
	public  void usermanualtab ( ) 
	{
		waitelement(usermanualLocator); 
		WebElement Usermanualtab = driver.findElement(By.xpath(usermanualLocator));
		Usermanualtab.click();
	}
	
	public  void openprofileicon ( ) 
	{
		waitelement(openprofileLocator); 
		WebElement Openprofileicon = driver.findElement(By.xpath(openprofileLocator));
		Openprofileicon.click();
	}
	
	public  void profileclick ( ) 
	{
		openprofileicon();
		waitelement(profileLocator); 
		WebElement Profileclick = driver.findElement(By.xpath(profileLocator));
		Profileclick.click();
	}
	
	public  void orgnizationclick ( ) 
	{
		openprofileicon();
		waitelement(orgnizationLocator); 
		WebElement Orgnizationclick = driver.findElement(By.xpath(orgnizationLocator));
		Orgnizationclick.click();
	}
	
	public  void contactusclick ( ) 
	{
		openprofileicon();
		waitelement(contactusLocator); 
		WebElement Contactusclick = driver.findElement(By.xpath(contactusLocator));
		Contactusclick.click();
	}
	
	public  void logoutclick ( ) 
	{
		openprofileicon();
		waitelement(logoutLocator); 
		WebElement Logoutclick = driver.findElement(By.xpath(logoutLocator));
		Logoutclick.click();
	}
}

