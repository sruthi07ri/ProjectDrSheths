package shethsPagePkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShethsSearchPage {

	WebDriver driver;
	
	By searchBox = By.xpath("//div[@class='st-search-bar hidden-mobile']/input");
	//	By searchBox = By.xpath("//*[@id=\"create-account\"]/div[4]/div/header/div[1]/div[2]/div[3]/div/div[1]/input");
	By searchItem = By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[1]/a/img");
	
	public ShethsSearchPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void typeSerachword(String serachword)
	{
		driver.findElement(searchBox).sendKeys(serachword);
		
	}
	
	public void clickItem()
	{
		
		//WebElement item = driver.findElement(searchItem);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchItem));
		driver.findElement(searchItem).click();
		
	}
}


