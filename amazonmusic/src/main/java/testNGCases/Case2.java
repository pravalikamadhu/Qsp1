package testNGCases;

import org.testng.annotations.Test;

public class Case2 {
	@Test
	public void m1() {
		System.out.println("Hello");
	}
	@Test
		public void m2() {
			System.out.println("Hii");
	}
	@Test
	public void m3() {
		System.out.println("Hii")//missing semicolon
}
	

}
