package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.Homepage;
import com.actitime.pom.Loginpage;

public class Baseclass 
{
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@BeforeTest
public void openbrowser() throws IOException
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.manage().window().maximize();
	
}
@AfterTest
public void closebrowser()
{
	driver.close();
}
@BeforeMethod
public void login() throws IOException
{
	Filelib f=new Filelib();
	String url = f.getpropertydata("url");
	String un = f.getpropertydata("username");
	String pw=f.getpropertydata("password");
	driver.get(url);
	Loginpage l=new Loginpage(driver);
	l.setlogin(un, pw);
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
	Homepage h=new Homepage(driver);
	h.setLgoutbtn();
	
}
}
