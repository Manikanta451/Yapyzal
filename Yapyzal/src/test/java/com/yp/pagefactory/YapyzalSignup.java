package com.yp.pagefactory;

import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.yp.pageobjects.*;
import com.yp.datainitialization.DataInt;


public class YapyzalSignup extends YPBase{
	
	public YapyzalSignup(WebDriver driver) {
		super(driver);
	}

	
	
	public void accountsignup(DataInt dataInt) throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			SignUpObjects.getstarted(driver).click();
			driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
			SignUpObjects.firstname(driver).sendKeys(dataInt.getFname());
			SignUpObjects.lastname(driver).sendKeys(dataInt.getLname());
			SignUpObjects.signupemail(driver).sendKeys(dataInt.getSignupemail());
			SignUpObjects.signuppassword(driver).sendKeys(dataInt.getSignuppassword());
			Thread.sleep(2000);
			SignUpObjects.termsofuse(driver).click();
			Thread.sleep(1000);
			SignUpObjects.createmyaccount(driver).click();
			Thread.sleep(4000);
			SignUpObjects.businessname(driver).sendKeys(dataInt.getBusinessname());
			SignUpObjects.addresssignup(driver).sendKeys(dataInt.getAddresssignup());
			SignUpObjects.countrysignup(driver).sendKeys(dataInt.getCountrysignup());
			SignUpObjects.citysignup(driver).sendKeys(dataInt.getCitysignup());
			SignUpObjects.statesignup(driver).sendKeys(dataInt.getStatesignup());
			SignUpObjects.zipsignup(driver).sendKeys(dataInt.getZipsignup());
			Thread.sleep(2000);
			SignUpObjects.next(driver).click();
			Thread.sleep(6000);
			SignUpObjects.facebookclick(driver).click();
			switchToNewWindow(getTitle());
			Thread.sleep(2000);
			SignUpObjects.fbemail(driver).sendKeys(dataInt.getFbemail());
			Thread.sleep(1000);
			SignUpObjects.fbpswd(driver).sendKeys(dataInt.fbpswd);
			Thread.sleep(1000);
			SignUpObjects.fblogin(driver).click();
			Thread.sleep(6000);
			switchbackToMainWindow();
			Thread.sleep(2000);
			SignUpObjects.fbpage(driver).click();
			Thread.sleep(1000);
			SignUpObjects.connectfb(driver).click();
			Thread.sleep(2000);
			SignUpObjects.nextbtn(driver).click();
			Thread.sleep(6000);
			SignUpObjects.paymentgateway(driver).sendKeys(dataInt.getPaymentgateway());
			Thread.sleep(2000);
			SignUpObjects.loginid(driver).sendKeys(dataInt.getLoginid());
			Thread.sleep(1000);
			SignUpObjects.key(driver).sendKeys(dataInt.getKey());
			Thread.sleep(2000);
			SignUpObjects.startselling(driver).click();
			Thread.sleep(9000);
			SignUpObjects.createanewpost(driver).click();
			Thread.sleep(1000);
			SignUpObjects.sellaproduct(driver).click();
			Thread.sleep(9000);
	
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}		
}
			