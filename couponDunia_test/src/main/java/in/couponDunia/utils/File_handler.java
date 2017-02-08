package in.couponDunia.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.google.common.collect.Table.Cell;

/*
 * @Author :- vipin sagar
 * @CreationDate :-02/07/2017*/


public class File_handler {

	public String filepath;
	public FileInputStream ipStream ;
	public FileOutputStream opStream;
	private Workbook wbook;
	private Sheet sheet;
	private Row row;
	private Cell cel;



	// to set the file path of excel sheet
	public void setfile(String filepath)
	{
		try {
			ipStream = new FileInputStream(filepath);
			wbook = WorkbookFactory.create(ipStream);
			sheet = wbook.getSheetAt(0);
			ipStream.close();			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (Exception e) {			
			e.printStackTrace();
		} 

	}

	//get total number of rows in a sheet
	public int get_total_no_of_rows(String wsName)
	{
		int sheetIndex = wbook.getSheetIndex(wsName);
		if(sheetIndex == -1)return 0;	
		else
		{
			sheet =wbook.getSheetAt(sheetIndex);
			int rowCount =sheet.getLastRowNum()+1;
			return rowCount;
		}
	}

	// to get number of column in a sheet
	public int get_total_number_of_column(String wsName)
	{
		int sheetIndex = wbook.getSheetIndex(wsName);
		if(sheetIndex == -1)return 0;	
		else
		{
			sheet =wbook.getSheetAt(sheetIndex);
			int cellCount =sheet.getRow(0).getLastCellNum();					
			return cellCount;
		}
	}

	
	// to retrieve a Data from file 	
	public String get_file_data(String wsName,int rowNo,int colNo)
	{
		try
		{
		int sheetNum = wbook.getSheetIndex(wsName);
		sheet =wbook.getSheetAt(sheetNum);
		row = sheet.getRow(rowNo);
		return row.getCell(colNo).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("fail to fetch data!");
			e.printStackTrace();
			return null;
		}
	}

}
