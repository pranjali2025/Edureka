package co.edureka.generics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITest implements ITestListener {

	public Logger log = Logger.getLogger(ITest.class);

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver);
		try {
			File src = event.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/" + name + ".png"));
			log.info("Screenshot captured");
		} catch (Exception e) {
			log.error("Screenot not Captured");
		}

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}