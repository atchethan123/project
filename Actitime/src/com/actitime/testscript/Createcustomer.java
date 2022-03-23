package com.actitime.testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass;
import com.actitime.generics.Filelib;
import com.actitime.pom.Homepage;
import com.actitime.pom.Tasklist;
//@Listeners(com.actitime.generics.listenersimpementation.class)
public class Createcustomer extends Baseclass
{
@Test
public void testCreatecustomer() throws EncryptedDocumentException, IOException, InterruptedException
{
	Reporter.log("login", true);
	Homepage h=new Homepage(driver);
	h.setTsktab();
	Filelib f=new Filelib();
	String custname = f.getexceldata("createcustomer", 3, 5);
String custdesc = f.getexceldata("createcustomer", 3, 6);
			Tasklist t=new Tasklist(driver);
			t.getNewbtn().click();
			t.getNewcustlink().click();
			t.getCustnme().sendKeys(custname);
			t.getCustdec().sendKeys(custdesc);
			t.getSlctcust().click();
			t.getOurcmpny().click();
			t.getCretcust().click();
	Thread.sleep(2000);
			String actual = t.getActualcust().getText();
	Assert.	assertEquals(actual, custname);
}
}
