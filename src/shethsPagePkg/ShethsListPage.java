package shethsPagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShethsListPage {
	
	WebDriver driver;
	
	By addtoCartbtn = By.name("add");
	
	public ShethsListPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickAddCartbtn() {
		
		driver.findElement(addtoCartbtn).click();
	}

}
