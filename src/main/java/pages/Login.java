package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.SeleniumAction;
import utils.GetQuestionsFromExcel;

public class Login extends SeleniumAction {

	protected WebDriver driver;
	WebDriverWait wait;

	public Login(WebDriver driver) {
		super(driver); // Explicitly call the parent class constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize PageFactory
	}

	@FindBy(xpath = "//div[contains(@data-placeholder, 'Ask x101 anything to power your day') and contains(@class, 'ql-editor') and @contenteditable='true']")
	WebElement enterText;

	@FindBy(xpath = "//img[contains(@src, 'send-tilt') and contains(@src, '.svg')]")
	WebElement clickOnSendIcon;

	String path = ".\\src\\main\\resources\\ExcelReader\\X101_Questions.xlsx";
	int sheetIndex = 0; // First sheet

	List<String> questions = GetQuestionsFromExcel.getQuestionsFromExcel(path, sheetIndex);

	public void enterQuestion() throws InterruptedException {
//		for (String question : questions) {
//			waitForElementToBeClickable(enterText);
//			enterText.clear(); // Clear previous text
//			enterText.sendKeys(question);
//			waitForElementToBeClickable(clickOnSendIcon);
//			clickOnSendIcon.click();
//
//			// Validate responses are not empty/null/blank
//			List<WebElement> responses = driver.findElements(By.xpath("//div[@class='response ng-star-inserted']"));
//			boolean hasValidResponse = false;
//
//			for (WebElement response : responses) {
//				String text = response.getText();
//				if (text != null && !text.trim().isEmpty()) {
//					System.out.println("Valid response: " + text.trim());
//					hasValidResponse = true;
//				}
//			}
//
//			if (!hasValidResponse) {
//				System.out.println("-----------⚠-------------No valid response found for question: " + question);
//			}
//		}
		
		for (String question : questions) {
	        waitForElementToBeClickable(enterText);
	        enterText.clear(); // Clear previous text
	        enterText.sendKeys(question);
	        waitForElementToBeClickable(clickOnSendIcon);
	        clickOnSendIcon.click();

	        // Wait to allow response to load (use explicit wait in real scenario)
	        Thread.sleep(5000);

	        // Collect all responses
	        List<WebElement> responses = driver.findElements(By.xpath("//div[@class='response ng-star-inserted']"));

	        boolean isErrorResponse = false;
	        boolean hasValidResponse = false;

	        for (WebElement response : responses) {
	            String text = response.getText().trim();
	            if (!text.isEmpty()) {
	                System.out.println("Response: " + text);
	                
	                // Check for error messages
	                if (text.contains("Entity not found") ||
	                    text.contains("It seems the underlying LLM is having issues") ||
	                    text.contains("No micro intent found") ||
	                    text.contains("An error occurred while processing your request. Please try to contact the administrator") ||
	                    text.contains("The requested document could not be found") ||
	                    text.contains("An error occurred while processing your request. Please try to contact the administrator") ||
	                    text.contains("The requested entity could not be found") ||
	                    text.contains("No matching micro intent was found for your request") ||
	                    text.contains("Your request violates system guidelines and cannot be processed") ||
	                    text.contains("The requested API could not be found")) {

	                    isErrorResponse = true;
	                    break; // No need to continue checking
	                } else {
	                    hasValidResponse = true;
	                }
	            }
	        }

	        // Final check
	        if (isErrorResponse) {
	        	throw new RuntimeException("Failed: Error response found for question: " + question);
	        } else if (!hasValidResponse) {
	            System.out.println("⚠ Warning: No valid or error response found for question - " + question);
	        } else {
	            System.out.println("✅ Success: Valid response received for question - " + question);
	        }
	    }
		
	}
	
	@FindBy(xpath = "//div[@class='response ng-star-inserted']")
	List<WebElement> getAllMethodText;
	
	public void getAllText() {
		for(WebElement text : getAllMethodText) {
			String text2 = text.getText();
			String tagName = text.getTagName();
			System.out.println("class text : " + text2);
			System.out.println("tagName : " + tagName);
		}
	}

}
