package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v136.page.model.Screenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObject.LoginPageObject;
import utilities.ScreenshotUtility;

public class BasicTestComponent {
	WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		Properties pr=new Properties();
		FileInputStream fis=new FileInputStream("E:\\InfoEge Automation Project\\frame_Introduction_ArtifactId\\src\\main\\java\\resource\\globalData.properties");
		pr.load(fis);
		String browser_Name = pr.getProperty("browser");
		if(browser_Name.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			
		}
		return driver;
	}
		
		
		public void loginTestPossitive() throws IOException {
			driver=initializeDriver();
			LoginPageObject lpo=new LoginPageObject(driver);
			lpo.launchedAndLogin("Suraj", "1234");
			
		}
		
		
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	


