package Common;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Appliances;
import Pages.Electronics;
import Pages.Home;

public class Common extends Driver 
{
	public static void OpenBrowsers() 
	{
		String driverpath = "F:\\SELENIUM\\drivers\\chromedriver.exe";
		String browser = "webdriver.chrome.driver";
		System.setProperty(browser, driverpath);
		driver = new ChromeDriver();
	}
	
	public static void geturl() 
	{
		String url = "https://www.flipkart.com/";	
		driver.get(url);
		driver.manage().window().maximize();
	}	
	
	public static void closebrowser() 
	{
		driver.close();
	}
	
	public static void clickonhomepage() 
	{
		Home.clickonhomepage().click();
	}
	
	public static void ClickOnElectronics() 
	{
		Electronics.clickOnElectronics();
	}
	
	public static void ClickOnMobile() 
	{
		Electronics.ClickOnMobile().click();
	}
	public static void ClickOnSamsung() 
	{
		Electronics.ClickOnSamsung().click();
	}
	public static void ClickOnLenovo() 
	{
		Electronics.ClickOnLenovo().click();
	}
	public static void ClickOnMi() 
	{
		Electronics.ClickOnMi().click();
	}
	public static void ClickOnMotorola() 
	{
		Electronics.ClickOnMotorola().click();
	}
	public static void ClickOnOppo() 
	{
		Electronics.ClickOnOppo().click();
	}
	public static void ClickOnApple() 
	{
		Electronics.ClickOnApple().click();
	}
	public static void ClickOnVivo() 
	{
		Electronics.ClickOnVivo().click();
	}
	public static void ClickOnHonor() 
	{
		Electronics.ClickOnHonor().click();
	}
	public static void ClickOnFKExclusiveMobiles() 
	{
		Electronics.ClickOnFKExclusiveMobiles().click();
	}
	public static void ClickOnNewAndPopularModels() 
	{
		Electronics.ClickOnNewAndPopularModels() .click();
	}
	public static void ClickOnMiMIX2() 
	{
		Electronics.ClickOnMiMIX2().click();
	}
	public static void ClickOnGooglePixel2() 
	{
		Electronics.ClickOnMiMIX2().click();
	}
	public static void ClickOnClickOnHonor9i() 
	{
		Electronics.ClickOnHonor9i().click();
	}
	public static void ClickOnAppliances() 
	{
		Appliances.ClickOnAppliances().click();
	}
	public static void ClickOnTelevisions() 
	{
		Appliances.ClickOnTelevisions().click();
	}
	
	
	
	
}
	

