package Application;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseSetup;
import base.NavigateToApplication;
import pages.Admin;
import utils.ExtentListener;

public class VerifyApplication extends BaseSetup {
	public Admin nour;
	NavigateToApplication navigateToApplication;

	/*
	 * @Test(priority = 1) public void navigateToNetSingularity() throws
	 * InterruptedException { nour = new Admin(driver); navigateToApplication = new
	 * NavigateToApplication(driver);
	 * navigateToApplication.navigateToApplication("Enterprise Intelligence");
	 * 
	 * }
	 */

	@Test(priority = 2)
	public void clickOnSetting() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "Clicking Setting");

		nour.clickOnSetting(); // Click the setting menu

	}

	/*
	 * @Test(priority = 3) public void clickAdmin() throws InterruptedException {
	 * nour = new Admin(driver); ExtentListener.test.log(Status.INFO,
	 * "clickAdmin ");
	 * 
	 * nour.clickAdmin(); // Click the admin me }
	 */

	@Test(priority = 3)
	public void clickAddministrationIcon() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "clickAddministrationIcon ");

		nour.clickAddministrationIcon(); // Click the admin me

	}

	@Test(priority = 4)
	public void getTextOfAddministration() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "get Text Of Addministration");
		Thread.sleep(2000);

		String actualText = nour.getTextOfAddministration();

//  Print actual text to verify
		System.out.println("Actual Text: " + actualText);

// Expected text
		String expectedText = nour.getTextOfAddministration();
		System.out.println("expectedText : " + expectedText);

// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}

	@Test(priority = 5)
	public void getVerifyTextApplication() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "get Verify Text Application");
		Thread.sleep(2000);

		String actualText = nour.getVerifyTextApplication();

		// Print actual text to verify
		System.out.println("Actual Text: " + actualText);

		// Expected text
		String expectedText = "Applications by intent type";

		// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");

		// nour.clickAddministrationIcon();

	}

	@Test(priority = 6)
	public void clickApplicationIcon() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "click Application Icon");

		nour.clickApplicationIcon();

	}

	@Test(priority = 7)
	public void clickonApplicationSearch() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "click on Application Search");

		nour.clickonApplicationSearch();

	}

	@Test(priority = 8)

	public void verifyApplicationName() throws InterruptedException

	{

		// Wait for the results to load (Simple sleep for demonstration; WebDriverWait
		// is better)
		try {
			Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Get the page source or text to check if "HRMS" is present
		String cardText = nour.verifyApplicationName();

		// Use if-else to verify the search result
		if (cardText.contains("HRMS")) {
			System.out.println("HRMS found in search results!");
		} else {
			System.out.println("HRMS not found in search results.");
		}
//

		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "verify Application Name");
		Thread.sleep(2000);

		String actualText = nour.verifyApplicationName();

		// Print actual text to verify
		// System.out.println("Actual Text: " + actualText);

		// Expected text
		String expectedText = "HRMS";
		System.out.println("expectedText: " + expectedText);

		// Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}

	@Test(priority = 9)
	public void clickHRMSApplication() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "click on HRMS Application");
		nour.clickHRMSApplication();
	}

	@Test(priority = 10)

	public void getSearchResultText() throws InterruptedException {
		nour = new Admin(driver);
//	try {
//	ExtentListener.test.log(Status.INFO, "get Verify Text Application");
//	Thread.sleep(2000);
////Verify search result
//String expectedText = "INTERVIEW";
//String actualText = nour.getSearchResultText();
//
//if (actualText.equals(expectedText)) {
//    System.out.println("✅ Test Passed: Search result is correct.");
//} else {
//    System.out.println("❌ Test Failed: Expected '" + expectedText + "', but found '" + actualText + "'.");
//}
//}
//catch (Exception e) {
//e.printStackTrace();
//}

		String actualText = nour.getSearchResultText();

		// Print actual text to verify
		System.out.println("Actual Text: " + actualText);

		// Expected text
		String expectedText = "INTERVIEW";
		System.out.println("expectedText: " + expectedText);

		// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}

	@Test(priority = 11)
	public void clicksearchResult() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "click search Result");
		nour.clicksearchResult();
	}

	@Test(priority = 12)
	public void getTableValidation() throws InterruptedException {
		nour = new Admin(driver);

		// Call the method to get actual and expected lists
		nour.getTableValidation();
		;

		// Fetch the actual and expected lists
		List<String> actualTable = nour.getActualTable();
		List<String> expectedTable = nour.getExpectedTable();

		// Assertion to check if the lists match
		Assert.assertEquals(actualTable, expectedTable, "Dashboard items do not match the expected list.");
	}

	@Test(priority = 13)
	public void clickonColumnName() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "click on column name");
		nour.clickonColumnName();

	}

	@Test(priority = 14)
	public void clickonEntities() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "click on Entities");
		nour.clickonEntities();

	}

	@Test(priority = 15)
	public void clickonEntitiesSearch() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "clickonEntitiesSearch");
		nour.clickonEntitiesSearch();

	}

	@Test(priority = 16)

	public void getSearchResultTexts() throws InterruptedException {
		nour = new Admin(driver);
//		try {
//		ExtentListener.test.log(Status.INFO, "get Verify Text Application");
//		Thread.sleep(2000);
//	//Verify search result
//	String expectedText = "Employee";
//	String actualText = nour.getSearchResultTexts();
//	System.out.println(actualText+"Actual Text");
//
//	if (actualText.equals(expectedText)) {
//	    System.out.println("✅ Test Passed: Search result is correct.");
//	} else {
//	    System.out.println("❌ Test Failed: Expected '" + expectedText + "', but found '" + actualText + "'Employee");
//	}
//	}
//	catch (Exception e) {
//	e.printStackTrace();
//	}
//		}	 

		String actualText = nour.getSearchResultTexts();

		// Print actual text to verify
		System.out.println("Actual Text: " + actualText);

		// Expected text
		String expectedText = "Employee";
		System.out.println("expectedText: " + expectedText);

		// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}

	@Test(priority = 17)
	public void clickonEntitiesActionButton() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "clickonEntitiesActionButton");
		nour.clickonEntitiesActionButton();
	}
	/*
	 * @Test(priority = 18) public void clickonEntitiesFilterButton() throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "clickonEntitiesFilterButton");
	 * nour.clickonEntitiesFilterButton(); }
	 */

//	@Test(priority = 18)
//	public void clickonEntityStatusbutton() throws InterruptedException {
//	    nour = new Admin(driver);
//	    ExtentListener.test.log(Status.INFO, "clickonEntityStatusbutton");
//	    nour.clickonEntityStatusbutton();
// 	
//	
//	}

	@Test(priority = 19)
	public void getEntitygridValidate() throws InterruptedException {
		nour = new Admin(driver);

		// Call the method to get actual and expected lists
		nour.getEntitygridValidate();

		// Fetch the actual and expected lists
		List<String> actualList = nour.getActualList();
		List<String> expectedList = nour.getExpectedList();

		// Assertion to check if the lists match
		Assert.assertEquals(actualList, expectedList, "Dashboard items do not match the expected list.");
	}

	@Test(priority = 20)
	public void clickonMicroIntentTab() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "clickonMicroIntentTab");
		nour.clickonMicroIntentTab();
	}

	@Test(priority = 21)
	public void getMicroIntentsGridValidate() throws InterruptedException {
		nour = new Admin(driver);

// Call the method to get actual and expected lists
		nour.getMicroIntentsGridValidate();

		// Fetch the actual and expected lists
		List<String> actualMicro = nour.getActualMicro();
		List<String> expectedMicro = nour.getExpectedMicro();

// Assertion to check if the lists match
		Assert.assertEquals(actualMicro, expectedMicro, "Dashboard items do not match the expected list.");
	}

	@Test(priority = 22)
	public void verifyMicroIntent() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "verifyMicroIntent");

		String Actualmicrointent = nour.getMicroIntent();
		System.out.println("Actualmicrointent: " + Actualmicrointent);

		nour.clickOnMicroIntentSearchButton();

		String Expectedmicrointent = nour.verifyMicroIntentName();
		System.out.println("Expectedmicrointent: " + Expectedmicrointent);

		Assert.assertEquals(Actualmicrointent, Expectedmicrointent, "Micro Intent does not match");

	}

	@Test(priority = 23)

	public void clickonMicroIntentActionButton() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "click on MicroIntent Action Button");

		nour.clickonMicroIntentActionButton();

	}//

	/*
	 * @Test(priority = 24)
	 * 
	 * public void clickonMicroIntentfilterButton() throws InterruptedException {
	 * nour = new Admin(driver); nour.clickonMicroIntentfilterButton();
	 * 
	 * }
	 * 
	 * //verify filterd element microintent name
	 * 
	 * @Test(priority = 25) public void VerifyFilterdMicroIntentName() throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "Verify Filterd MicroIntent Name");
	 * Thread.sleep(2000);
	 * 
	 * String actualText =nour.VerifyFilterdMicroIntentName();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "Employee List";
	 * System.out.println("expected Text : " + expectedText);
	 * 
	 * 
	 * // ✅ Assertion to verify the text Assert.assertEquals(actualText,
	 * expectedText, "Text does not match!");
	 * 
	 * }
	 * 
	 * 
	 * @Test(priority = 26) public void ClickFilterdMicroNamewithContains () throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO,
	 * "Verify Filterd MicroName with Contains");
	 * nour.ClickFilterdMicroNamewithContains();
	 * 
	 * 
	 * }
	 * 
	 * @Test(priority = 27) public void VerifyFilterdMicroIntentNameContains()
	 * throws InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO,
	 * "Verify Filterd MicroIntent Name Contains"); Thread.sleep(2000);
	 * 
	 * String actualText =nour.VerifyFilterdMicroIntentNameContains();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "Employee";
	 * System.out.println("expectedText: " + expectedText);
	 * 
	 * 
	 * // ✅ Assertion to verify the text Assert.assertEquals(actualText,
	 * expectedText, "Text does not match!");
	 * 
	 * 
	 * 
	 * }
	 */
//dataset Tab

	@Test(priority = 28)

	public void clickonDataSetTab() throws InterruptedException {
		nour = new Admin(driver);
		nour.clickonDataSetTab();

	}

	@Test(priority = 29)
	public void getDatasetValidation() throws InterruptedException {
		nour = new Admin(driver);

// Call the method to get actual and expected lists
		nour.getDatasetValidation();

		// Fetch the actual and expected lists
		List<String> actualDataset = nour.getactualDataset();
		List<String> expectedDataset = nour.getexpectedDataset();

// Assertion to check if the lists match
		Assert.assertEquals(actualDataset, expectedDataset, "Dashboard items do not match the expected list.");
	}

	@Test(priority = 30)
	public void verifyDatasetName() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "verifyDatasetName");

		String Actualdataset = nour.getDatasetsName();
		System.out.println("Actualdataset : " + Actualdataset);

		nour.clickOnDatasetSearchButton();

		String Expecteddataset = nour.verifyDatasetName();
		System.out.println("Expecteddataset : " + Expecteddataset);

		Assert.assertEquals(Actualdataset, Expecteddataset, "Data set  does not match");

	}

	@Test(priority = 31)

	public void ClickonDatasetActionButton() throws InterruptedException {
		nour = new Admin(driver);
		nour.ClickonDatasetActionButton();

	}

	@Test(priority = 32)
	public void getDatasetTableGridValidation() throws InterruptedException {
		nour = new Admin(driver);

// Call the method to get actual and expected lists
		nour.getDatasetTableGridValidation();
		;

		// Fetch the actual and expected lists
		List<String> actualDatasetTableGrid = nour.getactualDatasetTableGrid();
		List<String> expectedDatasetTableGrid = nour.getexpectedDatasetTableGrid();

// Assertion to check if the lists match
		Assert.assertEquals(actualDatasetTableGrid, expectedDatasetTableGrid,
				"Dashboard items do not match the expected list.");
	}

	@Test(priority = 33)
	public void ClickonDatasetTableNextButton() throws InterruptedException {
		nour = new Admin(driver);
		nour.ClickonDatasetTableNextButton();
	}
//
//@Test(priority = 34)
//public void ClickonDatasetAddButton() throws InterruptedException {
// nour = new Admin(driver);
// nour.ClickOnAddDatasetButton();
//
//
//}

	/*
	 * @Test(priority = 35) public void ClickOnDatasetFilterButton() throws
	 * InterruptedException { nour = new Admin(driver);
	 * nour.ClickOnDatasetFilterButton();
	 * 
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test(priority = 36) public void VerifyFilterdDatasetName() throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "Verify Filterd Dataset Name");
	 * Thread.sleep(2000);
	 * 
	 * String actualText =nour.VerifyFilterDatasetNames();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "Risk";
	 * System.out.println("expected Text : " + expectedText);
	 * 
	 * 
	 * // ✅ Assertion to verify the text Assert.assertEquals(actualText,
	 * expectedText, "Text does not match!");
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 37) public void ClickFilterdMicroNamewithContains () throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "ClickFilterdDatasetNamewithContains");
	 * nour.ClickFilterdDatasetNamewithContains();
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 38) public void VerifyFilterdDatasetNameContains() throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "Verify Filterd Dataset Name Contains");
	 * Thread.sleep(2000);
	 * 
	 * String actualText =nour.VerifyFilterdDatasetNameContains();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "Risk";
	 * System.out.println("expectedText: " + expectedText);
	 * 
	 * 
	 * // ✅ Assertion to verify the text Assert.assertEquals(actualText,
	 * expectedText, "Text does not match!");
	 * 
	 * }
	 */

	@Test(priority = 39)
	public void ClickOnServiceTab() throws InterruptedException {
		nour = new Admin(driver);
		nour.ClickOnServiceTab();

	}

	@Test(priority = 40)
	public void VerifyServiceName() throws InterruptedException {
		nour = new Admin(driver);
		ExtentListener.test.log(Status.INFO, "VerifyServiceName");
		String ActualService = nour.getServiceName();
		System.out.println("Actual Service Name  : " + ActualService);

		nour.clickOnServiceSearchButton();

		String ExpectedService = nour.VerifyServiceName();
		System.out.println("Expected Service  Name : " + ExpectedService);

		Assert.assertEquals(ActualService, ExpectedService, "Service name does not match");

	}

	@Test(priority = 41)
	public void ClickOnadvanceSettings() throws InterruptedException {
		nour = new Admin(driver);
		nour.ClickOnadvanceSettings();

	}

	@Test(priority = 42)
	public void ClickScrollDown() throws InterruptedException {
		nour = new Admin(driver);

		nour.ClickScrollDown("/Applicant/search");

	}
	/*
	 * @Test(priority = 43) public void ClickOnServiceStatus() throws
	 * InterruptedException { nour = new Admin(driver); nour.ClickOnServiceStatus();
	 * 
	 * 
	 * }
	 */

	// arbitration test case
	@Test(priority = 43)
	public void arbitrationButton() throws InterruptedException {
		nour = new Admin(driver);
		nour.arbitrationButton();

	}

	@Test(priority = 44)
	public void getArbitrationGridValidate() throws InterruptedException {
		nour = new Admin(driver);
		Thread.sleep(5000);
		// Call the method to get actual and expected lists
		nour.getArbitrationGridValidate();

		// Fetch the actual and expected lists
		List<String> actualList = nour.getActualList();
		List<String> expectedList = nour.getExpectedList();

		// Assertion to check if the lists match
		Assert.assertEquals(actualList, expectedList, "Dashboard items do not match the expected list.");
	}

	/*
	 * @Test(priority = 45) public void selectArbitrationFilter() throws
	 * InterruptedException { nour = new Admin (driver);
	 * nour.selectArbitrationFilter(); }
	 * 
	 * 
	 * @Test(priority = 46) public void verifyApplyFilterType() throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "verifyApplyFilterType");
	 * Thread.sleep(2000);
	 * 
	 * String actualText =nour.verifyApplyFilterType();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "Type = Direct";
	 * 
	 * // ✅ Assertion to verify the text Assert.assertEquals(actualText,
	 * expectedText, "Text does not match!"); }
	 * 
	 * @Test(priority = 47) public void ReselectArbitrationSearchFilter() throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "ReselectArbitrationSearchFilter");
	 * Thread.sleep(2000); nour.ReselectArbitrationSearchFilter();
	 * 
	 * }
	 * 
	 * @Test(priority = 48) public void verifyArbitrationNotEqualFilter() throws
	 * InterruptedException { nour = new Admin(driver);
	 * ExtentListener.test.log(Status.INFO, "verifyArbitrationNotEqualFilter");
	 * Thread.sleep(2000);
	 * 
	 * String actualText =nour.verifyArbitrationNotEqualFilter();
	 * 
	 * // Print actual text to verify System.out.println("Actual Text: " +
	 * actualText);
	 * 
	 * // Expected text String expectedText = "Type != Direct";
	 * 
	 * // ✅ Assertion to verify the text Assert.assertEquals(actualText,
	 * expectedText, "Text does not match!"); }
	 * 
	 */

	@Test(priority = 49)
	public void arbitrationFirstQuestion() throws InterruptedException {
		nour = new Admin(driver);
		nour.arbitrationFirstQuestion();
		nour.clickOnArbitrationSearch();
		nour.verifyarbitrationSearchQuestion();
	}

	@Test(priority = 50)
	public void clickOnSearchQuestion() throws InterruptedException {
		nour = new Admin(driver);
		nour.clickOnSearchQuestion();
	}

	@Test(priority = 51)
	public void verifyDerivedQuestion() throws InterruptedException {
		nour = new Admin(driver);

		String actualText = nour.verifyDerivedQuestion();

		// Print actual text to verify
		System.out.println("Actual Text: " + actualText);

		// Expected text
		String expectedText = "derived";
		System.out.println("expectedText: " + expectedText);

		// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");
	}

	@Test(priority = 53)
	public void getTemplateGridValidate() throws InterruptedException {
		nour = new Admin(driver);
		Thread.sleep(5000);
		// Call the method to get actual and expected lists
		nour.getTemplateGridValidate();

		// Fetch the actual and expected lists
		List<String> actualList = nour.getActualTemplateList();
		List<String> expectedList = nour.getExpectedTemplateList();

		// Assertion to check if the lists match
		Assert.assertEquals(actualList, expectedList, "Dashboard items do not match the expected list.");
	}

	@Test(priority = 54)
	public void firstTemplate() throws InterruptedException {
		nour = new Admin(driver);
		nour.firstTemplate();
		String actualText = nour.firstTemplate();
		// Print actual text to verify
		System.out.println("Actual Text: " + actualText);
		nour.enterValuesInSearch();
		// Expected text
		String expectedText = nour.verifyaTemplateSearch();
		System.out.println("expectedText: " + expectedText);

		// ✅ Assertion to verify the text
		Assert.assertEquals(actualText, expectedText, "Text does not match!");

//	    }	
		// @Test(priority = 55)
		// public void templateFilter() throws InterruptedException {
//		nour = new Admin (driver);
////		nour.templateFilter();	
//		String actualText =nour.templateFilter();
//		   //  Print actual text to verify
		// System.out.println("Actual Text: " + actualText);
		//
		// // Expected text
		// String expectedText = nour.firstTemplate();
		// System.out.println("expectedText: "+ expectedText);
		//
		// // ✅ Assertion to verify the text
		// Assert.assertEquals(actualText, expectedText, "Text does not match!");
		//
		//
	}

	@Test(priority = 56)
	public void CreateNewTemplate() throws InterruptedException {
		nour = new Admin(driver);
		nour.CreateTemplate();

	}
}
