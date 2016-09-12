package com.yp.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.yp.datainitialization.DataInt;
import com.yp.pageobjects.*;



public class FacebookCheckoutDeal  extends YPBase{
	public FacebookCheckoutDeal(WebDriver driver) {
		super(driver);
	}

	
	public void facebookdeal(DataInt dataInt) throws Exception {
				try {
				    Thread.sleep(6000);
				    FbCheckoutPageObjects.pagename(driver).click();
				    Thread.sleep(8000);
				    WebElement anchortag=FbCheckoutPageObjects.yapyzalshirt(driver).findElement(By.tagName("a"));
				    String anchor=anchortag.getAttribute("href");
				    driver.get(anchor);
				    Thread.sleep(9000);
				    driver.switchTo().frame(0);
				    Thread.sleep(3000); 
				    new Select(FbCheckoutPageObjects.type(driver)).selectByVisibleText("SHIRT JACKET");
				    Thread.sleep(2000);
				    new Select(FbCheckoutPageObjects.color(driver)).selectByVisibleText("BLUE");
				    Thread.sleep(2000);
				    new Select(FbCheckoutPageObjects.size(driver)).selectByVisibleText("SMALL");
				    Thread.sleep(2000);
				    this.browsername();
				    if(browserName.equalsIgnoreCase("firefox")){
				      By scroll = By.xpath("/html");
				    	 WebElement scrollUp = driver.findElement(scroll);
				         scrollUp.sendKeys(Keys.PAGE_DOWN);         
				    }
				    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)","");
				    Thread.sleep(4000);
				    FbCheckoutPageObjects.checkout(driver).click();
				    Thread.sleep(9000);
				    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)","");
				    
				    
				 } catch (Exception e) {
					  excep = e.toString();
					  Assert.fail(excep);
					}
				}	
				    
		 public void shippinginfo(DataInt dataInt) throws Exception {
					try {
					this.browsername();
					if(browserName.equalsIgnoreCase("firefox")){
						driver.switchTo().defaultContent();
						((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100)", "");
						Thread.sleep(3000);
					    driver.switchTo().frame(0);
					}
					FbCheckoutPageObjects.fname(driver).sendKeys(dataInt.getFirstname());
					FbCheckoutPageObjects.lname(driver).sendKeys(dataInt.getLastname());
					FbCheckoutPageObjects.address(driver).sendKeys(dataInt.getAddress());
					FbCheckoutPageObjects.city(driver).sendKeys(dataInt.getCity());
					FbCheckoutPageObjects.zip(driver).sendKeys(dataInt.getZip());
				    new Select(FbCheckoutPageObjects.state(driver)).selectByVisibleText("Tennessee");
				    Thread.sleep(15000);
				    FbCheckoutPageObjects.shippingservice(driver).click();
				    this.browsername();
				    if(browserName.equalsIgnoreCase("chrome")){
				    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");
				    }
				    FbCheckoutPageObjects.email(driver).sendKeys(dataInt.getEmail());
				    FbCheckoutPageObjects.phone(driver).sendKeys(dataInt.getPhone());
				    Thread.sleep(1000);
				    FbCheckoutPageObjects.sameshipping(driver).click();
				    Thread.sleep(2000);
				    FbCheckoutPageObjects.cardtype(driver).click();
				    Thread.sleep(2000);
				    FbCheckoutPageObjects.cardnumber(driver).sendKeys(dataInt.getCardnumber());
				    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
				    Thread.sleep(1000);
				    FbCheckoutPageObjects.cvv(driver).sendKeys(dataInt.getCvv());
				    FbCheckoutPageObjects.expdate(driver).sendKeys(dataInt.getExpirydate());
				    Thread.sleep(1000);
				    FbCheckoutPageObjects.expyear(driver).sendKeys(dataInt.getExpiryyear());
				    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,50)");
				    Thread.sleep(5000);
				    FbCheckoutPageObjects.placeorder(driver).click();
				    Thread.sleep(8000);
				    driver.switchTo().defaultContent();
				    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)");
				   
				 
				   } catch (Exception e) {
					  excep = e.toString();
					  Assert.fail(excep);
					}
				}						
	}