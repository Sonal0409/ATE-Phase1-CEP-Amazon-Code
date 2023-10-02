package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhonePage {
	
	@FindBy(xpath = "(//div[@class='sg-col-inner'])[6]/descendant::span[9]")
	private WebElement firstMobile;
	
	public ApplePhonePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnfirstMobile()
	{
		firstMobile.click();
	}

}
