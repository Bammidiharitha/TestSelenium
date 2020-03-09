package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchAndSelect {
	WebDriver driver;
	By searchbar=By.id("twotabsearchtextbox");
	
	
	  public SearchAndSelect(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	
	public void  Search_item(String values) throws InterruptedException {
		driver.findElement(searchbar).sendKeys(values);
		Actions d=new Actions(driver);
		Thread.sleep(1000);
		d.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		d.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		d.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		d.sendKeys(Keys.ENTER).build().perform();
		
	}

}
