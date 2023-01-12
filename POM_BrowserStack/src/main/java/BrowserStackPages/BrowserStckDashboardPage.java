package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserStckDashboardPage {
	//OBJECT REPOSITORY
	WebDriver driver;
	By UserProfileBtn = By.xpath("//button[@class='account-dropdown-toggle dropdown-toggle']");
	By Summary = By.xpath("//a[text()='Summary']");
	By UserFullname =By.xpath("(//span[@class='profile-details-card__list-item-value-text'])[1]");
	//constructor
	public void BrowserStckDashboardPage(WebDriver driver){
	this.driver =driver;
}
	//methods
	public void UserProfile() {
		driver.findElement(UserProfileBtn).click();
		}
	public void ClickOnSummary() {
		driver.findElement(Summary).click();
	}
	public String VerifyUsername() {
		String getUserText=driver.findElement(UserFullname).getText();
		return getUserText;
	}
	



}
	
