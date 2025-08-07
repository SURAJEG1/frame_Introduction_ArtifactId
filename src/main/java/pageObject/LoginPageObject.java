package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	WebDriver driver; // variable 
	public LoginPageObject(WebDriver driver) // Constructor
	{
		this.driver=driver;
	}

	public void openLoginPage()     // Method
	{
		driver.get("https://www.facebook.com");
	}

	public void doLogin()          // Method
	{
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		email.sendKeys("xyz@gmail.com");
		pass.sendKeys("1234");
		login.click();
	}

	public void launchedAndLogin(String username,String password)  //Method... Pass parameter username & password.
	{
		driver.get("https://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		email.sendKeys(username);
		pass.sendKeys(password);
		login.click();
	}



	
	
	
	
	


}
