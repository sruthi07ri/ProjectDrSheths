package shethsPagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShethsLoginPage {
	
	WebDriver driver;
	
	By createacntbtn = By.xpath("//button[@title ='Create an Account']");
	
	public ShethsLoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clickCreateAccountbtn()
	{
		
		driver.findElement(createacntbtn).click();
	}

}
