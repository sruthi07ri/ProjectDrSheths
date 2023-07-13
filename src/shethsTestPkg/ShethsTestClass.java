package shethsTestPkg;

import org.testng.annotations.Test;

import shethsPagePkg.ShethsHomePage;
import shethsPagePkg.ShethsListPage;
import shethsPagePkg.ShethsLoginPage;
import shethsPagePkg.ShethsRegisterPage;
import shethsPagePkg.ShethsSearchPage;

public class ShethsTestClass extends ShethsBaseClassTest  {
	

	
	@Test (priority = 0)
	public void home()
	{
		
		ShethsHomePage shp = new ShethsHomePage(driver);
		shp.clickregistericon();
	}
	
	@Test (priority = 1)
	public void createAccount()
	{
		ShethsLoginPage slp = new ShethsLoginPage(driver);
		slp.clickCreateAccountbtn();
	}
	
	@Test (priority = 2)
	public void register()
	{
		ShethsRegisterPage srp = new ShethsRegisterPage(driver);
		srp.setName("test", "name");
		srp.setmailPwd("testname123@mail.com", "Password12345");
		srp.clickSubmit();
	}
	
	@Test (priority = 3)
	public void searchbox()
	{
		ShethsSearchPage ssp = new ShethsSearchPage(driver);
		ssp.typeSerachword("sunscreen");
		ssp.clickItem();
		
	}
	
	@Test (priority = 4)
	public void addToCart()
	{
		
		ShethsListPage splp = new ShethsListPage(driver);
		
		splp.clickAddCartbtn();
	}
	
	
	

}
