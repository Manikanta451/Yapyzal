package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class FbCheckoutPageObjects extends YPBase{

	protected FbCheckoutPageObjects(WebDriver driver) {
		super(driver);
	}

	
	public static WebElement pagename(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/div/div[2]/ul/li[4]/a/div/span"));
        return webelement;
        } 
	public static WebElement DEAL(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/div/div[1]/div[2]/div[3]/div[8]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div[5]/div/div/div/div/div[1]/span/div[2]/a"));
        return webelement;
        }       
           
	public static WebElement type(WebDriver driver){
		webelement = driver.findElement(By.id("stype1"));
        return webelement;
        } 
	public static WebElement color(WebDriver driver){
		webelement = driver.findElement(By.id("scolor1"));
        return webelement;
        }
	public static WebElement size(WebDriver driver){
		webelement = driver.findElement(By.id("ssize1"));
        return webelement;
        }
	 
	public static WebElement checkout(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div/div[3]/a"));
        return webelement;
        }
	
	
	public static WebElement fname(WebDriver driver){
		webelement = driver.findElement(By.id("ShippingFirstNameTextBox"));
        return webelement;
        }
	     
	public static WebElement lname(WebDriver driver){
		webelement = driver.findElement(By.id("ShippingLastNameTextBox"));
        return webelement;
        }
	
	public static WebElement address(WebDriver driver){
		webelement = driver.findElement(By.id("ShippingAddress1Textbox"));
        return webelement;
        }
	public static WebElement city(WebDriver driver){
		webelement = driver.findElement(By.id("ShipCity"));
        return webelement;
        }
	public static WebElement state(WebDriver driver){
		webelement = driver.findElement(By.id("ddlShipState"));
        return webelement;
        }
	public static WebElement zip(WebDriver driver){
		webelement = driver.findElement(By.id("ShipZip"));
        return webelement;
        }
	
	public static WebElement shippingservice(WebDriver driver){
		webelement = driver.findElement(By.id("ShippingNameLabel_6783"));
        return webelement;
        }
	
	public static WebElement phone(WebDriver driver){
		webelement = driver.findElement(By.id("ContactPhoneTextBox"));
        return webelement;
        }
	public static WebElement email(WebDriver driver){
		webelement = driver.findElement(By.id("ContactEmailTextBox"));
        return webelement;
        }
	public static WebElement sameshipping(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[2]/div[3]/div[6]/div[1]/samp/label/em"));
        return webelement;
        }
	
	public static WebElement cardtype(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[2]/div[3]/div[6]/div[2]/div[1]/div/ul/li[1]/a"));
        return webelement;
        }

	
	public static WebElement cardnumber(WebDriver driver){
		webelement = driver.findElement(By.id("CreditCardNumberTextBox"));
        return webelement;
        }
	public static WebElement cvv(WebDriver driver){
		webelement = driver.findElement(By.id("CCVTextBox"));
        return webelement;
        }
	public static WebElement expdate(WebDriver driver){
		webelement = driver.findElement(By.id("CCMonthExpDropDownList"));
        return webelement;
        }
	public static WebElement expyear(WebDriver driver){
		webelement = driver.findElement(By.id("CCYearExpDropDownList"));
        return webelement;
        }
	
	public static WebElement placeorder(WebDriver driver){
		webelement = driver.findElement(By.id("SubmitButton"));
        return webelement;
        }
	
	public static WebElement yapyzalshirt(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/div/div[1]/div[2]/div[3]/div[8]/div/div[1]/div/div/div[1]/div/div[2]/div[1]/div[5]/div/div/div/div/div[1]/span/div[2]/div"));
        return webelement;
        }
	
	
}
