package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMobileBrands {
	
	// Hover over Mobile and accessories
	
	Actions a ;
	
@FindBy(linkText = "Mobiles & Accessories")
private WebElement mobilesandAccessories;

@FindBy(linkText = "Apple")
private WebElement apple;

public AllMobileBrands(WebDriver driver) {
	PageFactory.initElements(driver, this);
	a = new Actions(driver);
}

public void HoverOvermobilesandAccessories()
{
	
	a.moveToElement(mobilesandAccessories).build().perform();
	
	
}

public void ClickonApple()
{
	apple.click();
}


}
