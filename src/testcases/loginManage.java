package testcases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import libs.BrowserType;
import libs.Browsers;
import libs.Wait;

public class loginManage {
	private WebDriver driver;
	private Wait wait;
	
	@BeforeClass
	public void openFoxfire(){
		Browsers browser = new Browsers(BrowserType.firefox);
		driver = browser.driver;
		wait = new Wait(driver);
	}
	
	@Test
	public void LogIn(){
		LoginPage loginpage = new LoginPage(driver);
		loginpage.openUrl("http://test-platform.tcc.so/pages/login.html");
		loginpage.setUsername("wujiajun");
		loginpage.setPassword("123456");
		loginpage.pressLoginbtn();
		wait.waitFor(3000);
		Assert.assertEquals(loginpage.gettestid().isDisplayed(),true);
	}
	
	@AfterClass
	public void release(){
		driver.quit();
		
	}
}
//add by Leo 2017-03-22