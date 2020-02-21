package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class CounsellingPage extends CommonMethods{

	public WebElement counselling = driver.findElement(By.xpath("//li[@id='navc-2157']/a/span"));
}
