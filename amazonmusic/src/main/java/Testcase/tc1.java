package Testcase;

import java.time.Duration;

import org.testng.annotations.Test;

public class tc1 {
	@Test
	public void m1() {
	WebDrivermanager.ChromeDriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(rm.property)
	driver.manage().timeouts().implicitlywait(Duration.ofSeconds(10));
	
	
	}


}