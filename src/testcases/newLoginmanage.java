package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.NewLoginPage;

import libs.BrowserType;
import libs.Browsers;
import libs.Wait;


public class newLoginmanage {
	WebDriver driver;
	Wait wait;
	
	@BeforeClass
	public void openFoxfire(){
		Browsers browser = new Browsers(BrowserType.firefox);
		driver = browser.driver;
		wait = new Wait(driver);
	}
	@Test
	public void logIn(){
		NewLoginPage newloginpage = new NewLoginPage(driver);
		newloginpage.openUrl("http://test-platform.tcc.so/pages/login.html");
		newloginpage.setUsername("wujiajun");
		newloginpage.setPassword("123456");
		newloginpage.pressLoginbtn();
		wait.waitFor(3000);
		Assert.assertEquals(newloginpage.getTestid().isDisplayed(), true);
	}

}
