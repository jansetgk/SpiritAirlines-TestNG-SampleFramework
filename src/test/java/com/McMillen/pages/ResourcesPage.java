package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class ResourcesPage extends CommonMethods{
	public WebElement resources = driver.findElement(By.xpath("//li[@id='navc-2161']/a/span"));
}