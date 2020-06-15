package com.Spirit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Spirit.testbase.BaseClass;

public class SignInElements {

	@FindBy(xpath="//a[@class='nav3D text-uppercase ng-star-inserted']")
	public WebElement signIn;
	
	@FindBy(id="username")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block d-sm-inline']")
	public WebElement loginButton;
	
	@FindBy(linkText="Sign Out")
	public WebElement signOut;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	public WebElement userAccount;
	
	@FindBy(linkText="My Account")
	public WebElement myAccount;
	
	@FindBy(xpath="//h2[@class='headline2 ng-star-inserted']")
	public WebElement welcomeUser;
	
	@FindBy(xpath="//p[@class='ng-star-inserted']")
	public WebElement invalidLoginMsg;
	
	public SignInElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
