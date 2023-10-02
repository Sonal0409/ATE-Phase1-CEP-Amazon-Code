package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	// write locators of the landing page elements
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickMobiles()
	{
		mobiles.click();
	}
}
