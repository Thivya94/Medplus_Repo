package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData 
{
	public static String ICD_numbers = "";
	public static String ICD_code = "";
	public static String ICD_name = "";

	public void readExcel(int rowcount,String PageName) throws IOException
	{

		//Create an object of File class to open xlsx file

		File src =    new File(System.getProperty("user.dir") + "\\TestData\\TestData_JAVA.xlsx");

		//Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(src);
		Workbook Excel_Workbook = new XSSFWorkbook(inputStream);
		
		
//		if (PageName == "Login_credentials")
//		{
//
//			Sheet ExcelSheet = Excel_Workbook.getSheet(PageName);
//
//
//			for (int j = rowcount; j <= rowcount; j++)
//			{
//				username_value = ExcelSheet.getRow(j).getCell(0).getStringCellValue();
//				Password_value = ExcelSheet.getRow(j).getCell(1).getStringCellValue();
//
//			}
//		}
		if (PageName == "ICD")
		{

			Sheet ExcelSheet = Excel_Workbook.getSheet(PageName);


			for (int j = rowcount; j <= rowcount; j++)
			{
				ICD_numbers = ExcelSheet.getRow(j).getCell(0).getStringCellValue();
				ICD_code = ExcelSheet.getRow(j).getCell(1).getStringCellValue();
				ICD_name= ExcelSheet.getRow(j).getCell(2).getStringCellValue();

			}
		}
		Excel_Workbook.close();
	}

}
