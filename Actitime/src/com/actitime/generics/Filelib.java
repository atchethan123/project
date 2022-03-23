package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib 
{
public static String getpropertydata(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
	
}
public static String getexceldata(String sname,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream f=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(f);
	String data = wb.getSheet(sname).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
}
