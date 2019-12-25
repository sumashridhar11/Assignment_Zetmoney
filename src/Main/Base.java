package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public WebDriver initalize_amazon()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tenjin\\client\\browser_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		return driver;
	}	
	
	public WebDriver initalize_flipkart()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tenjin\\client\\browser_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		return driver;
	}	
	
		
	public WebDriver initialize_tripadvisor()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tenjin\\client\\browser_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		return driver;
	}	
	
	public void logout()
	{
		driver.findElement(By.name("ProfileImage_header")).click();
		driver.findElement(By.xpath("//div[@class='setuplink']/div[2]")).click();
		driver.close();
	}
 

}
