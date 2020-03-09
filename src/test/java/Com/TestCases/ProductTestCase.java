package Com.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperEx;

import Com.Pages.ProductDetails;

public class ProductTestCase extends WrapperEx {
		@BeforeClass
		public void startUp() 
		{
		 launchApplication("Chrome","https://www.amazon.in/");	
		}
		@Test
		public void product()
		{
			ProductDetails pc = new ProductDetails(driver);
			 pc.details_product();
			 pc.description();	
		}
		@AfterClass
		public void close() {
			close();
		}

}
