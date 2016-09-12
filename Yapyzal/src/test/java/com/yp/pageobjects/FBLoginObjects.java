package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class FBLoginObjects extends YPBase{

	protected FBLoginObjects(WebDriver driver) {
		super(driver);
	
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
	  
}
