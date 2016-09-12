package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class FbCheckoutPageDonateObjects extends YPBase {

	protected FbCheckoutPageDonateObjects(WebDriver driver) {
		super(driver);
		
	}
	
	public static WebElement homepage(WebDriver driver){
		webelement = driver.findElement(By.xpath("//div[2]/div/a"));
        return webelement;
        } 
	
	public static WebElement donate(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/div/div[1]/div[2]/div[3]/div[8]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div[5]/div/div/div/div/div[1]/span/div[1]/a/div"));
        return webelement;
        }   
	
	public static WebElement dynamicdata(WebDriver driver){
		webelement = driver.findElement(By.id("TransactionAmountDeal"));
        return webelement;
        }          
	
	public static WebElement checkout(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div/div/ul/li/div[3]/a"));
        return webelement;
        } 
	

	public static WebElement email(WebDriver driver){
		webelement = driver.findElement(By.id("DEmailTextBox"));
        return webelement;
        } 
	
	public static WebElement phone(WebDriver driver){
		webelement = driver.findElement(By.id("DPhoneTextBox"));
        return webelement;
        } 
	
	public static WebElement fname(WebDriver driver){
		webelement = driver.findElement(By.id("DFirstNameTextBox"));
        return webelement;
        }

	public static WebElement lname(WebDriver driver){
		webelement = driver.findElement(By.id("DLastNameTextBox"));
        return webelement;
        }
	public static WebElement address(WebDriver driver){
		webelement = driver.findElement(By.id("DAddressTextBox"));
        return webelement;
        }
	
	public static WebElement city(WebDriver driver){
		webelement = driver.findElement(By.id("DCityTextBox"));
        return webelement;
        }
	
	public static WebElement state(WebDriver driver){
		webelement = driver.findElement(By.id("DStateDropDownList"));
        return webelement;
        }
	public static WebElement zip(WebDriver driver){
		webelement = driver.findElement(By.id("DZipTextBox"));
        return webelement;
        }
	
	public static WebElement cardtype(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[3]/div/div[3]/div[2]/div[1]/div/ul/li[1]/a"));
        return webelement;
        }
	
	
	public static WebElement cardnumber(WebDriver driver){
		webelement = driver.findElement(By.id("DCardNumberTextBox"));
        return webelement;
        }
	public static WebElement cvv(WebDriver driver){
		webelement = driver.findElement(By.id("DCvvTextBox"));
        return webelement;
        }
	public static WebElement expdate(WebDriver driver){
		webelement = driver.findElement(By.id("DMonthDropDownList"));
        return webelement;
        }
	
	public static WebElement expyear(WebDriver driver){
		webelement = driver.findElement(By.id("DYearDropDownList"));
        return webelement;
        }
	public static WebElement placeorder(WebDriver driver){
		webelement = driver.findElement(By.id("DSubmitButton"));
        return webelement;
        }
	public static WebElement gobackbtn(WebDriver driver){
		webelement = driver.findElement(By.id("MainContent_backBtn"));
        return webelement;
        }
	
	public static WebElement timeline(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div/div[5]/div/div/div/div/div/div/ul/li[1]/a"));
        return webelement;
        }
	

	public static WebElement y(WebDriver driver){
		webelement = driver.findElement(By.className("_6l- __c_"));
        return webelement;
        }
	
	public static WebElement x;
	
}
