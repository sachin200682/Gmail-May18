package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Driver;

public class Home extends Driver 
{
	public static WebElement clickonhomepage() 
	{
		return driver.findElement(By.xpath("//div[@data-reactid='33']"));
	}
	
	
}
