package shethsPagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShethsRegisterPage {
	
	WebDriver driver;
	
	By firstName = By.id("FirstName");
	By lastName = By.id("LastName");
	By email = By.id("Email");
	By Password = By.id("CreatePassword");
	By submitbtn = By.xpath("//input[@value='Submit']");
	
	
	public ShethsRegisterPage(WebDriver driver)
	{
		
		this.driver = driver;
		
	}
	
	public void setName(String fname, String lname) {
		
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
	}
	public void setmailPwd(String mailid, String pwd)
	{
		
		driver.findElement(email).sendKeys(mailid);
		driver.findElement(Password).sendKeys(pwd);
	}
	public void clickSubmit()
	{
		
		driver.findElement(submitbtn).click();
	}

			
}
