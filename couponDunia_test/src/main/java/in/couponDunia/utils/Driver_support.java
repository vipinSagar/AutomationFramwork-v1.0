package in.couponDunia.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_support {
	
	public static WebDriver driver ;
	
	
	public static void initilalse_browser(String url)
	{
		String path ="D:\\AF\\myFolder\\couponDunia_test\\Lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(url);
	}

	// find the path using xpath
	public WebElement findBy_xpath(String path)
	{
		try
		{
		return driver.findElement(By.xpath(path));
		}
		catch(Exception e)
		{
			System.out.println(path +" element path not found!");
		return null;	
		}
	}
	
	// find the path using id 
	public WebElement findBy_id(String path)
	{
		try
		{
		return driver.findElement(By.id(path));
		}
		catch(Exception e)
		{
			System.out.println("element not found!");
		return null;	
		}
	}
	// element finder 
	public WebElement findBy(String locator,String path)
	{
		if(locator == null)
		{
			System.out.println("locator reqired !");
			return null;
		}
		else if (locator == "id") return driver.findElement(By.id(path));
		else if (locator == "xpath") return driver.findElement(By.xpath(path));
		else 
		{
			System.out.println("locator not yet added.");
			return null;
		}
		
	}
	
}
