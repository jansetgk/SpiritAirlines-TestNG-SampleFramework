package com.Spirit.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Spirit.pages.SignInElements;
import com.Spirit.utils.CommonMethods;



public class SignInTest extends CommonMethods {

	
	//@Test(priority=1)
	public void SignIn() throws InterruptedException  {
		Thread.sleep(3000);
		SignInElements sign=new SignInElements();
		sign.signIn.click();
		Thread.sleep(3000);
		sign.userName.sendKeys("jangk@gmail.com");
		sign.password.sendKeys("Ab123456.");
		sign.loginButton.click();
	}
	
	//@Test(priority=2, dependsOnMethods={"SignIn"})
	public void validationOfWelcomeUser() throws InterruptedException {
		SignInElements sign=new SignInElements();
		sign.signIn.click();
		sign.userName.sendKeys("jangk@gmail.com");
		sign.password.sendKeys("Ab123456.");
		sign.loginButton.click();
		Thread.sleep(3000);
		sign.userAccount.click();
		Thread.sleep(3000);
		sign.myAccount.click();
		Thread.sleep(3000);
		String actualText=sign.welcomeUser.getText();
		Thread.sleep(3000);
		String expectedText="Welcome back, JAN";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(actualText);
		sign.signOut.click();
	}
	
	@Test
	public void invalidEmailSignIn() throws InterruptedException {
		SignInElements sign=new SignInElements();
		sign.signIn.click();
		Thread.sleep(3000);
		sign.userName.sendKeys("jan@gmail.com");
		sign.password.sendKeys("Ab123456.");
		sign.loginButton.click();
		String invalidMsg=sign.invalidLoginMsg.getText();
		String expectedMsg="Invalid email address or incorrect password. Please correct and re-try or select Sign Up.";
		Assert.assertEquals(invalidMsg, expectedMsg);
	}
}
