package Com.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperEx;

import Com.Pages.SearchAndSelect;

public class SearchTestCase extends WrapperEx {
		@BeforeClass
		public void startUp() 
		{
		 launchApplication("Chrome","https://www.amazon.in/");	
		}
		@Test
		public void search() throws InterruptedException
		{
			  SearchAndSelect d = new SearchAndSelect(driver);
			 d.Search_item("mobiles");	
		}
		//@AfterClass
		//public void close() {
			//closeapp();
		//}


}
