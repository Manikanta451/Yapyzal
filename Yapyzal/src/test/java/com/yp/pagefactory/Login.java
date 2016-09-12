package com.yp.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.yp.datainitialization.DataInt;
import com.yp.pageobjects.LoginObjects;

public class Login extends YPBase{
	
	public Login(WebDriver driver) {
		super(driver);
	}
	 

	
	public void accountlogin(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(5000);
			LoginObjects.btnlogIn(driver).click();
			Thread.sleep(3000);
			LoginObjects.emailid(driver).sendKeys(dataInt.getUsername());
			Thread.sleep(2000);
			LoginObjects.password(driver).sendKeys(dataInt.getUserpassword());
			Thread.sleep(1000);
			LoginObjects.loginbutton(driver).click();
			LOG.info("lOGIN sUCCESS");
			Reporter.log("Login successfully");
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}		
}
