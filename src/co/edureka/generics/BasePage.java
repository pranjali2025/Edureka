package co.edureka.generics;


import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	public WebDriver driver = null;
	public Logger log = Logger.getLogger(BasePage.class);

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyTitle(String exp_title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String act_title = null;
		try {
			wait.until(ExpectedConditions.titleIs(exp_title));
			act_title = driver.getTitle();
			//Assert.assertEquals(act_title, exp_title);
			log.info(act_title + " and " + exp_title + " matched.");
		} catch (Exception e) {
			log.error(act_title + " and " + exp_title + " are not matched.");
		}
	}

	public void verifyUrl(String exp_url){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String act_url = null;
		try {
			wait.until(ExpectedConditions.urlContains(exp_url));
			act_url = driver.getCurrentUrl();
			log.info("URL check ==>>"+act_url + " and " + exp_url + " matched.");
		} catch (Exception e) {
			log.error("URL check ==>>"+act_url + " and " + exp_url + " are not matched.");
		}
	}	
	public void verifyElementPresent(WebElement Ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOf(Ele));
			log.info("Element Found " + Ele);
		} catch (Exception e) {
			log.error("Element Not found" + Ele);
		}
	}

	public void switchBrowser(String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			String oldTab = driver.getWindowHandle();
			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			newTab.remove(oldTab);
			driver.switchTo().window(newTab.get(0));
			wait.until(ExpectedConditions.urlContains(urlValue));
			log.info("Browser Switch Successful");

		} catch (Exception e) {
			log.error("Switch Browser failed");
		}

	}

}
