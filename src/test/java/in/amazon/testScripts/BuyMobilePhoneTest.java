package in.amazon.testScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhonePage;
import in.amazon.pages.BuyNowPage;
import in.amazon.pages.LandingPage;

public class BuyMobilePhoneTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
	}
	
	@Test
	public void buyMobile() throws InterruptedException
	{
		//Click on Mobiles in navigation bar
		 
		LandingPage lp = new LandingPage(driver);
		lp.ClickMobiles();
		
		//Hover over the pointer Mobiels and Accessories
		
		AllMobileBrands am = new AllMobileBrands(driver);
		am.HoverOvermobilesandAccessories();
		Thread.sleep(2000);
		// Click on Apple in the sub menu
		
		am.ClickonApple();
		
		Thread.sleep(2000);
		
		//Click on first available phone
		
		ApplePhonePage ap = new ApplePhonePage(driver);
		ap.ClickOnfirstMobile();
		
		// Switch focus on new tab
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		// Click on buy now button
		
		BuyNowPage bp = new BuyNowPage(driver);
		bp.ClickOnBuyNowButton();
		
		/*
		
		
		
		
		Verify user sees the text Signin on the last page*/
		
	}
	

	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}

}
