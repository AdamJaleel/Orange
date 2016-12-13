package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.utilities.Base;

public class DashBoardPage extends Base {
	
	public DashBoardPage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='head']/h1")
	public WebElement dashBoardText;
	
	
}
