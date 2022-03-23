package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasklist 
{
@FindBy(xpath="//div[text()='Add New']")
private WebElement newbtn;
@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement newcustlink;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custnme;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement custdec;
@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement slctcust;
@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
private WebElement ourcmpny;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement cretcust;
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement actualcust;
public Tasklist(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getNewbtn() {
	return newbtn;
}
public WebElement getNewcustlink() {
	return newcustlink;
}
public WebElement getCustnme() {
	return custnme;
}
public WebElement getCustdec() {
	return custdec;
}
public WebElement getSlctcust() {
	return slctcust;
}
public WebElement getOurcmpny() {
	return ourcmpny;
}
public WebElement getCretcust() {
	return cretcust;
}
public WebElement getActualcust() {
	return actualcust;
}

}
