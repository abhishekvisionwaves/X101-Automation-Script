package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.SeleniumAction;
import junit.framework.Assert;
import utils.csvReaders;

public class x101 extends SeleniumAction {

	protected WebDriver driver;

	// Constructor to initialize elements using the provided WebDriver
	public x101(WebDriver driver) {
		super(driver); // Call the parent class constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize PageFactory
	}

	@FindBy(xpath = "//em[@class='custom-icon root-modules icon icomoon App-Onboarding_Dashboard ng-star-inserted iconcolor']")
	private WebElement AIopsmenu;

	@FindBy(xpath = "(//span[@class='db_cardheading header-title'])[5]")
	private WebElement getTextverifyCostanalysis;

	@FindBy(xpath = "//span[contains(@class, 'budgetTextStyle22') and contains(text(), 'Number of request')]")
	private WebElement clickonSuccessrate;

	@FindBy(xpath = "//span[contains(@class, 'budgetTextStyle1') and contains(text(), 'Success rate')]")
	WebElement clickRate;

	@FindBy(xpath = "(//div[@class='sadeNav-menu-item ng-star-inserted'])[2]")
	private WebElement Clickonfeedback;

	@FindBy(xpath = "//div[contains(text(), 'Request feedback')]")
	private WebElement getTextRequestfeedBack;

	@FindBy(xpath = "(//div[@class='ag-cell-wrapper'])[2]")
	private WebElement Clickonquestion;

	@FindBy(xpath = "(//div[@class='tab-alignment-center tab-chip horzontalIcons'])[2]")
	private WebElement clickOnllmrequest;

	@FindBy(xpath = "(//div[@class='tab-alignment-center tab-chip horzontalIcons'])[3]")
	private WebElement clickOnProcessstep;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[12]")
	private WebElement clickOnclosebutton;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[5]")
	private WebElement clickonRequestfeedbackButton;

	@FindBy(xpath = "//*[@id=\"mat-select-value-15\"]/span")
	private WebElement clickondropdown;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Action')]")
	private WebElement clickondropdownValue;

	@FindBy(xpath = "//span[contains(@class, 'mat-mdc-select-placeholder') and contains(text(), 'Action')]")
	private WebElement clickondropDownValueActionS;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Liked')]")
	private WebElement selectLikeValueAction;

	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[16]")
	private WebElement clickonApplyButton;

	@FindBy(xpath = "(//div[@class='sadeNav-menu-item ng-star-inserted'])[1]")
	private WebElement menuelement;

	@FindBy(xpath = "(//div[@class='sadeNav-menu-item ng-star-inserted'])[3]")
	private WebElement clickonFailedrequest;

	@FindBy(xpath = "//div[@class='text-ellipsis max-width-very-large ng-star-inserted']")
	private WebElement getTextofFailedrequest;

	@FindBy(xpath = "//div[contains(text(), ' Week ')]")
	private WebElement clickonWeekfailRequest;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[5]")
	private WebElement clickonFailurefilterbutton;

	@FindBy(xpath = "//span[contains(text(), 'Select filter')]")
	private WebElement clickondropdfilterFailurerequest;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Failure category')]")
	private WebElement selectFailureCategory;

	@FindBy(xpath = "//span[contains(@class, 'mat-mdc-select-placeholder') and contains(text(), 'Failure category')]")
	private WebElement clickFailureCategorydropdown;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Other')]")
	private WebElement selectOtherFailureCategory;

	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[17]")
	private WebElement clickofApplybutton;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement clickinplaceholderserchbutton;

	@FindBy(xpath = "(//div[contains(@class, 'cellrenderer-component')]//div[@class='value ng-star-inserted'])[1]")
	private WebElement getTextonserchresult;

	@FindBy(xpath = "(//div[@class='sadeNav-menu-item ng-star-inserted'])[4]")
	private WebElement clickonUserrequest;

	@FindBy(xpath = "//div[@class='text-ellipsis max-width-very-large ng-star-inserted']")
	private WebElement getTextofUserrequest;

	@FindBy(xpath = "//div[contains(text(),' Week ')]")
	private WebElement clickUsersrequestWeek;

	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[6]") // "(//span[@class='mat-mdc-button-touch-target'])[5]")
	private WebElement clickonUserfilterbutton;

	@FindBy(xpath = "//span[contains(text(), 'Select filter')]")
	private WebElement clickondropdfilterUserrequest;

	@FindBy(xpath = "(//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Status')])[1]")
	private WebElement SelectStatus;

	@FindBy(xpath = "(//div[contains(@class, 'mat-mdc-select-value')]//span[contains(text(), 'Status')])[2]")
	private WebElement clickonStatusValue;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Success')]")
	private WebElement selectSuccessFilter;

	@FindBy(xpath = " (//span[contains(@class, 'mat-mdc-button-touch-target')])[27]")
	private WebElement clickApplyButton;

	@FindBy(xpath = " //div[@class='headercell']")
	private List<WebElement> headertables;

	// Methods for Side Menu Bar
	public void clickAIopsmenu() throws InterruptedException {
		waitForElementToBeClickable(AIopsmenu);
		AIopsmenu.click();
	}

	// get text for cost analysis
	public void getTextVerify() throws InterruptedException {
		waitForElementToBeClickable(getTextverifyCostanalysis);
		getTextverifyCostanalysis.getText();
	}

	public void clickSuccessRate() throws InterruptedException {

		waitForElementToBeClickable(clickonSuccessrate);

		clickonSuccessrate.click();
		Thread.sleep(4000);
		driver.navigate().back();
		clickRate.click();
		// clickonSuccessrate.click();4
	}

	// Feedback tab
	public void clickfeedback() throws InterruptedException {
		waitForElementToBeClickable(Clickonfeedback);
		Thread.sleep(2000);
		Clickonfeedback.click();
		// Actions actions = new Actions(driver);
		// actions.moveByOffset(100, 100).perform(); // Moves cursor to (100,100) pixels
		// away
	}

	public String getTextFeedbackRequest() throws InterruptedException {
		waitForElementToBeClickable(getTextRequestfeedBack);
		getTextRequestfeedBack.click();
		String actualText = getTextRequestfeedBack.getText();
		System.out.println("Actual text" + actualText);
		return actualText;

	}

	public void clickquestion() throws InterruptedException {
		waitForElementToBeClickable(Clickonquestion);
		Clickonquestion.click();

	}

	public void clickLlmrequest() throws InterruptedException {
		waitForElementToBeClickable(clickOnllmrequest);
		clickOnllmrequest.click();
	}

	public void clickProcessstep() throws InterruptedException {
		waitForElementToBeClickable(clickOnProcessstep);
		clickOnProcessstep.click();
	}

	public void clickFeedbackClosebutton() throws InterruptedException {
		waitForElementToBeClickable(clickOnclosebutton);

		clickOnclosebutton.click();
	}

	public void clickFilterfeedbackbutton() throws InterruptedException {
		waitForElementToBeClickable(clickonRequestfeedbackButton);
		clickonRequestfeedbackButton.click();

	}

	public void clickdropdownRequestfeedbackFilter() throws InterruptedException {
		waitForElementToBeClickable(clickondropdown);
		clickondropdown.click();

	}

	public void clickdropdownValueAction() throws InterruptedException {
		waitForElementToBeClickable(clickondropdownValue);
		clickondropdownValue.click();
	}

	public void clickdropdownValueActionSS() throws InterruptedException {
		waitForElementToBeClickable(clickondropDownValueActionS);
		clickondropDownValueActionS.click();
		Thread.sleep(1000);
		selectLikeValueAction.click();
		Thread.sleep(1000);
		clickonApplyButton.click();

	}

	// Failure request tab
	public void clickfailedRequest() throws InterruptedException {
		Actions actions = new Actions(driver);

		// Perform hover action
		actions.moveToElement(menuelement).perform();
		waitForElementToBeClickable(clickonFailedrequest);
		Thread.sleep(5000);
		clickonFailedrequest.click();
	}

	public String getTestOfFailedRequest() throws InterruptedException {
		waitForElementToBeClickable(getTextofFailedrequest);
		String actualText = getTextofFailedrequest.getText();
		System.out.println("Actual text" + actualText);
		return actualText;
	}

	public void clickweekFailedrequest() throws InterruptedException {
		waitForElementToBeClickable(clickonWeekfailRequest);
		clickonWeekfailRequest.click();

	}

	/*
	 * // Get dynamic column mapping from AG Grid public static Map<String, Integer>
	 * getColumnIndexes(WebDriver driver) { Map<String, Integer> columnIndexes = new
	 * HashMap<>();
	 * 
	 * // Locate all column headers inside the AG Grid List<WebElement> headers =
	 * driver.findElements(By.
	 * xpath("//div[@class='ag-header-row ag-header-row-column']//div[@col-id]"));
	 * 
	 * for (int i = 0; i < headers.size(); i++) { String columnName =
	 * headers.get(i).getText().trim(); if (!columnName.isEmpty()) {
	 * columnIndexes.put(columnName, i); // Store column position } } return
	 * columnIndexes; }
	 * 
	 * // Compare web table with Excel data public static void
	 * compareTable(WebDriver driver, List<Map<String, String>> expectedData) {
	 * Map<String, Integer> columnIndexes = getColumnIndexes(driver);
	 * List<WebElement> rows =
	 * driver.findElements(By.xpath("//div[contains(@class,'ag-row')]"));
	 * 
	 * for (int i = 0; i < expectedData.size(); i++) { List<WebElement> cells =
	 * rows.get(i).findElements(By.xpath(".//div[contains(@class,'ag-cell')]"));
	 * Map<String, String> expectedRow = expectedData.get(i);
	 * 
	 * for (String column : expectedRow.keySet()) { if
	 * (columnIndexes.containsKey(column)) { int colIndex =
	 * columnIndexes.get(column); String actualValue =
	 * cells.get(colIndex).getText().trim(); String expectedValue =
	 * expectedRow.get(column);
	 * 
	 * if (!actualValue.equals(expectedValue)) {
	 * System.out.println("❌ Mismatch in row " + (i + 1) + ", column '" + column +
	 * "': Expected '" + expectedValue + "', Found '" + actualValue + "'"); } } else
	 * { System.out.println("⚠ Column '" + column + "' not found in the grid!"); } }
	 * } } }
	 */

	public List<String> getTableHeaders()

	{

		List<String> headers = new ArrayList<>();

		for (WebElement header : headertables) {
			headers.add(header.getText().trim()); // Get text and trim spaces
		}
		return headers;

		/*
		 * String filePath =
		 * "C:\\Users\\Lenovo\\Downloads\\Automation_Projects\\Automation_Projects\\src\\main\\resources\\csvReader.csv";
		 * List<Map<String, String>> csvData = csvReaders.readCSVWithHeaders(filePath);
		 * 
		 * // Example: Get values from a specific column (e.g., "Username") for
		 * (Map<String, String> row : csvData) { System.out.println("Username: " +
		 * row.get("Username") + ", Password: " + row.get("Password")); }
		 */
	}

//public static List<String> getTableHeaders(WebDriver driver, String xpath) {
//     List<WebElement> headerElements = driver.findElements(By.xpath(xpath));
//     List<String> headers = new ArrayList<>();
//     
//     for (WebElement header : headerElements) {
//         headers.add(header.getText().trim()); // Get text and trim spaces
//     }
//     return headers;
// }

	public void clickonFilterFailrequest() throws InterruptedException {
		waitForElementToBeClickable(clickonFailurefilterbutton);
		clickonFailurefilterbutton.click();

	}

	public void clickondropdownFailrequest() throws InterruptedException {
		waitForElementToBeClickable(clickondropdfilterFailurerequest);
		clickondropdfilterFailurerequest.click();
		Thread.sleep(1000);
		selectFailureCategory.click();
		Thread.sleep(1000);
		clickFailureCategorydropdown.click();
		Thread.sleep(1000);
		selectOtherFailureCategory.click();
		Thread.sleep(1000);
		clickofApplybutton.click();

	}

	public void clickonsearchbuttonfailrequest() throws InterruptedException {
		waitForElementToBeClickable(clickinplaceholderserchbutton);
		clickinplaceholderserchbutton.click();

		Thread.sleep(2000);

		clickinplaceholderserchbutton.sendKeys("show me list of employee by department", Keys.ENTER);
		Thread.sleep(2000);

	}

	public String getSearchquestion() throws InterruptedException {
		waitForElementToBeClickable(getTextonserchresult);
		String actualText = getTextonserchresult.getText();
		System.out.println("Actual text" + actualText);
		return actualText;
	}

	// user request Tab

	public void clickUserRequest() throws InterruptedException {
		Actions actions = new Actions(driver);

		// Perform hover action
		actions.moveToElement(menuelement).perform();
		waitForElementToBeClickable(clickonUserrequest);
		Thread.sleep(5000);
		clickonUserrequest.click();

	}

	public String getTextOfUserRequest() throws InterruptedException {
		waitForElementToBeClickable(getTextofUserrequest);
		String actualText = getTextofUserrequest.getText();
		System.out.println("Actual text" + actualText);
		return actualText;

	}

	public void clickweekUserrequest() throws InterruptedException {
		waitForElementToBeClickable(clickUsersrequestWeek);
		clickUsersrequestWeek.click();

	}

	public void clickonFilterUserrequest() throws InterruptedException {
		waitForElementToBeClickable(clickonUserfilterbutton);
		clickonUserfilterbutton.click();
		Thread.sleep(2000);

	}

	public void clickondropdownUserrequest() throws InterruptedException {
		waitForElementToBeClickable(clickondropdfilterUserrequest);
		clickondropdfilterUserrequest.click();
		Thread.sleep(1000);
		SelectStatus.click();
		Thread.sleep(1000);
		clickonStatusValue.click();
		Thread.sleep(1000);

		selectSuccessFilter.click();
		Thread.sleep(5000);

		// clickApplyButton.sendKeys(Keys.ENTER);

		clickApplyButton.click();
		Thread.sleep(5000);

	}
}