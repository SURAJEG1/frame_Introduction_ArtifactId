package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableAbstractComponent.AbstractComponent;

public class LoginPageObject extends AbstractComponent{

	WebDriver driver; // local variable 
	public LoginPageObject(WebDriver driver) // Constructor
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email") WebElement email;
	@FindBy(name="pass") WebElement pass;
	@FindBy(name="login") WebElement lg_button;
	
	
	public void openLoginPage()     // Method
	{
		
	driver.get("https://www.facebook.com");
	max();
	}

	public void doLogin()          // Method
	{
		
		email.sendKeys("xyz@gmail.com");
		pass.sendKeys("1234");
		lg_button.click();
	}

	public void launchedAndLogin(String username,String password)  //Method... Pass parameter username & password.
	{
		driver.get("https://www.facebook.com");
		email.sendKeys(username);
		pass.sendKeys(password);
		lg_button.click();
		close();
	}



	
	
	
	
	


}
