package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='login']")
	private WebElement logbtn;
	
	@FindBy(xpath="//span[@id='top-username']")
	private WebElement testid;
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void openUrl(String url){
		driver.get(url);
	}
	
	public void setUsername(String name){
		username.sendKeys(name);
	}
	
	public void setPassword(String passabc){
		password.sendKeys(passabc);
	}
	
	public void pressLoginbtn(){
		logbtn.click();
	}
	
	public WebElement gettestid(){
		return testid;
		
	}
	
}
