package X101TestCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseSetup;
import base.NavigateToApplication;
import pages.x101;
import utils.ExtentListener;

//@Listeners(ExtentListener.class)
public class Verifyx101 extends BaseSetup {

	public x101 nour;
	NavigateToApplication navigateToApplication;

	@Test(priority = 1)
	public void navigateToNetSingularity() throws InterruptedException {
		nour = new x101(driver);
		navigateToApplication = new NavigateToApplication(driver);
		navigateToApplication.navigateToApplication("AI ops");

	}

	@Test(priority = 2)
	public void validateOnDashboardTest() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "Verify Dashboard text");

	}

	@Test(priority = 3)
	public void sidemenubar() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "Click on menu");
		nour.clickAIopsmenu();

	}

	@Test(priority = 4)
	public void gettextVerify() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "Verify Dashboard text");
		nour.getTextVerify();

	}

	/*
	 * @Test(priority = 5) public void clickSuccessRate() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "Verify success rate");
	 * Thread.sleep(10000); nour.clickSuccessRate(); }
	 * 
	 * @Test(priority = 6) public void clickfeedback() throws InterruptedException {
	 * nour = new x101(driver); ExtentListener.test.log(Status.INFO,
	 * "click on feedback"); nour.clickfeedback();
	 * 
	 * }
	 * 
	 * @Test(priority = 7) public void getTextFeedbackRequest() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click on failed Request");
	 * nour.getTextFeedbackRequest();
	 * 
	 * Thread.sleep(3000); String actualText =nour.getTextFeedbackRequest();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "Request feedback";
	 * 
	 * // ✅ Assertion to verify the text Assert.assertEquals(actualText,
	 * expectedText, "Text does not match!"); }
	 * 
	 * 
	 * @Test(priority = 8) public void clickquestion() throws InterruptedException {
	 * nour = new x101(driver); ExtentListener.test.log(Status.INFO,
	 * "click on question"); nour.clickquestion(); }
	 * 
	 * @Test(priority = 9) public void clickLlmrequest() throws InterruptedException
	 * { nour = new x101(driver); ExtentListener.test.log(Status.INFO,
	 * "click on llm request"); nour.clickLlmrequest(); }
	 * 
	 * @Test(priority = 10) public void clickProcessstep() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click on Process step");
	 * nour.clickProcessstep(); }
	 * 
	 * @Test(priority = 11) public void clickFeedbackClosebutton() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click Feedback Close button");
	 * nour.clickFeedbackClosebutton(); }
	 * 
	 * @Test(priority = 12) public void clickFilterfeedbackbutton() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click Filter feedback button");
	 * nour.clickFilterfeedbackbutton(); }
	 * 
	 * @Test(priority = 13) public void clickdropdownRequestfeedbackFilter() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click dropdown ");
	 * nour.clickdropdownRequestfeedbackFilter();
	 * 
	 * }
	 * 
	 * 
	 * @Test(priority = 14) public void clickdropdownValueActioN() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click dropdown Value ");
	 * nour.clickdropdownValueAction();
	 * 
	 * }
	 * 
	 * @Test(priority = 15) public void clickdropdownValueActioNN() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click dropdown Value N ");
	 * nour.clickdropdownValueActionSS();
	 * 
	 * }
	 */

	@Test(priority = 16)
	public void clickfailedRequest() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "click on failed Request");
		nour.clickfailedRequest();
		Thread.sleep(1000);

	}

	@Test(priority = 17)
	public void verifyTableHeaders() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "click on failed Request");
		List<String> actualHeaders = nour.getTableHeaders();
		System.out.println("actualHeaders" + actualHeaders);

	}

	@Test(priority = 17)
	public void getTestOfFailedRequest() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "click on failed Request");
		nour.getTestOfFailedRequest();

		// Wait for the element to be visible
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement element =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

		// Extract and trim the text
		Thread.sleep(3000);
		String actualText = nour.getTestOfFailedRequest();

		// Debug: Print actual text to verify
		System.out.println("Actual Text: " + actualText);

		// Expected text
		String expectedText = "Failure requests";

		// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}

	@Test(priority = 18)
	public void clickweekFailedrequest() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "click week Failed request");
		nour.clickweekFailedrequest();

	}

	@Test(priority = 19)
	public void clickonFilterFailrequest() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "click on Filter Failrequest");
		nour.clickonFilterFailrequest();
		Thread.sleep(2000);

	}

	@Test(priority = 20)
	public void clickondropdownFailrequest() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "click on dropdown Failure request");
		nour.clickondropdownFailrequest();
		Thread.sleep(2000);

	}

	@Test(priority = 21)
	public void clickonsearchbuttonfailrequest() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "clickonsearchbuttonfailrequest");
		nour.clickonsearchbuttonfailrequest();
		Thread.sleep(2000);

	}

	@Test(priority = 22)
	public void getSearchquestion() throws InterruptedException {
		nour = new x101(driver);
		ExtentListener.test.log(Status.INFO, "getSearchquestion");
		nour.getSearchquestion();

		String actualText = nour.getSearchquestion();

		// Debug: Print actual text to verify
		System.out.println("Actual Text: " + actualText);

		// Expected text
		String expectedText = "show me list of employee by department";

		// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}

	/*
	 * @Test(priority = 21) public void clickUserRequest() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click on user Request");
	 * nour.clickUserRequest(); Thread.sleep(2000); }
	 * 
	 * 
	 * @Test(priority = 22) public void getTextOfUserRequest() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click on User Request");
	 * nour.getTextOfUserRequest();
	 * 
	 * // Wait for the element to be visible //WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(10)); // WebElement element =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
	 * 
	 * 
	 * Thread.sleep(3000); String actualText =nour.getTextOfUserRequest();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "User requests";
	 * 
	 * // Assertion to verify the text Assert.assertEquals(actualText, expectedText,
	 * "Text does not match!");
	 * 
	 * }
	 * 
	 * @Test(priority = 23) public void clickweekUserrequest() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click week User request");
	 * nour.clickweekUserrequest(); }
	 * 
	 * @Test(priority = 24) public void clickonFilterUserrequest() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click on filter User request");
	 * nour.clickonFilterUserrequest(); Thread.sleep(2000);
	 * 
	 * }
	 * 
	 * @Test(priority = 25) public void clickondropdownUserrequest() throws
	 * InterruptedException { nour = new x101(driver);
	 * ExtentListener.test.log(Status.INFO, "click on dropdown User request");
	 * nour.clickondropdownUserrequest();
	 * 
	 * } /* @Test(priority = 19) public void validateGrid() throws IOException {
	 * nour = new x101(driver); String sheetName="sheet7"; String excelFile="path";
	 * 
	 * List<Map<String, String>> expectedData =
	 * WorkbookFactory.create(excelFile).getSheet("Sheet7");
	 * x101.compareTable(driver, expectedData);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */}