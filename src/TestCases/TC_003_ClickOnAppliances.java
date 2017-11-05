package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.Common;
import Pages.Appliances;

public class TC_003_ClickOnAppliances extends Common

{
	@BeforeTest
	public static void openbrowser() 
	{
		Common.OpenBrowsers();
		Common.geturl();
	}
	
	@Test
	public static void ClickOnAppliances() 
	{
		Appliances.ClickOnAppliances();
	}
	public static void ClickOnTelevisions() 
	{
		Appliances.ClickOnTelevisions().click();
	}
}
