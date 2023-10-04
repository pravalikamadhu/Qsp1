package actitime;

import java.util.Random;

import org.testng.annotations.BeforeClass;

import excelsheet.ReusableMethods;

public class Batchexecution {
	public class ActiTimeFw{
		
		public WebDriver driver;
		public ReusableMethods rm = new ReusableMethods();
		Random r =new Random();
		
		public int num =r.nextInt(10000);
		@BeforeClass
		public void openApp()
		{
			webDriverManager.chromedriver().setup();
			driver = new chromeDriver()
		}
	}

}
