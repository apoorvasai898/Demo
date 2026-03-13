package Excelutility;


	

	import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class Excelutiltiy 
	{

		
		public String getExceldemo(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis =new FileInputStream("./src/main/resources/Testdata/login.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("login");
			Row row = sh.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			String data=cell.getStringCellValue();
			return data;
			
		}
		public static void getExcelemp(String Sheetname,int rownum,int cellnum,String orderId) throws EncryptedDocumentException, IOException
		
		{
			FileInputStream fis = new FileInputStream("./src/main/resources/Testdata/OrderId.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("OrderId");

		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellType(CellType.STRING);

		cell.setCellValue(orderId);

		FileOutputStream fos = new FileOutputStream("./src/main/resources/Testdata/OrderId.xlsx");
		wb.write(fos);

		wb.close();
		fos.close();
		
		
		}
		
	}


