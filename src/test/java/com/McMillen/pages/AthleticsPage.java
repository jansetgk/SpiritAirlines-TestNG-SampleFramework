package com.McMillen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.McMillen.utils.CommonMethods;

public class AthleticsPage extends CommonMethods{
	public WebElement athletics = driver.findElement(By.xpath("//li[@id='navc-2159']/a/span"));
}
