package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPageObject;
import utilities.ScreenshotUtility;

public class LoginTest extends BasicTestComponent{

	@Test
	public void tc001() throws IOException {

		loginTestPossitive();

		ScreenshotUtility screenshot=new ScreenshotUtility(driver);
		screenshot.takeScreenshot(driver);



	}











}
