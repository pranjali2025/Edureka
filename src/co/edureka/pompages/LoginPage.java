	package co.edureka.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.edureka.generics.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

//* ******************************************************************************************************************
//                                                                                Declare	WebElements
//*******************************************************************************************************************
	
	
//Login Button 
	@FindBy(xpath = ("//a[@class='signin top-signin giTrackElementHeader hidden-xs']"))
	private WebElement login;

//Email TextBox  
	@FindBy(xpath = ("//input[@id='si_popup_email']"))
	private WebElement email;
	
//Password TextBox  	
	@FindBy(xpath = ("//input[@id='si_popup_passwd']"))
	private WebElement passwd;

//Login click 	
	@FindBy(xpath = ("//button[@class='clik_btn_log btn-block pagesense_en_track']"))
	private WebElement loginButton;

//* ***************************** ************************************************************************************
//                                                            Declare	Methods
//*******************************************************************************************************************
	
//Login Button 
	public void clickLogin() {
		try {
			verifyElementPresent(login);
			login.click();
			Thread.sleep(1000);
			log.info("Login Button Clicked");
		} catch (Exception e) {
			log.error("Login Button not Clickable");
		}
	}
	
//Email TextBox  
	public void enterEmail(String emailid) {
		try {
			verifyElementPresent(email);
			email.sendKeys(emailid);
			log.info("Email Entered");
			Thread.sleep(500);
		} catch (Exception e) {
			log.error("Not able to enter Email");
		}
	}
	
//Password TextBox  	
	public void enterPasswd(String passwordvalue) {
		try {
			verifyElementPresent(passwd);
			passwd.sendKeys(passwordvalue);
			log.info("Password Entered");
		} catch (Exception e) {
			log.error("Not able to enter Password");
		}
	}

//Login click 	
	public void clickLoginButton() {
		try {
			verifyElementPresent(loginButton);
			loginButton.click();
			Thread.sleep(1000);
			log.info("Login Button Clicked");
		} catch (Exception e) {
			log.error("Not able to click login button");
		}
	}
	
}
