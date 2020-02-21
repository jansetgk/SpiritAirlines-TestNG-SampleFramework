package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class AboutUsPage extends CommonMethods {
	public WebElement aboutUs = driver.findElement(By.xpath("//li[@id='navc-2154']/a/span "));

	public WebElement annualReport=driver.findElement(By.linkText("Administration"));








}
