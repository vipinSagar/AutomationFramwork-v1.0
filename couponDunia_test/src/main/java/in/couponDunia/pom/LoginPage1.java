/**
 * 
 */
package in.couponDunia.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import in.couponDunia.utils.Driver_support;

/**
 * @author Remote
 *
 * This class will store all the locators and methods of Login popup.
 */
public class LoginPage1 extends Driver_support
{ 



	String loginLink= "//div[@class='log-in signin-link']",
			email= "signin-email",
			password= "signin-password",
			signIn= "//button[text()='SIGN IN']";


	public void loginToCouponDunia(String userEmail, String userPassword)
	{
	
		findBy("xpath",loginLink).click();
		findBy("id",email).sendKeys(userEmail);
		findBy("id",password).sendKeys(userPassword);
		findBy("xpath",signIn).click();
		
		
		
	}

}