package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import antlr.collections.List;

public class Homepage_Tripadvisor {
	
public WebDriver driver;
	
	public Homepage_Tripadvisor (WebDriver driver)
	{
		this.driver=driver;
	}
	
   By ele1= By.className("brand-global-nav-action-search-Search__label--3PRUD");
   By ele2=By.id("MAIN_SEARCH_CONTAINER");
   By ele3=By.className("hotels-community-content-common-ContextualCTA__currentOption--3Wd5D");
   By ele4=By.className("ui_bubble_rating fl bubble_50");   
   By ele5=By.xpath("//input[@id='ReviewTitle']");
   By ele6=By.xpath("//textarea[@id='ReviewText']");
   By ele7=By.className("answersBubbles ui_bubble_rating fl qid12 bubble_50");
   By ele8=By.xpath("//input[@id='noFraud']");
   

   
   
   public WebElement trip_search()
   {
	   WebElement e1=driver.findElement(ele1);
		return e1;
   }
   
   public WebElement trip_main_search()
   {
	   WebElement e2=driver.findElement(ele2);
		return e2;
   }
   
   public WebElement write_review()
   {
	   WebElement e3=driver.findElement(ele3);
		return e3;
   }
   
   public WebElement over_all_rating()
   {
	   WebElement e4=driver.findElement(ele4);
		return e4;
   }
   
   public WebElement Title_of_review()
   {
	   WebElement e5=driver.findElement(ele5);
		return e5;
   }
   
   public WebElement your_review()
   {
	   WebElement e6=driver.findElement(ele6);
		return e6;
   }
   
   public WebElement Hotel_rating()
   {
	   WebElement e7=driver.findElement(ele7);
		return e7;
   }
   
   public WebElement submit_checkbox()
   {
	   WebElement e8=driver.findElement(ele8);
		return e8;
   }
   
}
