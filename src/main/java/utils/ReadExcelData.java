package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static Object[][] readExcelData(String filename) {
		// TODO Auto-generated method stub
		
		//String fileLocation = "./test-data/credentials.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook("./test-data/"+filename+".xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet wSheet = wbook.getSheetAt(0);
		int lastrow = wSheet.getLastRowNum();
		short lastcell = wSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastrow][lastcell];
		for (int i = 1; i <=lastrow; i++) {
			XSSFRow row = wSheet.getRow(i);
			for (int j = 0; j <lastcell; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
							} 
		
		}
		return data;
	}

}
