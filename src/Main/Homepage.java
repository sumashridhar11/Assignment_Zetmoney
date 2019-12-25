package Main;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By ele1= By.xpath("//div[@class='nav-search-field ']");
	By ele2=By.xpath("//input[@class='nav-input']");
	By ele3=By.xpath("//*[text() = 'Apple iPhone XR (64GB) - Yellow ']");
	By ele4=By.id("priceblock_ourprice");
	By ele5=By.className("LM6RPg");
	By ele6=By.className("vh79eN");
    By ele7=By.xpath("//*[text() = 'Apple iPhone XR (64GB) - Yellow ']");
    By ele8=By.xpath("//*[text()='51900']");
    
	

 public WebElement amaz_search()
 {
	WebElement e1=driver.findElement(ele1);
	return e1;
}
 
 public WebElement  amaz_search_click()
 {
	 WebElement e2=driver.findElement(ele2);
	  return e2;
	 
 }
 
 public WebElement amaz_select_iphone()
 {
	 WebElement e3=driver.findElement(ele3);
	 return e3;
 }
 
 
 public WebElement amaz_price()
 {
	 WebElement e4=driver.findElement(ele4);
	 return e4;
 }
 
 public WebElement flip_search()
 {
	WebElement e5=driver.findElement(ele5);
	return e5;
}
 
 public WebElement  flip_search_click()
 {
	 WebElement e6=driver.findElement(ele6);
	  return e6;
	 
 }
 
 public WebElement flip_select_iphone()
 {
	 WebElement e7=driver.findElement(ele7);
	 return e7;
 }
 
 
 public WebElement flip_price()
 {
	 WebElement e8=driver.findElement(ele8);
	 return e8;
 }
 
 
 
}




