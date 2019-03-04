package co.edureka.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.edureka.generics.BasePage;

public class CheckOut extends BasePage {

	public CheckOut(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

//*******************************************************************************************************************
//  Declare	WebElements
//*******************************************************************************************************************

//SelectBatch	
	@FindBy(xpath="//label[@data-batch-id='12117']")
	private WebElement selectBatch;

//SelectEnrollNow
	@FindBy(xpath = "(//button[text()='PROCEED TO PAYMENT'])[1]")
	private WebElement enrollNow;

//SelectPayMethod

	@FindBy(xpath = "//img[@alt='visa']")
	private WebElement selectPayMethod;
	
	
	@FindBy(xpath = "//iframe[@class='zoid-component-frame zoid-visible']")
	private WebElement payIframe;
	

//*******************************************************************************************************************
//			                                                            Declare	Methods
//*******************************************************************************************************************	

//Select Batch 

	public void clickselectBatch() {
		try {
			verifyElementPresent(selectBatch);
			selectBatch.click();
			Thread.sleep(2000);
			log.info("Select Batch clicked");
		} catch (Exception e) {
			log.error("Select Batch not clicked");
		}
	}

//SelectPayMethod 

	public void clickPayMethod() {
		try {
			verifyElementPresent(selectPayMethod);
			selectPayMethod.click();
			Thread.sleep(1000);
			log.info("PAy mehtod clicked");
		} catch (Exception e) {
			log.error("PAy MEthod not clicked");
		}
	}

//SelectEnrollnow

	public void clickEnrollNow() {
		try {
			verifyElementPresent(enrollNow);
			enrollNow.click();
			Thread.sleep(1000);
			log.info("Enroll clicked");
		} catch (Exception e) {
			log.error("Enroll not clicked");
		}
	}
	
	//switch to pay iframe
	public void swithcToPayIframe() {
		try {
			verifyElementPresent(payIframe);
			driver.switchTo().frame(payIframe);
			Thread.sleep(1000);
			log.info("Pay Iframe Switched");
		} catch (Exception e) {
			log.error("Pay Iframe Switch");
		}
	}
	
}
