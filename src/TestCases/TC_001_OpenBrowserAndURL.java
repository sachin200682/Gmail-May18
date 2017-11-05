package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Common.Common;

public class TC_001_OpenBrowserAndURL
{
	@Test
	
	public static void openbrowser() 
	{
		Common.OpenBrowsers();
		Common.geturl();
	}
	
	@AfterTest
	
	public static void closebrowser() throws Exception 
	{
		Thread.sleep(5000);
		Common.closebrowser();
	}
}
