package TestNG1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DPTest {
	public WebDriver driver;
  @Test(dataProvider = "FBLogin")
  public void FacebookLogin(String username, String password) {
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn=driver.findElement(By.xpath("//button[@name='login']"));
	 Username.sendKeys("username");
	 Password.sendKeys(password);
	 LoginBtn.click();
  }

  @DataProvider
  public Object[][] FBLogin() {
    return new Object[][] {
      new Object[] { "kkavita.gavhane@gmail.com", "ah646ghjj" },
      new Object[] { "kkavita.gavhane@gmail.com", "bdjdjkfh66" },
      new Object[] { "kkavita.gavhane@gmail.com", "4j4jhjhf1" },
      new Object[] { "kkavita.gavhane@gmail.com", "jdfnsjfan" },
      new Object[] { "kkavita.gavhane@gmail.com", "546snskndk" },
      new Object[] { "kkavita.gavhane@outlook.com", "scsococs" },
      new Object[] { "kkavita.gavhane@redifmail.com", "ah646ghjj" },
    };
  }
}
