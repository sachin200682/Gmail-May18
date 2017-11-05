package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

import Common.Driver;
import net.bytebuddy.asm.Advice.Return;

public class Electronics extends Driver 
{
	
	public static WebElement clickOnElectronics1()
	{
		WebElement element = driver.findElement(By.xpath("WebElement"));
		
		Actions action = new Actions(driver);
    
		action.moveToElement((WebElement) element).build().perform();
		
		return element;
	}
	public static WebElement clickOnElectronics() 
	{
		return driver.findElement(By.xpath("WebElement"));
	}
	public static WebElement ClickOnMobile() 
	{
		return driver.findElement(By.xpath("//li=[@class='Wbt_B2']"));
	}
	public static WebElement ClickOnSamsung() 
	{
		return driver.findElement(By.xpath("//a[@title='Samsung']"));
	}
	public static WebElement ClickOnLenovo() 
	{
		return driver.findElement(By.xpath("//a[@title='Lenovo']"));		
	}
	public static WebElement ClickOnMi() 
	{
		return driver.findElement(By.xpath("//a[@title='Mi']"));
	}
	public static WebElement ClickOnMotorola() 
	{
		return driver.findElement(By.xpath("Motorola']"));
	}
	public static WebElement ClickOnOppo() 
	{
		return driver.findElement(By.xpath("OPPO']"));
	}
	public static WebElement ClickOnApple() 
	{
		return driver.findElement(By.xpath("Apple']"));
	}
	public static WebElement ClickOnVivo() 
	{
		return driver.findElement(By.xpath("Vivo']"));
	}
	public static WebElement ClickOnHonor() 
	{
		return driver.findElement(By.xpath("Honor']"));
	}
	public static WebElement ClickOnFKExclusiveMobiles() 
	{
		return driver.findElement(By.xpath("FK Exclusive Mobiles']"));
	}
	public static WebElement ClickOnNewAndPopularModels() 
	{
		return driver.findElement(By.xpath("New and Popular Models']"));
	}
	public static WebElement ClickOnMiMIX2() 
	{
		return driver.findElement(By.xpath("//a[@title='Mi MIX 2']']"));
	}
	public static WebElement ClickOnGooglePixel2() 
	{
		return driver.findElement(By.xpath("Google Pixel 2']']"));
	}
	public static WebElement ClickOnHonor9i() 
	{
		return driver.findElement(By.xpath("Honor 9i"));
	}
}
