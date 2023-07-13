package shethsPagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShethsHomePage {
	
	WebDriver driver;
	
	By createacnticon = By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	

	
	public ShethsHomePage(WebDriver driver) {
		
		
		this.driver = driver;
	}



	public void clickregistericon(){
		
		driver.findElement(createacnticon).click();
		
	}

}
