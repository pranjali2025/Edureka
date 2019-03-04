package co.edureka.pompages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.edureka.generics.BasePage;

public class SearchCourse extends BasePage {

	public SearchCourse(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

//*******************************************************************************************************************
//  Declare	WebElements
//*******************************************************************************************************************

//SearchBox	
	@FindBy(id="search-inp")
	private WebElement searchBox;
	

//* *****************************************************************************************************************
//	                                                            Declare	Methods
//*******************************************************************************************************************	

//SearchBox 
	
	public void enterSearchBox(String searchvalue) {
		try {
			verifyElementPresent(searchBox);
			searchBox.sendKeys(searchvalue);
			searchBox.sendKeys(Keys.ENTER);
			Thread.sleep(500);
			log.info("Value Entered in searchbox");
		} catch (Exception e) {
			log.error("Value not Entered in SearchBox");
		}
	}
		
	
	
}
