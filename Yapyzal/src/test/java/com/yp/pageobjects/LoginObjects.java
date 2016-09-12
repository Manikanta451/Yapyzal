package com.yp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yp.pagefactory.YPBase;

public class LoginObjects extends YPBase {

	protected LoginObjects(WebDriver driver) {
		super(driver);
	}
	
	
	public static WebElement btnlogIn(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[5]/a"));
        return webelement;
        }

	public static WebElement emailid(WebDriver driver){
		webelement = driver.findElement(By.id("email"));
        return webelement;
        }
	public static WebElement password(WebDriver driver){
		webelement = driver.findElement(By.id("password"));
        return webelement;
        }
	
	public static WebElement loginbutton(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div[3]/input"));
        return webelement;
        }
	 
}
