package TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataDrivenTest {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  Integer sum =n+s;
	  System.out.println("Addition"+sum);
 }
  @Test(dataProvider = "dp")
  public void diff(Integer n, Integer s) {
	  Integer diff =n-s;
	  System.out.println("Difference"+diff);
  }
  @Test(dataProvider = "dp")
  public void mul(Integer n, Integer s) {
	  Integer mul =n*s;
	  System.out.println("Multiplication"+mul);
  }
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) {
	  Integer div =n/s;
	  System.out.println("Division"+div);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 20 },
      new Object[] { 2, 4 },
      new Object[] { 3, 3 },
      new Object[] { 6, 6 },
      new Object[] { 8, 8 },
      
    };
  }
}
