package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetails {
	WebDriver driver;
	By product=By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[1]/div");
	By getdetails=By.xpath("//*[@id=\"feature-bullets\"]/ul");
	 public ProductDetails(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	
	public void  details_product() {
		
		driver.findElement(product).click();
	}
	public void description() {
		WebElement b=driver.findElement(getdetails);
		b.getText();
		System.out.println("Printing" +b);
	}
	

}
