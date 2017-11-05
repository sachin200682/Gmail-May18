package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Common.Common;
import Pages.Electronics;

public class TC_002_ClickOnElectronics extends Common 

{

	@Test
	public static void OpenBrowsers()
	{
		Common.OpenBrowsers();
	
		Common.geturl();
	}
	public static void ClickOnElectronis() 
	{
		Electronics.clickOnElectronics1();
	}
	public static void ClickOnMobile() 
	{
		Electronics.ClickOnMobile();
	}
	public static void ClickOnSamsung() 
	{
		Electronics.ClickOnSamsung();
	}
	public static void ClickOnLenovo() 
	{
		Electronics.ClickOnLenovo();		
	}
	public static void ClickOnMi() 
	{
		Electronics.ClickOnMi();
	}
	public static void ClickOnMotorola() 
	{
		Electronics.ClickOnMotorola();		
	}
	public static void ClickOnApple() 
	{
		Electronics.ClickOnApple();		
	}
	public static void ClickOnVivo() 
	{
		Electronics.ClickOnVivo();		
	}
	public static void ClickOnHonor() 
	{
		Electronics.ClickOnHonor();		
	}
	public static void ClickOnFKExclusiveMobiles() 
	{
		Electronics.ClickOnFKExclusiveMobiles();		
	}
	public static void ClickOnNewAndPopularModels() 
	{
		Electronics.ClickOnNewAndPopularModels();		
	}
	public static void ClickOnMiMIX2() 
	{
		Electronics.ClickOnMiMIX2();		
	}
	public static void ClickOnGooglePixel2() 
	{
		Electronics.ClickOnGooglePixel2();		
	}
	public static void ClickOnHonor9i() 
	{
		Electronics.ClickOnHonor9i();	
	}
	
}	