package Class_11_TestNG_Framework;

import org.testng.annotations.Test;
import Common.Utility;
import PageObjectModel.FBhome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FindElements extends Utility {
 // @Test
  public void f() {
	  List <WebElement> li=driver.findElements(By.tagName("a"));
	  System.out.println(li.size());	  
/*	  for(WebElement link:li) {
		  System.out.println(link.getText()); }*/	  
	  Iterator<WebElement> itr=li.iterator();
	  	  while(itr.hasNext()) {
		  String url =itr.next().getText();
		  System.out.println(url);
	  }
  }
  
//	  @Test
	  public void property () throws InterruptedException, IOException {
		  String local = System.getProperty("user.dir");
		  Properties pro=new Properties();
		  FileInputStream fis=new FileInputStream(local+"\\target\\Regression.properties");
		  pro.load(fis);
		  String email=pro.getProperty("Email");
		  String pwd=pro.getProperty("Password");
		  
		  FBhome fbh=new FBhome(driver);
		  fbh.email(email);
		  fbh.password(pwd);
		  fbh.login();
		  Thread.sleep(5000);
	  }
	  
	  @Test
	  public void ExcelSheetData() {
		  XSSFWorkbook ExcelWBook;
		  XSSFSheet ExcelWSheet;
		  XSSFCell Cell;
		  
		  String path= "C:\\Users\\Md.RafiqulHaider\\git\\eclipse_git\\M_SALEEM1\\Data4Eclipse.xlsx"; 
		  String sheetName="sheet1";
		  
		  try{
			  FileInputStream ExcelFile =new FileInputStream(path);
			  ExcelWBook = new XSSFWorkbook(ExcelFile);
			  ExcelWSheet = ExcelWBook.getSheet(sheetName);
			  
			  Cell = ExcelWSheet.getRow(0).getCell(1);
			  String cellData = Cell.getStringCellValue();
			  System.out.println("Cell Data: "+cellData);
			  
		  }catch (Exception e){
			  e.printStackTrace();
		  }
	  }
  }





