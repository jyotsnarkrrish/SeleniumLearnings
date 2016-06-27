package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {
	public void Select(){
	WebDriver driver=new FirefoxDriver();
driver.get("http://demos.telerik.com/kendo-ui/dropdownlist/index");
WebElement element=driver.findElement(By.tagName("select"));
	Select se = new Select(element);
	se.selectByVisibleText("Nov");

	//select.selectByValue("11");
}
}
