
package TestNG1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	public WebDriver driver;
  @Test
  public void secondtest() throws IOException {
	  driver= new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File srcfile= ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcfile, new File("C:\\Users\\shrish\\eclipse-workspace1\\Sel\\Screenshot\\"+timestramp()+".jpeg"));
	  
  }
public static String timestramp() {
	return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	
}
}
