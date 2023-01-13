package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackSigninPage {
	//object repository
	WebDriver driver;
	By Useremail =By.xpath("//input[@id='user_email_login']");
	By UserPassword =By.xpath("//input[@id='user_password']");
	By Loginbtn =By.xpath("//input[@id='user_submit']");
	//constructor
	
	public BrowserStackSigninPage(WebDriver driver) {
		
		this.driver=driver;
	}
	//methods
	public void EnterUserEmail(String useremail) {
		driver.findElement(Useremail).sendKeys(useremail);
	}
	public void EnterUserPasswword(String userpassword) {
		driver.findElement(UserPassword).sendKeys(userpassword);
	
	}
	public void ClickOnLoginBtn() {
		driver.findElement(Loginbtn).click();
	}
	


}
