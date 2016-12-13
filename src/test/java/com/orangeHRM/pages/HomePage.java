package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.utilities.Base;

public class HomePage extends Base {
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	public WebElement userName;
	
	@FindBy(id = "txtPassword")
	public WebElement userPWD;
	
	@FindBy(id = "btnLogin")
	public WebElement loginButton;
	

}
