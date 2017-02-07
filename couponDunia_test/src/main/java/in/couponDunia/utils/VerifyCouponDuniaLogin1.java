/**
 * 
 */
package in.couponDunia.utils;


import in.couponDunia.pom.LoginPage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Remote
 *
 * This test case for login scenarios in CouponDunia
 */
public class VerifyCouponDuniaLogin1 extends Driver_support
{
	@Test
	public void verifyValidEmailLogin() throws InterruptedException
	{

		String url = "https://www.coupondunia.in/";
		initilalse_browser(url);
		
		
		LoginPage1 login = new LoginPage1();
		
		
		login.loginToCouponDunia("vamanulal300@gmail.com", "qwertyuiop");
		

		
		
		
	}
	

}
