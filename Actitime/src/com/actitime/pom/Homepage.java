package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
@FindBy(xpath="//a[text()='Logout']")
private WebElement lgoutbtn;
@FindBy(id="container_tasks")
private WebElement tsktab;

public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setLgoutbtn() {
	 lgoutbtn.click();
}

public void setTsktab() {
	tsktab.click();
}



}
