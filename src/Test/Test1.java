package Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Main.Base;
import Main.Homepage;
import Main.Homepage_Tripadvisor;
import Main.Loginpage;

public class Test1 extends Base{
	

	
  @Test
  public void amazon_flipkart() throws InterruptedException  {
	  
	  driver=initalize_amazon();	
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  Homepage h=new Homepage(driver);
	  h.amaz_search().click();
	  h.amaz_search().sendKeys("iPhone XR (64GB) - Yellow");
	  h.amaz_search_click().click();
	  h.amaz_select_iphone().click();
	 String str1= h.amaz_price().getText();
	 driver=initalize_flipkart();
	 h.flip_search().click();
	  h.flip_search_click().sendKeys("iPhone XR (64GB) - Yellow");
	  h.flip_search_click().click();
	  h.flip_select_iphone().click();
	 String str2= h.flip_price().getText();
	 if (str1 > str2)
	 {
		 System.out.println("price of iphone"+str2);
	 }
	 
  }
	 @Test
	  public void tripadvisor() throws InterruptedException  {
	  driver=initialize_tripadvisor();
	  Homepage_Tripadvisor ht =new Homepage_Tripadvisor(driver);
	  ht.trip_search().click();
	  ht.trip_main_search().sendKeys("Club Mahindra");
	  Select s= new Select(driver.findElement(By.className("first-row")));
	  s.selectByVisibleText("Club Mahindra Madikeri, Coorg");
	  ht.write_review().click();
	  Set<String> s1= driver.getWindowHandles();
	  Iterator<String> it=s1.iterator();
	  while(it.hasNext())
	  {
		  String childwindow=it.next();
		  driver.switchTo().window(childwindow);
		  ht.over_all_rating().click();
		  ht.Title_of_review().sendKeys("visit summary");
		  ht.your_review().sendKeys("good");
		  ht.Hotel_rating().click();
		  ht.submit_checkbox().click();
		  driver.close();
	  }
	  
	  
	  
	 }
	 
  
  
  
  
  
}

