package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableAbstractComponent.AbstractComponent;

public class LoginPageObject extends AbstractComponent{

	// local variable
	WebDriver driver;
	// Constructor
	public LoginPageObject(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Find WebElements of Login page.
	@FindBy(id="email") WebElement email;
	@FindBy(name="pass") WebElement pass;
	@FindBy(name="login") WebElement lg_button;
	

	//Action Method for operations
	public void openLoginPage() {
		driver.get("https://www.facebook.com");
		max();
	}

	// Action Method for operations
	public void doLogin() {
		email.sendKeys("xyz@gmail.com");
		pass.sendKeys("1234");
		lg_button.click();
	}

	// Action Method for operations... Pass parameter username & password.
	public void launchedAndLogin(String username,String password) {
		driver.get("https://www.facebook.com");
		max();
		email.sendKeys(username);
		pass.sendKeys(password);
		lg_button.click();
		close();
	}










}
