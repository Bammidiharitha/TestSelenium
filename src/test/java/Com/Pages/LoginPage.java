package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//login to the application//                                                                                                                            
		WebDriver driver;
		By Hellosignin = By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]");
		By Email = By.id("ap_email");
		By Continue =By.id("continue");
		By password = By.id("ap_password");
		By login = By.id("signInSubmit");
		
	   public LoginPage(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	   public void LoginClass_Hellosignin()
	   {
		   driver.findElement(Hellosignin).click();
	   }
	   public void LoginClass_Email(String email)
	   {
		   driver.findElement(Email).sendKeys(email);
	   }
	   public void LoginClass_Continue()
	   {
		   driver.findElement(Continue).click();
	   }
	   public void LoginClass_password(String pass)
	   {
		   driver.findElement(password).sendKeys(pass);
	   }
	   public void LoginClass_login()
	   {
		   driver.findElement(login).click();
	   }
	  

}
