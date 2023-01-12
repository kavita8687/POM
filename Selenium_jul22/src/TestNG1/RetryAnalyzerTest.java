package TestNG1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzerTest implements IRetryAnalyzer {
  int counter=0;
  int retrylimit=3;

@Override
public boolean retry(ITestResult result) {
	if(counter < retrylimit) {
		counter++;
		return true;
	}
	return false;
}
}
