package co.edureka.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.edureka.generics.BasePage;

public class AddCourse extends BasePage {

	public AddCourse(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}


//*******************************************************************************************************************
//  Declare	WebElements
//*******************************************************************************************************************

	//enroll	
		@FindBy(xpath="//button[text()='ENROLL NOW PAY LATER']")
		private WebElement enroll;
		
		@FindBy(xpath="//div[@class='card giTrackElement giTrackElementHover']")
		private WebElement courseDetails;
		

//*******************************************************************************************************************
//		                                                            Declare	Methods
//*******************************************************************************************************************	

//enroll 
		
		public void clickEnroll() {
			try {
				verifyElementPresent(enroll);
				enroll.click();
				Thread.sleep(500);
				log.info("Enroll clicked");
			} catch (Exception e) {
				log.error("Enroll not clicked");
			}
		}
			
		//CourseDetails 
		
				public void clickCourseDetails() {
					try {
						verifyElementPresent(courseDetails);
						courseDetails.click();
						Thread.sleep(1000);
						log.info("Course clicked");
					} catch (Exception e) {
						log.error("Course not clicked");
					}
				}
							
		
	}
	
