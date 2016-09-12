package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class SignUpObjects extends YPBase{

	protected SignUpObjects(WebDriver driver) {
		super(driver);
	}
	
	
	public static WebElement getstarted(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
        return webelement;
        }
	
	public static WebElement firstname(WebDriver driver){
		webelement = driver.findElement(By.id("first_name"));
        return webelement;
        }

	public static WebElement lastname(WebDriver driver){
		webelement = driver.findElement(By.id("last_name"));
        return webelement;
        }
	

	public static WebElement signupemail(WebDriver driver){
		webelement = driver.findElement(By.id("email"));
        return webelement;
        }
	
	public static WebElement signuppassword(WebDriver driver){
		webelement = driver.findElement(By.id("password"));
        return webelement;
        }
	
	public static WebElement termsofuse(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/p[1]/img"));
        return webelement;
        }
	public static WebElement createmyaccount(WebDriver driver){
		webelement = driver.findElement(By.id("continue_bt"));
        return webelement;
        }
	
	public static WebElement businessname(WebDriver driver){
		webelement = driver.findElement(By.id("business_name"));
        return webelement;
        }
	
	public static WebElement addresssignup(WebDriver driver){
		webelement = driver.findElement(By.id("address_1"));
        return webelement;
        }
	public static WebElement countrysignup(WebDriver driver){
		webelement = driver.findElement(By.id("country"));
        return webelement;
        }
	
	public static WebElement citysignup(WebDriver driver){
		webelement = driver.findElement(By.id("city"));
        return webelement;
        }
	
	public static WebElement statesignup(WebDriver driver){
		webelement = driver.findElement(By.id("state"));
        return webelement;
        }
	

	public static WebElement zipsignup(WebDriver driver){
		webelement = driver.findElement(By.id("zip"));
        return webelement;
        }
	public static WebElement next(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/input"));
        return webelement;
        }
	
	public static WebElement facebookclick(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/div[2]/div/a/img"));
        return webelement;
        }
	public static WebElement fbemail(WebDriver driver){
		webelement = driver.findElement(By.id("email"));
        return webelement;
        }
	
	public static WebElement fbpswd(WebDriver driver){
		webelement = driver.findElement(By.id("pass"));
        return webelement;
        }
	
	public static WebElement fblogin(WebDriver driver){
		webelement = driver.findElement(By.xpath("//label/input"));
        return webelement;
        }
	public static WebElement fbpage(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/table/tbody/tr/td[1]/img"));
        return webelement;
        }
	public static WebElement connectfb(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/p/img"));
        return webelement;
        }
	public static WebElement nextbtn(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/a[2]/input"));
        return webelement;
        }  
	
	
	public static WebElement paymentgateway(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div[2]/ul/li[1]/div[1]/select"));
        return webelement;
        }  

	public static WebElement loginid(WebDriver driver){
		webelement = driver.findElement(By.xpath("html/body/div[2]/div[2]/div/form/div[2]/ul/li[2]/div[1]/input"));
        return webelement;
        } 

	public static WebElement key(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div[2]/ul/li[3]/div[1]/input"));
        return webelement;
        } 

	public static WebElement startselling(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div[4]/input"));
        return webelement;
        }
	public static WebElement createanewpost(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/ul/li"));
        return webelement;
        }
	
	public static WebElement sellaproduct(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/ul/li/ul/a[1]/li"));
        return webelement;
        }
}
