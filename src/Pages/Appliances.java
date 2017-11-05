package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Appliances extends Common.Driver 
{
	public static WebElement ClickOnAppliances() 
	{
		return driver.findElement(By.xpath("//a[@title='Appliances'"));
	}
	public static WebElement ClickOnTelevisions() 
	{
		return driver.findElement(By.xpath("//a[@title='Televisions'"));
	}
	
}
