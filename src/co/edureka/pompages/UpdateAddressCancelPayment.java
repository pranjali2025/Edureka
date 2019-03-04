package co.edureka.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.edureka.generics.BasePage;

public class UpdateAddressCancelPayment extends BasePage {

	public UpdateAddressCancelPayment(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		}

//*******************************************************************************************************************
//  Declare	WebElements
//*******************************************************************************************************************

//Add1	
		@FindBy(id="billingLine1")
		private WebElement add1;
		
//Add2
		
		@FindBy(id="billingLine2")
			private WebElement add2;
		
//Add3
		@FindBy(id="billingCity")
		private WebElement add3;
		
//*******************************************************************************************************************
//			                                                            Declare	Methods
//*******************************************************************************************************************	

//Add1 
		

			public void enterAdd1(String add1value) {
				try {
					Thread.sleep(3000);
					verifyElementPresent(add1);
					add1.sendKeys(add1value);
					Thread.sleep(100);
					log.info("Add Line 1 Enter");
				} catch (Exception e) {
					log.error("Add Line 1 not entered");
				}
			}

//Add2
			
			public void enterAdd2(String add2value) {
				try {
					verifyElementPresent(add2);
					add2.sendKeys(add2value);
					Thread.sleep(1000);
					log.info("Add Line 2 Enter");
				} catch (Exception e) {
					log.error("Add Line 2 not entered");
				}
			}
			
//Add3
			
			public void enterAdd3(String add3value) {
				try {
					verifyElementPresent(add3);
					add3.sendKeys(add3value);
					Thread.sleep(1000);
					log.info("Add Line 3 Enter");
				} catch (Exception e) {
					log.error("Add Line 3 not entered");
				}
			}
			

}
