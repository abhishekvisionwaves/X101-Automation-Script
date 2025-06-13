package Login;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseSetup;
import pages.Login;
import utils.ExtentListener;
import utils.RetryAnalyzer;

public class VerifyLogin extends BaseSetup {

	Login login;

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void verifyQuestions() throws InterruptedException {
		login = new Login(driver);
		ExtentListener.test.log(Status.INFO, "Verify Questions.");
		login.enterQuestion();
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void verifyGetAllText() throws InterruptedException {
		login = new Login(driver);
		ExtentListener.test.log(Status.INFO, "Verify Questions.");
		login.getAllText();
	}

}
