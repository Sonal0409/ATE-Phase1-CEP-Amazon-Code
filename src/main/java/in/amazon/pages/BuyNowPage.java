package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNowPage {
	
	@FindBy(id = "buy-now-button")
	private WebElement buynowbutton;
	
	public BuyNowPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
		public void ClickOnBuyNowButton()
		{
			buynowbutton.click();
		}
	

}
