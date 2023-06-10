package seleniumProject;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;import org.testng.annotations.Test;

public class SauceLab {
	 @Test() @DataProvider(name = "excelData")
	 public void excelDataProvider() {  getExcelData("C:\\Users\\ankurjain\\Desktop\\eclispe-workspace2\\q11\\Book1.xlsx","Students");
	 }
	 public String[][] getExcelData(String fileName, String sheetName) {
	  String[][] data = null;  
	  try {
	   FileInputStream fis = new FileInputStream(fileName);   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   XSSFSheet sheet = wb.getSheet(sheetName);   XSSFRow row = sheet.getRow(0);
	   int totalRows = sheet.getPhysicalNumberOfRows();   int totalCols = row.getLastCellNum(); //2
	   data = new String [totalRows-1][totalCols];   Cell cell;
	   for (int i = 1; i < totalRows; i++) {
	    for (int j = 0; j < totalCols; j++) {
	     row = sheet.getRow(i);
	     cell = row.getCell(j);
	     cell.getStringCellValue();     //System.out.println(cell.getStringCellValue());
	     data[i-1][j] = cell.getStringCellValue();    }
	   }
	  } catch (Exception e) {
	   System.out.println("hello");
	  }  return data;
	 }
	}

}
