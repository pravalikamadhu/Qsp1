package annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoFw {
	@BeforeSuite
	public void jdbcConnection()
	{
	Reporter.log("Jdbc Connected",true);
	}
	@BeforeTest
	public void extraConnection()
	{
		Reporter.log("Connected",true);	
	}
	@BeforeClass
	public void openApp()
	{
		Reporter.log("App opened",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login Done",true);
	}
	@Test
	public void tc1()
	{
		Reporter.log("Test case 1 Executed",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("Test case 2 Executed",true);
	}
	@AfterMethod
	public void logout()
	
		{
			Reporter.log("Logout Done",true);
		}
		@AfterClass
		public void closeApp()
		{
			Reporter.log("App closed",true);
		}
		@AfterSuite
		public void jdbcDisconnection()
		{
			Reporter.log("Jdbc Disconnected",true);
		}
		@AfterTest
		public void extraconnectoinDisconnected()
		{
			Reporter.log("Disconnected",true);
		}
		@Test
		public void tc3()
		{
			Reporter.log("Test case 3 Executed",true);
		}


		
		
		
		
		
		
			
		
		
		
	}



