package co.edureka.testscripts;

import org.testng.annotations.Test;

import co.edureka.generics.BaseTest;
import co.edureka.pompages.AddCourse;
import co.edureka.pompages.CheckOut;
import co.edureka.pompages.LoginPage;
import co.edureka.pompages.SearchCourse;
import co.edureka.pompages.UpdateAddressCancelPayment;

public class OrderCourse extends BaseTest {

	LoginPage loginPage = null;
	SearchCourse searchCourse = null;
	AddCourse addCourse = null;
	CheckOut checkout = null;
	UpdateAddressCancelPayment updateAddressCancelPayment = null;
	

	@Test(dataProvider="getData")
	public void TC01_Order_Course(String userid, String password) 
	{
		loginPage = new LoginPage(driver);
		searchCourse = new SearchCourse(driver);;
		addCourse = new AddCourse(driver);
		checkout = new CheckOut(driver);
		updateAddressCancelPayment = new UpdateAddressCancelPayment(driver);
		
		try {
			
			loginPage.clickLogin();
			loginPage.enterEmail(userid);
			loginPage.enterPasswd(password);
			loginPage.clickLoginButton();
			loginPage.verifyTitle("Instructor");
			
			searchCourse.enterSearchBox("Robotic Process Automation Training using UiPath");
			

			addCourse.clickCourseDetails();
			addCourse.clickEnroll();
			
			checkout.verifyUrl("payment");
			checkout.clickselectBatch();
			checkout.clickEnrollNow();
			checkout.verifyUrl("payment");
			checkout.swithcToPayIframe();
			checkout.clickPayMethod();	
			checkout.switchBrowser("paypal");
			checkout.verifyUrl("paypal");
			
			updateAddressCancelPayment.enterAdd1("abcd1"); 
			updateAddressCancelPayment.enterAdd2("xyz");
			updateAddressCancelPayment.enterAdd3("city");
			driver.close();
			log.info("TC01 Passed");
		} catch (Exception e) {
			log.error("TC01 Failed");
			
		}
		

}
}