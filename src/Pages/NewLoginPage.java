package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import libs.Do;
import locators.LoginLoc;

public class NewLoginPage {
	private WebDriver driver;
	private Do du;
	
	public NewLoginPage(WebDriver driver){
		this.driver = driver;
		du = new Do(driver);
	}
	public void openUrl(String url){
		driver.get(url);
	}
	
	public NewLoginPage setUsername(String name){
		du.what(LoginLoc.username).sendKeys(name);
		return this;
	}
	
	public NewLoginPage setPassword(String passabc){
		du.what(LoginLoc.password).sendKeys(passabc);
		return this;
	}
	
	public void pressLoginbtn(){
		du.what(LoginLoc.loginbtn).click();
	}
	
	public WebElement getTestid(){
		 return du.what(LoginLoc.testid);
	}
	

}
