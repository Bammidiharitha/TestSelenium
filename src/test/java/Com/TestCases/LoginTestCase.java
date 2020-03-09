package Com.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperEx;

import Com.Pages.LoginPage;

public class LoginTestCase extends WrapperEx {
		@BeforeClass
		public void startUp() 
		{
		 launchApplication("Chrome","https://www.amazon.in/");	
		}
		@Test
		public void login()
		{
			LoginPage lc = new LoginPage(driver);
			lc.LoginClass_Hellosignin();
			lc.LoginClass_Email("6309390396");
			lc.LoginClass_Continue();
			lc.LoginClass_password("Triveni@v");
			lc.LoginClass_login();
			
			
		}
		//@AfterClass
		//public void close() {
			//closeapp();
		//}


}
