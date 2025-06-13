package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.SeleniumAction;
import utils.ExcelReader;

public class Admin extends SeleniumAction {

	protected WebDriver driver;

	// Constructor to initialize elements using the provided WebDriver
	public Admin(WebDriver driver) {
		super(driver); // Call the parent class constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize PageFactory

	}

	@FindBy(xpath = "//img[contains(@src, 'sidebarWhenClosed.svg')]")
	private WebElement manuElement;

	@FindBy(xpath = "//div[contains(@class, 'settings-icon')]")
	private WebElement clickonSetting;

	@FindBy(xpath = "//div[contains(text(),'Administration')]")
	private WebElement clickonAddministration;

	// div[contains(@class, 'sadeNav-menu-item')]//label[@class='label' and
	// text()='Admin']
	@FindBy(xpath = "//div[contains(@class, 'sadeNav-menu-item')]//em[contains(@class, 'Administrator-Apps')]")

	// @FindBy(xpath = "//div[@class='sadeNav-menu-item ng-star-inserted' and
	// @style='padding-left: 0em;']//label[text()='Applications']")
	private WebElement clickonAddministrationIcon;

	@FindBy(xpath = " //div[contains(@class, 'sadeNav-menu-item')]//label[@class='label' and text()='Overview']")
	private WebElement clickonViewIcon;

	@FindBy(xpath = " //bntv-mat-button//button//span[contains(@class, 'mat-mdc-button-touch-target')]")
	private WebElement clickonViewRefreshIcon;

	@FindBy(xpath = "//h3[@_ngcontent-ng-c1000978565 and text()='Administration']")
	private WebElement VerifygetAddministrationtext;

	// @FindBy(xpath = "//div[contains(@class,
	// 'sadeNav-menu-item')]//em[contains(@class, 'Administrator-Apps')]")
	// private WebElement clickonadmin;

	@FindBy(xpath = "//span[contains(text(), 'Applications by intent type')]")
	private WebElement verifyApplicationByIntentType;

	@FindBy(xpath = "//span[normalize-space()='Applications']")
	private WebElement clickApplicationonDashboard;

	@FindBy(xpath = "//div[@class='sadeNav-menu-item ng-star-inserted' and @style='padding-left: 0em;']//label[text()='Applications']")
	private WebElement clickonAdmintext;

	@FindBy(xpath = "//mat-sidenav-container/mat-sidenav[1]//sidenav-item/div[2]/div[2]/sidenav-item/div[2]/div")
	private WebElement ClickonApplicationModule;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[5]")
	private WebElement clickonRefreshButton;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[1]")
	private WebElement clickonApplicationSearchIcon;

	@FindBy(xpath = " //input[@type='text']")
	private WebElement clickonApplicationPlaceholder;

	// @FindBy(xpath = "(//span[contains(@class,
	// 'mat-mdc-button-touch-target')])[12]")
	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[13]")
	private WebElement clickonHrmsActionButton;

	@FindBy(xpath = " (//span[@class='ng-star-inserted'])[5]")
	private WebElement clickonHrmsView;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[14]")
	private WebElement clickonViewcancelButton;

	@FindBy(xpath = "//div[contains(@class, 'productui-value-title') and contains(text(), 'HRMS')]")
	private WebElement VerifyHRMSapplicationsName;

	// Datasource Tab
	@FindBy(xpath = "//div[contains(@class, 'productui-value-title') and contains(text(), 'HRMS')]")
	private WebElement clickonHRMSApplication;

	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[7]")
	private WebElement clickRefreshDatasource;

	@FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element') and contains(@placeholder, 'Search')]")
	private WebElement clickonsearchButtonDatasource;

	@FindBy(xpath = "(//div[contains(@class, 'value') and contains(@class, 'ng-star-inserted')])[4]")
	private WebElement verifySerachingTable;

	@FindBy(xpath = "//div[@class='ag-header-cell ag-focus-managed']")
	private List<WebElement> VerifydatasoureTableGrid;

	// div[@class='ag-header-cell ag-focus-managed']

	@FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element')]")
	private WebElement clickColumnName;

	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[13]")
	private WebElement clickColumnActionButton;

	@FindBy(xpath = "//button[contains(@class, 'mat-mdc-menu-item') and .//span[contains(text(), 'Edit')]]")
	private WebElement clickonEditButton;

	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[19]")
	private WebElement clickonEditCancelButton;
	// Entities tab

	@FindBy(xpath = "//div[contains(@class, 'app_tab_title')]//span[contains(text(), 'Entities')]")
	private WebElement clickEntities;
	@FindBy(xpath = "//input[@type='text' and contains(@class, 'mat-mdc-input-element') and contains(@placeholder, 'Search')]")
	private WebElement clickEntitiesSearch;

	@FindBy(xpath = "(//div[contains(@class, 'value') and contains(text(), 'Employee')])[1]")
	private WebElement getVerifysearchEntities;

	@FindBy(xpath = " (//span[contains(@class, 'mat-mdc-button-touch-target')])[17]")

	private WebElement clickonEntitieActionButton;
	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']//span[normalize-space(text())='Edit']")

	private WebElement clickonEntitieEditButton;
	// @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[32]
	// ")//button[.//span[normalize-space(text())='Cancel']]
	@FindBy(xpath = "//button[.//span[normalize-space(text())='Cancel']] ")
	private WebElement clickonEntitieCancelButton;

	@FindBy(xpath = " //button[contains(@class, 'mat-mdc-menu-item')]//span[contains(text(), 'View')]")
	private WebElement clickonEntitieViewButton;

	// @FindBy(xpath = " ((//span[contains(@class,
	// 'mat-mdc-button-touch-target')]))[31]")
	@FindBy(xpath = "  (//button[.//mat-icon[contains(@class, 'close')]])[1]")

	private WebElement clickonEntitieViewCancelButton;

	@FindBy(xpath = "//*[@id=\"core-gx-ag-grid-header-filter-button_x101_x101-service_api-services\"]/div/button/span[3]")
	private WebElement clickonEntitieFilterButton;

	@FindBy(xpath = "//div[contains(@class, 'mat-mdc-select-value')]//span[contains(text(), 'Select filter')]")
	private WebElement clickonDropdown;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Type')]")
	private WebElement selectDropdownType;

	@FindBy(xpath = "//span[contains(@class, 'mat-mdc-select-placeholder') and text()='Type']")
	private WebElement selectTypeValue;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and text()='Direct']")
	private WebElement selectTypeDirectValue;

	// @FindBy(xpath = "(//div[contains(@class,
	// 'filter')]//bntv-mat-button//button/span[4])[6]")
	@FindBy(xpath = "//button[@aria-label='toolbutton' and contains(@class, 'mat-mdc-unelevated-button')]")
	private WebElement SubmitApplyButton;

	@FindBy(xpath = "//span[contains(@class, 'icomoon') and contains(@class, 'close') and contains(@class, 'custom-chips__icon')]")
	private WebElement clickonClosebutton;

	// span[contains(@class, 'ng-star-inserted') and contains(text(), 'Live')]

	@FindBy(xpath = "//mat-select//span[contains(text(), 'Live')]")
	private WebElement clickonEntityStatus;

	@FindBy(xpath = "//div[@class='headercell-label ng-star-inserted']")
	private List<WebElement> EntityGridvalidation;

	// micro intent Tab

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Micro-intents')]")
	private WebElement clickonMicroIntent;

	@FindBy(xpath = "//div[@class='ag-header-cell ag-focus-managed']")
	private List<WebElement> validateMicroIntentGrid;

	@FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element') and contains(@placeholder, 'Search')]")
	private List<WebElement> clickonMicroIntentPlaceholder;

	@FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element') and contains(@placeholder, 'Search')]")
	private WebElement clickonSearchMicroIntent;

	@FindBy(xpath = "//div[contains(@class, 'ag-cell') and @col-id='name']//div[contains(@class, 'value') and contains(text(), 'Employee List')]")
	private WebElement getMicrointentname;

	@FindBy(xpath = "//div[contains(@class, 'ag-cell') and @col-id='name']//div[contains(@class, 'value') and contains(text(), 'Employee List')]")
	private WebElement VerifyMicroIntentName;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[14]")
	private WebElement clickonMicroMicroIntentActionButton;

	@FindBy(xpath = "	//span[contains(text(), 'Edit')]")
	private WebElement clickonMicroMicroIntentEditButton;

	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[20]")
	private WebElement clickonMicroMicroIntentCancleButton;

	// micro intent filter
	// click on filter button
	@FindBy(xpath = "//*[@id=\"core-gx-ag-grid-header-filter-button_x101_x101-service_api-services\"]/div/button/span[3]")
	private WebElement clickOnMicroIntentFilter;

	@FindBy(xpath = "//span[contains(@class, 'mat-mdc-select-placeholder') and contains(text(), 'Select filter')]")
	private WebElement clickOnMicroIntentDropdown;

	@FindBy(xpath = "//span[contains(@class, 'mdc-list-item__primary-text')]//span[contains(text(), 'Micro-intent name')]")
	private WebElement clickOnMicroIntentSelectOpction;

	@FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element') and @placeholder='Micro-intent name']")
	private WebElement clickOnMicroIntentPlaceholder;

	@FindBy(xpath = "//span[contains(text(), 'Equals')]")
	private WebElement clickOnMicroIntentEquals;

	@FindBy(xpath = " //span[contains(text(), 'Contains')]")
	private WebElement clickOnMicroIntentContainsOperator;

	@FindBy(xpath = "//div[contains(@class, 'ag-cell') and @col-id='name']//div[contains(text(), 'Employee List')]")
	private WebElement getVerifyFilterMicroIntentName;
//dataset Tab

	@FindBy(xpath = "//div[contains(@id, 'core-tab_DATASETS')]")
	private WebElement clickonDatasetTab;

	@FindBy(xpath = "//div[@class='ag-header-cell ag-focus-managed']")
	private List<WebElement> validateDatasetGrid;

	@FindBy(xpath = "//input[contains(@placeholder, 'Search')]")
	private WebElement ClickonDatasetSearch;

	@FindBy(xpath = "(//div[contains(@class, 'ag-cell-wrapper')]//span[contains(text(), 'Risk')])[1]")
	private WebElement getDatasetName;

	@FindBy(xpath = "(//div[contains(@class, 'ag-cell-wrapper')]//span[contains(text(), 'Risk')])[1]")
	private WebElement VerifyDatasetName;

	// click on data set action button
	@FindBy(xpath = "(//div[@col-id='gxAgGridMenuButton']//button[contains(@class, 'mat-mdc-icon-button')])[2]")
	private WebElement ClickOnDatasetAction;
	// click on data set edit button
	@FindBy(xpath = "//button[contains(@class, 'mat-mdc-menu-item')]//span[contains(text(), 'Edit')]")
	private WebElement ClickOnDatasetEdit;

	// button[contains(@class, 'mat-mdc-unelevated-button')]//span[contains(text(),
	// 'Next')]

	@FindBy(xpath = "//*[@id=\"appCont\"]/x101-root/grid-data-source-add-data-source/bntv-page/div/div[2]/div/div/bntv-mat-button/div/button")
	private WebElement ClickOnDatasetNext;

	@FindBy(xpath = "//div[@class='ag-header-cell ag-focus-managed']")
	private List<WebElement> validateDatasetTableGrid;
//	   
//	   //Scroll down
//	   @FindBy(xpath =" //label[contains(@for, 'defineJoinsInput')]")
//	    private List<WebElement> ScrollDownfromdefineJoinsInput;
//	   
//	   
//	   @FindBy(xpath ="(//textarea[contains(@id, 'mat-input-')])[4]")
//	    private List<WebElement> ScrollDownToDescription;

	@FindBy(xpath = "//button[span/span[contains(text(), 'Next')]]")
	private WebElement ClickOnDatasetTableNext;

	// click on cancel button

	@FindBy(xpath = "//button[span/span[contains(text(), 'Cancel')]]")
	private WebElement ClickOnDatasetTableCancel;
	// click add data set
	@FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]")
	private WebElement ClickOnDatasetAddDataset;

	@FindBy(xpath = "//*[@id=\"appCont\"]/x101-root/grid-data-source-add-data-source/bntv-page/div/div[2]/div/bntv-mat-button/div/button/span[4]")
	private WebElement ClickOnDatasetAddCancelDataset;

	// click on data set filter button
	@FindBy(xpath = "//*[@id=\"core-gx-ag-grid-header-filter-button_x101_x101-service_api-services\"]/div/button/span[3]")
	private WebElement ClickOnDatasetFilterDataset;

	@FindBy(xpath = "//mat-select//span[contains(text(), 'Select filter')]")
	private WebElement ClickOnDatasetSearchFilterDataset;

	@FindBy(xpath = "//span[span[text()='Name']]")
	private WebElement ClickOnDatasetSelectFilterName;

	@FindBy(xpath = "//input[contains(@placeholder, 'Name')]")
	private WebElement ClickOnDatasetFilterPlaceholder;

	@FindBy(xpath = "//span[contains(text(), 'Equals')]")
	private WebElement clickOnDatasetEquals;

	@FindBy(xpath = "//span[contains(text(), 'Contains')]")
	private WebElement clickOnDatasetContainsOperator;

//service tab

	// Service Tab(API)

	@FindBy(xpath = "//div[@id='core-tab_Services_x101_x101-service_api-services']//span[text()='Services']")
	private WebElement clickOnServiceTab;

	@FindBy(xpath = "//div[contains(text(), '/rest/EmployeeGoalsDetails/findAllById')]")
	private WebElement getServiceName;

	@FindBy(xpath = "//input[contains(@placeholder, 'Search')]")
	private WebElement clickOnServicePlaceholder;

	@FindBy(xpath = "//div[contains(text(), '/rest/EmployeeGoalsDetails/findAllById')]")
	private WebElement VerifyServiceName;

	@FindBy(xpath = "//bntv-mat-button//button[.//mat-icon[@data-mat-icon-name='Settings-Outline']]")
	private WebElement ClickonadvanceSetting;

	// click on Configuration type list
	@FindBy(xpath = " (//div[contains(@class, 'mat-mdc-select-value')])[3]")
	private WebElement ConfigurationTypeList;

	@FindBy(xpath = "	 //input[@aria-label='dropdown search']")
	private WebElement ClickOnSearchConfigurationTypeList;

	@FindBy(xpath = "//button[contains(@class, 'mat-mdc-outlined-button') and .//span[text()='Cancel']]")
	private WebElement ClickOnConfigurationTypeListCancel;

	@FindBy(xpath = "(//button[@role='button' and contains(@class, 'mat-mdc-icon-button') and .//mat-icon[contains(@data-mat-icon-name, 'Edit-Outline')]])[2]")
	private WebElement ClickOnConfigurationTypeListEditAPI;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[63]")
	private WebElement ClickOnResponseSchema;

	// @FindBy(xpath ="//button[contains(@class,
	// 'mat-mdc-menu-item')][.//span[contains(text(), 'Edit')]]")
	@FindBy(xpath = "//span[normalize-space(text())='Edit']")

	private WebElement ClickOnResponseSchemaEdit;

	@FindBy(xpath = "(//button[contains(@class, 'mat-mdc-outlined-button') and .//span[contains(text(), 'Cancel')]])[2]")
	private WebElement ClickOnResponseSchemaCancel;

	@FindBy(xpath = "(//button[contains(@class, 'mat-mdc-outlined-button') and .//span[contains(text(), 'Cancel')]])[1]")
	private WebElement ClickOnEditserviceCancelButton;
	@FindBy(xpath = "(//button[@role='button' and contains(@class, 'mat-mdc-icon-button') and .//mat-icon[contains(@data-mat-icon-name, 'Edit-Outline')]])[1]")
	private WebElement ClickOnEditService;
	@FindBy(xpath = " (//button[contains(@class, 'mat-mdc-outlined-button') and .//span[contains(text(), 'Cancel')]])")
	private WebElement ClickOnEditCancelService;

	@FindBy(xpath = "//button[@role='button' and contains(@class, 'mat-mdc-icon-button') and .//mat-icon[contains(@data-mat-icon-name, 'Copy-Outline')]]")
	private WebElement ClickOnCloneAPI;

	// @FindBy(xpath ="(//bntv-tile-view-list-item//input[@type=\"checkbox\"])[1]")
	@FindBy(xpath = "(//bntv-tile-view-list-item//input[@type='checkbox'])[1]")

	private WebElement ClickOnCheckBox;

	@FindBy(xpath = "//bntv-tile-view-list-item//*[text()=' %s ']")
	private WebElement checkAPI;

	@FindBy(xpath = "//bntv-gx-ag-grid-header/div[1]/div[2]/bntv-select-box[2]//mat-form-field")
	private WebElement ClickOnServiceStatusDropdown;

//	Arbitatioin
	@FindBy(xpath = "//div[contains(@class, 'sadeNav-menu-item')]//em[contains(@class, 'po-workorder-create')]")
	private WebElement arbitrationButton;

	@FindBy(xpath = "//h3[contains(text(), 'Arbitrations')]")
	private WebElement arbitrationText;

	@FindBy(xpath = "//button[.//mat-icon[@data-mat-icon-name='refresh']]")
	private WebElement refreshButton;

	@FindBy(xpath = "//div[contains(@class, 'sadeNav-menu-item')]//em[contains(@class, 'Administrator-Apps')]")
	private WebElement clickonadmin;

	@FindBy(xpath = "//bntv-gx-ag-grid-header//bntv-mat-button[3]//button//span[3]")
	private WebElement arbitrationFilterButton;

	@FindBy(xpath = "//div[contains(@class, 'mat-mdc-select-value')]//span[contains(text(), 'Select filter')]")
	private WebElement selectFilter;

	@FindBy(xpath = "//span[@class='ng-star-inserted' and text()='Type']")
	private WebElement selectFilterType;

	@FindBy(xpath = "//span[contains(@class, 'mat-mdc-select-placeholder') and text()='Type']")
	private WebElement clickOnFilterValue;

	@FindBy(xpath = " //span[contains(@class, 'ng-star-inserted') and text()='Direct']")
	private WebElement selectFilterValue;

//    @FindBy(xpath = "(//button[contains(@class, 'mat-mdc-unelevated-button') and contains(., 'Apply')]")
	@FindBy(xpath = "(//div[contains(@class, 'filter')]//bntv-mat-button//button/span[4])[6]")
	private WebElement clickOnApplyButton;

	@FindBy(xpath = "//div[contains(text(), 'Type = Direct')]")
	private WebElement verifyApplyFilterType;

	@FindBy(xpath = " (//div[@class='value ng-star-inserted'])[1]")
	private WebElement arbitrationFirstQuestion;

	@FindBy(xpath = "//div[@fxlayoutalign='start center']/div[2]/bntv-mat-button[1]")
	WebElement clickOnSearchButton;

	@FindBy(xpath = "//input[contains(@placeholder, 'Search') and contains(@class, 'mat-mdc-input-element')]")
	private WebElement enterValueInSearch;

	@FindBy(xpath = " (//div[@class='value ng-star-inserted'])[1]")
	private WebElement verifyarbitrationSearchQuestion;

	@FindBy(xpath = "(//div[contains(@class, 'value') and contains(@class, 'ng-star-inserted')])[3]")
	private WebElement verifyDerivedQuestion;

	@FindBy(xpath = "//label[@class='label' and contains(text(), 'Templates')]")
	private WebElement clickOnTemplateButton;

	@FindBy(xpath = " (//div[@class='value ng-star-inserted'])[1]")
	private WebElement firstTemplate;

	@FindBy(xpath = "(//div[@class='value ng-star-inserted'])[1]")
	private WebElement verifyaTemplateSearch;

	@FindBy(xpath = "//bntv-mat-button[3]/div/button/span[3]")
//  @FindBy(xpath = "//*[@id=\"core-gx-ag-grid-header-filter-button_x101_x101-service_templates\"]/div/button/span[3]")
	private WebElement selectTemplateFilter;

	@FindBy(xpath = "//mat-option[.//span[contains(text(), 'Title')]]")
	private WebElement selectTemplateTitle;

	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement clickOnTemplateFilterValue;

	@FindBy(xpath = "//*[@id=\"mat-menu-panel-63\"]/div/filter/div/div[3]/bntv-mat-button/div/button/span[4]")
	private WebElement clickOnTemplateApplyButton;

	@FindBy(xpath = "//div[@class='ag-header-cell ag-focus-managed']")
	private List<WebElement> arbitrationGridHeader;

	@FindBy(xpath = "//div[@class='headercell']")
	private List<WebElement> templateGridHeader;

	@FindBy(xpath = "//mat-select//span[contains(text(), 'Equals')]")
	private WebElement clickOnEqualOperator;

	@FindBy(xpath = "//span[contains(text(), 'Not equals')]")
	private WebElement clickOnNotEqualOperator;
//div[contains(text(), 'Type != Direct')]
	@FindBy(xpath = "//div[contains(text(), 'Type != Direct')]")
	private WebElement verifyArbitrationNotEqualFilter;

//mat-icon[contains(@data-mat-icon-name, 'plus_small') and contains(@fonticon, 'plus_small')]

	@FindBy(xpath = "//div[@fxlayoutalign='start center']/div[2]/bntv-mat-button[2]")
	private WebElement ClickOnAddTemplate;

	/*
	 * public void clickSetting() throws InterruptedException { Set<String>
	 * windowHandles = driver.getWindowHandles(); Iterator<String> iterator =
	 * windowHandles.iterator(); String parent = iterator.next(); String child =
	 * iterator.next(); driver.switchTo().window(child); manuElement.click(); //
	 * Click menu Thread.sleep(5000); clickonSetting.click(); Thread.sleep(3000);
	 * 
	 * clickonAddministration.click(); Thread.sleep(10000);
	 */

	public void clickOnSetting() throws InterruptedException {

		manuElement.click(); // Click menu
		Thread.sleep(5000);
		clickonSetting.click();
		Thread.sleep(3000);

		clickonAddministration.click();

	}

//	    public void clickAdmin() throws InterruptedException {
//	        waitForElementToBeClickable(clickonadmin);
//	        clickonadmin.click();    

	public void clickAddministrationIcon() throws InterruptedException {
		waitForElementToBeClickable(clickonAddministrationIcon);
		clickonAddministrationIcon.click();
		Thread.sleep(2000);
		clickonViewIcon.click();
		Thread.sleep(2000);

		clickonViewRefreshIcon.click();
	}

	public String getTextOfAddministration() throws InterruptedException {
		waitForElementToBeClickable(VerifygetAddministrationtext);
		String actualText = VerifygetAddministrationtext.getText();
		// System.out.println("Actual text" +actualText);
		return actualText;

	}

	public String getVerifyTextApplication() throws InterruptedException {
		waitForElementToBeClickable(verifyApplicationByIntentType);
		String actualText = verifyApplicationByIntentType.getText();
		// System.out.println("Actual text" +actualText);
		return actualText;

	}

	public void clickApplicationsonDashboard() throws InterruptedException {
		waitForElementToBeClickable(clickApplicationonDashboard);
		clickApplicationonDashboard.click();
		Thread.sleep(2000);
	}

	public void clickApplicationIcon() throws InterruptedException {
		waitForElementToBeClickable(clickonAddministrationIcon);
		clickonAddministrationIcon.click();
		Thread.sleep(2000);
		ClickonApplicationModule.click();
		Thread.sleep(2000);
		clickonRefreshButton.click();
		Thread.sleep(2000);
	}

	public void clickonApplicationSearch() throws InterruptedException {
		waitForElementToBeClickable(clickonApplicationSearchIcon);
		// clickonAdmintext.click();
		Thread.sleep(2000);
		clickonApplicationSearchIcon.click();
		Thread.sleep(2000);
		clickonApplicationPlaceholder.click();
		Thread.sleep(3000);
		clickonApplicationPlaceholder.sendKeys("HRMS", Keys.ENTER);
		Thread.sleep(4000);
		clickonHrmsActionButton.click();
		Thread.sleep(4000);
		clickonHrmsView.click();
		Thread.sleep(4000);
		clickonViewcancelButton.click();

	}

	public String verifyApplicationName() throws InterruptedException {

		waitForElementToBeClickable(VerifyHRMSapplicationsName);
		String actualText = VerifyHRMSapplicationsName.getText();
		System.out.println("Actual text" + actualText);
		return actualText;

	}

	public void clickHRMSApplication() throws InterruptedException {
		waitForElementToBeClickable(clickonHRMSApplication);
		clickonHRMSApplication.click();
		Thread.sleep(2000);
		clickRefreshDatasource.click();
		Thread.sleep(3000);
		clickonsearchButtonDatasource.click();
		Thread.sleep(2000);

		clickonsearchButtonDatasource.sendKeys("Interview", Keys.ENTER);

	}

	public void enterSearchText(String text) {
		// Clear any existing text
		clickonsearchButtonDatasource.sendKeys(text);
	}

	// Method to get the search result text
	public String getSearchResultText() {
		return verifySerachingTable.getText().trim();
	}

	public void clicksearchResult() throws InterruptedException {
		waitForElementToBeClickable(verifySerachingTable);

		verifySerachingTable.click();

	}

	private List<String> actualTable;
	private List<String> expectedTable;

	public void getTableValidation() throws InterruptedException {
		String excelFilePath = ".\\src\\main\\resources\\ExcelReader\\X101ExcelReader.xlsx";
		int colNum = 1;

		expectedTable = new ArrayList<>();
		try {
			expectedTable = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			throw new RuntimeException("Error reading Excel file: " + excelFilePath, e);
		}

		actualTable = new ArrayList<>();
		for (WebElement item : VerifydatasoureTableGrid) {
			actualTable.add(item.getText().trim());
		}

		// Remove empty strings from actualTable
		actualTable = actualTable.stream().map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());

		// Trim expectedTable values
		expectedTable = expectedTable.stream().map(String::trim).collect(Collectors.toList());

		System.out.println("Actual Table: " + actualTable);
		System.out.println("Expected Table: " + expectedTable);
	}

	public List<String> getActualTable() {
		return actualTable;
	}

	public List<String> getExpectedTable() {
		return expectedTable;
	}

	public void clickonColumnName() throws InterruptedException {
		waitForElementToBeClickable(clickColumnName);
		clickColumnName.click();
		Thread.sleep(2000);
		clickColumnName.sendKeys("ID", Keys.ENTER);
		clickColumnActionButton.click();
		Thread.sleep(2000);
		clickonEditButton.click();
		Thread.sleep(2000);
		clickonEditCancelButton.click();
		driver.navigate().back();
	}

	public void clickonEntities() throws InterruptedException {
		waitForElementToBeClickable(clickEntities);
		clickEntities.click();

	}

	public void clickonEntitiesSearch() throws InterruptedException {
		waitForElementToBeClickable(clickEntitiesSearch);
		clickEntitiesSearch.click();
		Thread.sleep(2000);
		clickEntitiesSearch.sendKeys("Employee", Keys.ENTER);
	}

	public void entitiesSearchText(String text) {
		// Clear any existing text
		clickEntitiesSearch.sendKeys(text);
	}

	// Method to get the search result text
	public String getSearchResultTexts() {
		return getVerifysearchEntities.getText().trim();
	}

	public void clickonEntitiesActionButton() throws InterruptedException {
		waitForElementToBeClickable(clickonEntitieActionButton);
		clickonEntitieActionButton.click();
		Thread.sleep(2000);
		clickonEntitieEditButton.click();
		Thread.sleep(2000);
		clickonEntitieCancelButton.click();
		Thread.sleep(5000);
		// clickonEntitieActionButton.click();
		// Thread.sleep(2000);
		// clickonEntitieViewButton.click();
		// Thread.sleep(2000);
		// clickonEntitieViewCancelButton.click();
		Thread.sleep(1000);
		clickEntitiesSearch.clear();

	}

	public void clickonEntitiesFilterButton() throws InterruptedException {
		waitForElementToBeClickable(clickonEntitieFilterButton);
		clickonEntitieFilterButton.click();
		Thread.sleep(2000);
		clickonDropdown.click();
		Thread.sleep(2000);

		selectDropdownType.click();
		Thread.sleep(2000);
		selectTypeValue.click();
		Thread.sleep(2000);
		selectTypeDirectValue.click();
		Thread.sleep(2000);
		SubmitApplyButton.click();
		Thread.sleep(2000);
		clickonClosebutton.click();

	}

	public void clickonEntityStatusbutton() throws InterruptedException {
		waitForElementToBeClickable(clickonEntityStatus);

		clickonEntityStatus.click();
		Thread.sleep(3000);

	}

	/*
	 * public void getEntitygridValidate() throws InterruptedException { String
	 * excelFilePath = ".\\src\\main\\resources\\ExcelReader\\X101ExcelReader.xlsx";
	 * int colNum = 1;
	 * 
	 * List<String> expectedList = new ArrayList<>(); try { expectedList =
	 * ExcelReader.readColumnData(excelFilePath, colNum); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * List<String> actualList = new ArrayList<>(); for (WebElement item :
	 * EntityGridvalidation) { actualList.add(item.getText().trim()); }
	 * 
	 * 
	 * actualList = actualList.stream() .map(String::trim) .filter(s ->
	 * !s.isEmpty()) // Remove any empty strings .collect(Collectors.toList());
	 * 
	 * System.out.println("actualList : " + actualList);
	 * System.out.println("expectedList : " + expectedList);
	 * 
	 * // Ensure expectedList is also properly trimmed (if necessary) expectedList =
	 * expectedList.stream() .map(String::trim) .collect(Collectors.toList());
	 * 
	 * 
	 * // if (actualList.equals(expectedList)) { //
	 * System.out.println("Dashboard items match the expected list."); // } else {
	 * // System.out.println("Dashboard items do not match the expected list."); //
	 * //
	 */
	private List<String> actualList;
	private List<String> expectedList;

	public void getEntitygridValidate() throws InterruptedException {
		String excelFilePath = ".\\src\\main\\resources\\ExcelReader\\X101ExcelReader.xlsx";
		int colNum = 0;

		expectedList = new ArrayList<>();
		try {
			expectedList = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			e.printStackTrace();
		}

		actualList = new ArrayList<>();
		for (WebElement item : EntityGridvalidation) {
			actualList.add(item.getText().trim());
		}

		actualList = actualList.stream().map(String::trim).filter(s -> !s.isEmpty()) // Remove any empty strings
				.collect(Collectors.toList());

		expectedList = expectedList.stream().map(String::trim).collect(Collectors.toList());

		System.out.println("Actual List: " + actualList);
		System.out.println("Expected List: " + expectedList);
	}

	// Micro Intent Tab
	public void clickonMicroIntentTab() throws InterruptedException {
		waitForElementToBeClickable(clickonMicroIntent);
		Thread.sleep(3000);
		clickonMicroIntent.click();

	}

	private List<String> actualMicro;
	private List<String> expectedMicro;

	public void getMicroIntentsGridValidate() throws InterruptedException {
		String excelFilePath = ".\\src\\main\\resources\\ExcelReader\\X101ExcelReader.xlsx";
		int colNum = 2;

		expectedMicro = new ArrayList<>();
		try {
			expectedMicro = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			e.printStackTrace();
		}

		actualMicro = new ArrayList<>();
		for (WebElement item : validateMicroIntentGrid) {
			actualMicro.add(item.getText().trim());
		}

		actualMicro = actualMicro.stream().map(String::trim).filter(s -> !s.isEmpty()) // Remove any empty strings
				.collect(Collectors.toList());

		expectedMicro = expectedMicro.stream().map(String::trim).collect(Collectors.toList());

		System.out.println("actual Micro List: " + actualMicro);
		System.out.println("expected Micro List : " + expectedMicro);
	}

	public List<String> getActualMicro() {
		return actualMicro;
	}

	public List<String> getExpectedMicro() {
		return expectedMicro;
	}

	String Actualmicrointent;

	public String getMicroIntent() throws InterruptedException {
		waitForElementToBeClickable(getMicrointentname);

		Actualmicrointent = getMicrointentname.getText();
		Thread.sleep(3000);
		return Actualmicrointent;
	}

	// click on microintent placeholder
	public String clickOnMicroIntentSearchButton() throws InterruptedException {
		// waitForElementToBeClickable(clickonSearchMicroIntent);
		clickonSearchMicroIntent.click();
		Thread.sleep(1000);
		clickonSearchMicroIntent.sendKeys(Actualmicrointent, Keys.ENTER);
		return Actualmicrointent;
	}

	public String verifyMicroIntentName() throws InterruptedException {
		waitForElementToBeClickable(VerifyMicroIntentName);
		String Expectedmicrointent = VerifyMicroIntentName.getText();
		return Expectedmicrointent;

	}

	public void clickonMicroIntentActionButton() throws InterruptedException {
		// waitForElementToBeClickable(clickonMicroMicroIntentActionButton);
		Thread.sleep(2000);
		clickonMicroMicroIntentActionButton.click();
		Thread.sleep(2000);
		clickonMicroMicroIntentEditButton.click();
		Thread.sleep(2000);

		clickonMicroMicroIntentCancleButton.click();
		Thread.sleep(2000);
	}

	String MicrointentName;

	public void clickonMicroIntentfilterButton() throws InterruptedException {
		// waitForElementToBeClickable(clickOnMicroIntentFilter);
		Thread.sleep(2000);
		clickOnMicroIntentFilter.click();
		Thread.sleep(1000);
		clickOnMicroIntentDropdown.click();
		Thread.sleep(1000);
		clickOnMicroIntentSelectOpction.click();
		Thread.sleep(1000);
		clickOnMicroIntentPlaceholder.click();
		Thread.sleep(1000);
		String MicrointentName = getMicrointentname.getText();
		clickOnMicroIntentPlaceholder.sendKeys(MicrointentName, Keys.ENTER);
		Thread.sleep(3000);

	}

	public String VerifyFilterdMicroIntentName() throws InterruptedException {

		Thread.sleep(2000);
		waitForElementToBeClickable(getVerifyFilterMicroIntentName);
		String actualName = getVerifyFilterMicroIntentName.getText();
		return actualName;

	}

	public void ClickFilterdMicroNamewithContains() throws InterruptedException {
		// waitForElementToBeClickable(clickOnMicroIntentFilter);
		Thread.sleep(2000);
		clickOnMicroIntentFilter.click();
		Thread.sleep(1000);
		clickOnMicroIntentEquals.click();
		Thread.sleep(1000);
		clickOnMicroIntentContainsOperator.click();
		Thread.sleep(1000);
		clickOnMicroIntentPlaceholder.clear();

		clickOnMicroIntentPlaceholder.sendKeys("Employee", Keys.ENTER);

	}

	public String VerifyFilterdMicroIntentNameContains() throws InterruptedException {
		// waitForElementToBeClickable(VerifyFilterdMicroIntentNameContains);
		Thread.sleep(2000);

		String ActualContains = "Employee";
		return ActualContains;
	}
	// click on dataset tab

	public void clickonDataSetTab() throws InterruptedException {
		waitForElementToBeClickable(clickonDatasetTab);
		clickonDatasetTab.click();

	}
	// data grid validation

	private List<String> actualDataset;
	private List<String> expectedDataset;

	public void getDatasetValidation() throws InterruptedException {
		String excelFilePath = ".\\src\\main\\resources\\ExcelReader\\X101ExcelReader.xlsx";
		int colNum = 3;

		expectedDataset = new ArrayList<>();
		try {
			expectedDataset = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			throw new RuntimeException("Error reading Excel file: " + excelFilePath, e);
		}

		actualDataset = new ArrayList<>();
		for (WebElement item : validateDatasetGrid) {
			actualDataset.add(item.getText().trim());
		}

		// Remove empty strings from actualTable
		actualDataset = actualDataset.stream().map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());

		// Trim expectedTable values
		expectedDataset = expectedDataset.stream().map(String::trim).collect(Collectors.toList());

		System.out.println("actual Dataset : " + actualDataset);
		System.out.println("expected Dataset : " + expectedDataset);
	}

	public List<String> getactualDataset() {
		return actualDataset;
	}

	public List<String> getexpectedDataset() {
		return expectedDataset;
	}

	String ActualDataset;

	public String getDatasetsName() throws InterruptedException {
		waitForElementToBeClickable(getDatasetName);
		ActualDataset = getDatasetName.getText();
		Thread.sleep(1000);
		return ActualDataset;

	}

	public String clickOnDatasetSearchButton() throws InterruptedException {
		waitForElementToBeClickable(ClickonDatasetSearch);

		ClickonDatasetSearch.click();

		ClickonDatasetSearch.sendKeys(ActualDataset, Keys.ENTER);
		Thread.sleep(2000);
		// ClickonDatasetSearch.clear();
		return ActualDataset;

	}

	public String verifyDatasetName() throws InterruptedException {
		waitForElementToBeClickable(VerifyDatasetName);
		String ExpectedDateset = VerifyDatasetName.getText();
		return ExpectedDateset;

	}

	public void ClickonDatasetActionButton() throws InterruptedException {
		waitForElementToBeClickable(ClickOnDatasetAction);
		Thread.sleep(3000);

		ClickOnDatasetAction.click();
		Thread.sleep(2000);

		ClickOnDatasetEdit.click();
		Thread.sleep(2000);

		ClickOnDatasetNext.click();

	}

	// dataset table grid validation
	private List<String> actualDatasetTableGrid;
	private List<String> expectedDatasetTableGrid;

	public void getDatasetTableGridValidation() throws InterruptedException {
		String excelFilePath = ".\\src\\main\\resources\\ExcelReader\\X101ExcelReader.xlsx";
		int colNum = 4;

		expectedDatasetTableGrid = new ArrayList<>();
		try {
			expectedDatasetTableGrid = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			throw new RuntimeException("Error reading Excel file: " + excelFilePath, e);
		}

		actualDatasetTableGrid = new ArrayList<>();
		for (WebElement item : validateDatasetTableGrid) {
			actualDatasetTableGrid.add(item.getText().trim());
		}

		// Remove empty strings from actualTable
		actualDatasetTableGrid = actualDatasetTableGrid.stream().map(String::trim).filter(s -> !s.isEmpty())
				.collect(Collectors.toList());

		// Trim expectedTable values
		expectedDatasetTableGrid = expectedDatasetTableGrid.stream().map(String::trim).collect(Collectors.toList());

		System.out.println("Actual Dataset Table Grid : " + actualDatasetTableGrid);
		System.out.println("Expected Dataset  Table Grid  : " + expectedDatasetTableGrid);
	}

	public List<String> getactualDatasetTableGrid() {
		return actualDatasetTableGrid;
	}

	public List<String> getexpectedDatasetTableGrid() {
		return expectedDatasetTableGrid;
	}

	public void ClickonDatasetTableNextButton() throws InterruptedException {
		waitForElementToBeClickable(ClickOnDatasetTableNext);

		ClickOnDatasetTableNext.click();
		Thread.sleep(2000);
		ClickOnDatasetTableCancel.click();
	}

	public void ClickOnAddDatasetButton() throws InterruptedException {
		waitForElementToBeClickable(ClickOnDatasetAddDataset);
		ClickOnDatasetAddDataset.click();
		Thread.sleep(2000);
		ClickOnDatasetAddCancelDataset.click();
		Thread.sleep(3000);
	}

	String DatasetName;

	public void ClickOnDatasetFilterButton() throws InterruptedException {
		waitForElementToBeClickable(ClickOnDatasetFilterDataset);
		ClickOnDatasetFilterDataset.click();
		Thread.sleep(2000);
		ClickOnDatasetSearchFilterDataset.click();
		Thread.sleep(2000);

		ClickOnDatasetSelectFilterName.click();
		Thread.sleep(2000);

		ClickOnDatasetFilterPlaceholder.click();
		Thread.sleep(2000);
		String DatasetName = getDatasetName.getText();
		ClickOnDatasetFilterPlaceholder.sendKeys(DatasetName, Keys.ENTER);

	}

	public String VerifyFilterDatasetNames() throws InterruptedException {

		Thread.sleep(2000);

		waitForElementToBeClickable(getDatasetName);
		String actualName = getDatasetName.getText();
		return actualName;

	}

	public void ClickFilterdDatasetNamewithContains() throws InterruptedException {
		// waitForElementToBeClickable(clickOnMicroIntentFilter);
		Thread.sleep(3000);
		ClickOnDatasetFilterDataset.click();
		Thread.sleep(1000);
		clickOnDatasetEquals.click();
		Thread.sleep(1000);
		clickOnDatasetContainsOperator.click();
		Thread.sleep(1000);
		ClickOnDatasetFilterPlaceholder.clear();

		ClickOnDatasetFilterPlaceholder.sendKeys("Ris", Keys.ENTER);

	}

	public String VerifyFilterdDatasetNameContains() throws InterruptedException {
		// waitForElementToBeClickable(VerifyFilterdDatasetNameContains);
		Thread.sleep(2000);
		String ActualContains = "Risk";
		return ActualContains;
	}

	// service Tab

	public void ClickOnServiceTab() throws InterruptedException {
		waitForElementToBeClickable(clickOnServiceTab);
		clickOnServiceTab.click();
	}

	// get service name and verify in placeholder
	String Actualservice;

	public String getServiceName() throws InterruptedException {
		// waitForElementToBeClickable(clickOnServiceSearchButton);
		Actualservice = getServiceName.getText();
		Thread.sleep(3000);
		return Actualservice;
	}

	public String clickOnServiceSearchButton() throws InterruptedException {
		// waitForElementToBeClickable(clickOnServiceSearchButton);
		clickOnServicePlaceholder.click();
		Thread.sleep(1000);
		clickOnServicePlaceholder.sendKeys(Actualservice, Keys.ENTER);
		return Actualservice;

	}

	public String VerifyServiceName() throws InterruptedException {
		waitForElementToBeClickable(VerifyServiceName);
		String ExpectedService = VerifyServiceName.getText();
		return ExpectedService;

	}

	// click on advance setting

	public void ClickOnadvanceSettings() throws InterruptedException {
		// waitForElementToBeClickable(ClickonadvanceSetting);
		Thread.sleep(2000);

		ClickonadvanceSetting.click();
		Thread.sleep(2000);

		ConfigurationTypeList.click();
		Thread.sleep(2000);
		ClickOnSearchConfigurationTypeList.click();
		Thread.sleep(2000);

		ClickOnSearchConfigurationTypeList.sendKeys("Kanban", Keys.ENTER);

		Thread.sleep(2000);

		ClickOnConfigurationTypeListCancel.click();
		Thread.sleep(2000);
		ClickOnConfigurationTypeListEditAPI.click();
		Thread.sleep(2000);
		// ClickOnResponseSchema.click();
		Thread.sleep(2000);
		// ClickOnResponseSchemaEdit.click();
		Thread.sleep(2000);
		// ClickOnResponseSchemaCancel.click();
		Thread.sleep(2000);
		ClickOnEditserviceCancelButton.click();
		Thread.sleep(2000);
		ClickOnEditService.click();
		Thread.sleep(2000);
		ClickOnEditCancelService.click();
		Thread.sleep(2000);

		ClickOnCloneAPI.click();
		Thread.sleep(2000);

		// click on clickon clone API cancel
		ClickOnEditCancelService.click();

	}

//		    public void ClickScrollDown() throws InterruptedException {
//		    waitForElementToBeClickable(ScrollDown);
//		    
//		   // WebElement element = driver.findElement(By.xpath("your-element-xpath")); // Change this
//
//		    while (true) {
//		        try {
//		            if (ScrollDown.isDisplayed()) {
//		                break; // Element is now visible, stop scrolling
//		            }
//		        } catch (NoSuchElementException e ) {
//		            // Keep scrolling if element isn't found or stale
//		        	System.out.println("No such element->>"+e.getMessage());
//		        }
//		        catch(StaleElementReferenceException e) {
//		        	System.out.println("StaleElementReferenceException->>"+e.getMessage());
//		        }
//
//		        // Scroll down using PAGE_DOWN
//		        WebElement body = driver.findElement(By.xpath("//div[contains(@class, 'api-type-path') and normalize-space(text())='/rest/Applicant/deleteApplicantCorrespondingData']"));
//		        body.sendKeys(Keys.PAGE_DOWN);
//
//		        // Optionally wait a bit after each scroll
//		        
//		    
//		    }

//		    public String ClickScrollDown(String tileText) throws InterruptedException  {
//		    	String	APIname;
//		    	// ClickOnCloneAPI.click();
//		    	ClickOnCheckBox.click();
//			        Thread.sleep(2000);
//ClickOnCheckBox.click();
//
//Thread.sleep(2000);
//
//
//
//////		         //click on clickon clone API cancel	       
////		        ClickOnEditCancelService.click();
////		    	
////		    	  Actions actions = new Actions(driver);
////
////		        
////		 		        
////		          actions.sendKeys(Keys.PAGE_DOWN).perform();  // Scrolls down one page
////		          Thread.sleep(1000);  // Wait to see the scroll
////		          actions.sendKeys(Keys.ARROW_DOWN).perform();  
////		          Thread.sleep(5000);
//		          
//Actions actions = new Actions(driver);
//int scrollCount = 0;
//
//while (scrollCount < 10) {
//   //try {
//    	 String xpath = String.format("//bntv-tile-view-list-item//*[text()=' %s ']", tileText);
//    	    
//     
//        if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
//        	
//        	APIname=driver.findElement(By.xpath(xpath)).getText();
//        
//        	
//        	
//        	
//            System.out.println("Element found and visible."+APIname);
//            
//           
//            break;
//        }
//        else {
//        	actions.moveToElement(ClickOnCheckBox).perform();
//        	 actions.sendKeys(Keys.PAGE_DOWN).perform();  // Scrolls down one page
//        	    Thread.sleep(1000);  // Wait to see the scroll
//        	   actions.sendKeys(Keys.ARROW_DOWN).perform();  
//        	   Thread.sleep(5000);
//        	   scrollCount++;
//        }
////    } catch (NoSuchElementException | StaleElementReferenceException e) {
//        // element not yet in DOM or refreshed, keep scrolling
////    }
//
//  
//
////    try {
////        Thread.sleep(500); // optional: let the scroll settle
////    } catch (InterruptedException ignored) {}
////}
////
////throw new NoSuchElementException("Element not found after scrolling " + 10 + " times.");
//}
//return tileText;
//				
//					
//}			

	public String ClickScrollDown(String tileText) throws InterruptedException {
		String APIname = null;
		Thread.sleep(2000);
		ClickOnCheckBox.click();
		Thread.sleep(3000);
		ClickOnCheckBox.click();
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		int scrollCount = 0;

		while (scrollCount < 10) {
			String xpath = String.format("//bntv-tile-view-list-item//*[text()=' %s ']", tileText);

			// Check if element is present in the DOM
			List<WebElement> elements = driver.findElements(By.xpath(xpath));
			if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
				WebElement element = elements.get(0);
				APIname = element.getText();
				System.out.println("Element found and visible: " + APIname);
				break;
			} else {
				// Scroll and try again
				actions.moveToElement(ClickOnCheckBox).perform();
				actions.sendKeys(Keys.PAGE_DOWN).perform();

				// Thread.sleep(100);
				actions.sendKeys(Keys.ARROW_DOWN).perform();
				// Thread.sleep(200);
				actions.moveToElement(ClickOnCheckBox).perform();
				actions.sendKeys(Keys.PAGE_DOWN).perform();

				// Thread.sleep(100);
				actions.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(200);
				scrollCount++;
			}
		}

		if (APIname == null) {
			throw new NoSuchElementException("Element not found after scrolling 10 times.");
		}

		return APIname;
	}

	public void ClickOnServiceStatus() throws InterruptedException {
		// waitForElementToBeClickable(ClickOnServiceStatusDropdown);
		Thread.sleep(2000);
		ClickOnServiceStatusDropdown.click();

		ClickOnServiceStatusDropdown.click();

	}

	public void arbitrationButton() throws InterruptedException {
		waitForElementToBeClickable(arbitrationButton);
		arbitrationButton.click();
		Thread.sleep(4000);
		refreshButton.click();
		Thread.sleep(1000);
		arbitrationText.getText();
	}

	private List<String> arbitrationHeaderActualList;
	private List<String> arbitrationHeaderExpectedList;

	public void getArbitrationGridValidate() throws InterruptedException {
		String excelFilePath = ".//src//main//resources//Excel//AutomationGridHeaders.xlsx";
		int colNum = 0;

		arbitrationHeaderExpectedList = new ArrayList<>();
		try {
			arbitrationHeaderExpectedList = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			e.printStackTrace();
		}

		arbitrationHeaderActualList = new ArrayList<>();
		for (WebElement item : arbitrationGridHeader) {
			arbitrationHeaderActualList.add(item.getText().trim());
		}

		arbitrationHeaderActualList = arbitrationHeaderActualList.stream().map(String::trim).filter(s -> !s.isEmpty()) // Remove
																														// any
																														// empty
																														// strings
				.collect(Collectors.toList());

		arbitrationHeaderExpectedList = arbitrationHeaderExpectedList.stream().map(String::trim)
				.collect(Collectors.toList());

		System.out.println("Actual List: " + arbitrationHeaderActualList);
		System.out.println("Expected List: " + arbitrationHeaderExpectedList);
	}

	public List<String> getActualList() {
		return arbitrationHeaderActualList;
	}

	public List<String> getExpectedList() {
		return arbitrationHeaderExpectedList;
	}

	public void selectArbitrationFilter() throws InterruptedException {
		arbitrationFilterButton.click();

		waitForElementToBeClickable(selectFilter);

		selectFilter.click();
		Thread.sleep(2000);
		selectFilterType.click();
		Thread.sleep(1000);
		clickOnFilterValue.click();
		Thread.sleep(1000);
		selectFilterValue.click();
		Thread.sleep(5000);
		// clickOnApplyButton.sendKeys(Keys.ENTER);
		clickOnApplyButton.click();
		Thread.sleep(1000);
	}

	public String verifyApplyFilterType() throws InterruptedException {
		String actualText = verifyApplyFilterType.getText();
		waitForElementToBeClickable(verifyApplyFilterType);

		System.out.println("Actual text" + actualText);
		return actualText;
	}

	public void ReselectArbitrationSearchFilter() throws InterruptedException {
		arbitrationFilterButton.click();
		Thread.sleep(1000);
		clickOnEqualOperator.click();
		Thread.sleep(500);
		clickOnNotEqualOperator.click();
		Thread.sleep(500);
		clickOnApplyButton.click();
		Thread.sleep(1000);

	}

	public String verifyArbitrationNotEqualFilter() throws InterruptedException {
		String actualText = verifyArbitrationNotEqualFilter.getText();
		waitForElementToBeClickable(verifyArbitrationNotEqualFilter);

		System.out.println("Actual text" + actualText);
		return actualText;

	}

	String firstQuestion;

	public void arbitrationFirstQuestion() throws InterruptedException {
		waitForElementToBeClickable(arbitrationFirstQuestion);
		firstQuestion = arbitrationFirstQuestion.getText();
//          return firstQuestion;  
		System.out.println("Question : " + firstQuestion);

	}

	public void clickOnArbitrationSearch() throws InterruptedException {
		waitForElementToBeClickable(clickOnSearchButton);
		clickOnSearchButton.click();
		Thread.sleep(3000);
		enterValueInSearch.sendKeys(firstQuestion, Keys.ENTER);
	}

	public String verifyarbitrationSearchQuestion() {
		waitForElementToBeClickable(verifyarbitrationSearchQuestion);
		String expectedText = verifyarbitrationSearchQuestion.getText();
		return expectedText;

	}

	public void clickOnSearchQuestion() throws InterruptedException {
		verifyarbitrationSearchQuestion.click();
		Thread.sleep(2000);

	}

	public String verifyDerivedQuestion() {
		waitForElementToBeClickable(verifyarbitrationSearchQuestion);
		String actualText = verifyDerivedQuestion.getText();
		return actualText;

	}

	public void clickOnTemplateButton() throws InterruptedException {
		clickOnTemplateButton.click();
		Thread.sleep(2000);
		refreshButton.click();
	}

	private List<String> templateHeaderActualList;
	private List<String> templateHeaderExpectedList;

	public void getTemplateGridValidate() throws InterruptedException {
		String excelFilePath = ".//src//main//resources//Excel//AutomationGridHeaders.xlsx";
		int colNum = 1;

		templateHeaderExpectedList = new ArrayList<>();
		try {
			templateHeaderExpectedList = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			e.printStackTrace();
		}

		templateHeaderActualList = new ArrayList<>();
		for (WebElement item : templateGridHeader) {
			templateHeaderActualList.add(item.getText().trim());
		}

		templateHeaderActualList = templateHeaderActualList.stream().map(String::trim).filter(s -> !s.isEmpty()) // Remove
																													// any
																													// empty
																													// strings
				.collect(Collectors.toList());

		templateHeaderExpectedList = templateHeaderExpectedList.stream().map(String::trim).collect(Collectors.toList());

		System.out.println("Actual List: " + templateHeaderActualList);
		System.out.println("Expected List: " + templateHeaderExpectedList);
	}

	public List<String> getActualTemplateList() {
		return templateHeaderActualList;
	}

	public List<String> getExpectedTemplateList() {
		return templateHeaderExpectedList;
	}

	String actualTemplate;

	public String firstTemplate() {
		waitForElementToBeClickable(firstTemplate);
		actualTemplate = firstTemplate.getText();
		return actualTemplate;
	}

	public void enterValuesInSearch() throws InterruptedException {
		waitForElementToBeClickable(clickOnSearchButton);
		clickOnSearchButton.click();
		Thread.sleep(1000);
		enterValueInSearch.sendKeys(actualTemplate, Keys.ENTER);
	}

	public String verifyaTemplateSearch() throws InterruptedException {
		waitForElementToBeClickable(verifyaTemplateSearch);
		String expectedText = verifyaTemplateSearch.getText();
		Thread.sleep(2000);
		enterValueInSearch.sendKeys(Keys.COMMAND + "a"); // Select all text
		enterValueInSearch.sendKeys(Keys.DELETE); // delete text
		Thread.sleep(2000);

		return expectedText;

	}

	public String templateFilter() throws InterruptedException {
		waitForElementToBeClickable(selectTemplateFilter);
		selectTemplateFilter.click();
		Thread.sleep(1000);
		selectFilter.click();
		Thread.sleep(2000);
		selectTemplateTitle.click();
		Thread.sleep(1000);
		clickOnTemplateFilterValue.click();
		Thread.sleep(2000);
		String templateText = firstTemplate();
		clickOnTemplateFilterValue.sendKeys(templateText, Keys.ENTER);
		Thread.sleep(5000);
		return templateText;

	}

	public void CreateTemplate() throws InterruptedException {
		waitForElementToBeClickable(ClickOnAddTemplate);
		ClickOnAddTemplate.click();

	}

}
