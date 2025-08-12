package reusableAbstractComponent;

import org.openqa.selenium.WebDriver;

public class AbstractComponent {

	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
	}


	public void max() {
		driver.manage().window().maximize();

	}


	public void close() {
		driver.close();
	}


	public void min() {
		driver.manage().window().minimize();
	}


}
