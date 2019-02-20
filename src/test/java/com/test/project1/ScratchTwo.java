package com.test.project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ScratchTwo {
	
	@DataProvider(name="testData")
	public Object[][] getData() throws FileNotFoundException, IOException {
		
		TreeMap<String, String> mp = new TreeMap<String, String>();
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("D:\\Automation Stuff\\Excel utility\\sample_data.xlsx"));
		Sheet sheet = wb.getSheet("Sheet0");
		Iterator<Row> rowItr = sheet.iterator();
		rowItr.next();
		while(rowItr.hasNext()) {
			
			Row row = rowItr.next();
			Iterator<Cell> cellItr = row.cellIterator();
			Cell usersCell = cellItr.next();
			String Uname = usersCell.getStringCellValue();
			Cell pswdCell = cellItr.next();
			String pswd = pswdCell.getStringCellValue();
			mp.put(Uname, pswd);
	
		}
		
		Object[][] data = new Object[mp.size()][2];
		
		Set entries = mp.entrySet();
		Iterator enItr = entries.iterator();
		int i=0;
		while(enItr.hasNext()) {
			
			Map.Entry mapEn = (Map.Entry) enItr.next();
			data[i][0] = mapEn.getKey();
			data[i][1] = mapEn.getValue();
			i++;
		}
		return data;

	}

	@Test(dataProvider="testData")
	public void setData(String uname, String pwd) {
		
		System.out.println(uname);
		System.out.println(pwd);
		
		
		
		
	}
	
		
	}
	
	
	
	
	
	
	
	
	

