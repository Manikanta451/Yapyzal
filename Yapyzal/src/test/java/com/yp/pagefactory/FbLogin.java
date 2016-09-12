package com.yp.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.yp.datainitialization.DataInt;
import com.yp.pageobjects.FBLoginObjects;

public class FbLogin extends YPBase{
	
	public FbLogin(WebDriver driver) {
		super(driver);
	}
     	
	
	public void accountlogin(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(3000);
            driver.get("https://www.facebook.com");
            driver.manage().window().maximize();
			Thread.sleep(3000);
			FBLoginObjects.fbemail(driver).sendKeys(dataInt.getUsername());
			Thread.sleep(1000);
			FBLoginObjects.fbpswd(driver).sendKeys(dataInt.getFbPassword());
			Thread.sleep(1000);
			FBLoginObjects.fblogin(driver).click();
			Thread.sleep(6000);
			s.click(sikulipath + "\\sikuli\\block.PNG");
			
	
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
}
