package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class OrganizationsPage extends CommonMethods{
	public WebElement organizations = driver.findElement(By.xpath("//li[@id='navc-2162']/a/span"));
}
