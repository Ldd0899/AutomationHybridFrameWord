package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class UtilKits extends BaseTest {
//	static FileInputStream fis=null;
//	public static HashMap<String , String>getTestDataFromExcel(String testCase){
//		
//	
//	try {
//		fis=new FileInputStream("src\\test\\resources\\testdata\\excels\\ExternalTextData.xlsx");
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	XSSFWorkbook wb=null;
//	try {
//		wb = new XSSFWorkbook(fis);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	XSSFSheet ws =wb.getSheet("testdata");
//	ArrayList<Row>testCaseRow=getTestCaseRow(ws,testCase);
//	HashMap<String , String>testDataMap=new HashMap<String , String>();
//	for(int i =0 ; i<testCaseRow.size();i++) {
//		int noOFCells=testCaseRow.get(i).getLastCellNum();
//		for (int j=1; j<noOFCells;j++) {
//			testDataMap.put(testCaseRow.get(0).getCell(j).getStringCellValue(),
//					testCaseRow.get(1).getCell(j).getStringCellValue());
//		}
//	}
//	
//	return testDataMap;
//	
//	}
//	private static ArrayList<Row>getTestCaseRow(XSSFSheet ws , String testCase){
//		ArrayList<Row>allRows=new ArrayList<Row>();
//		for(int i=0; i<ws.getLastRowNum() ; i++) {
//			if(ws.getRow(i)!=null) {
//				allRows.add(ws.getRow(i));
//			}
//			
//		}
//		ArrayList<Row>testCaseRow=new ArrayList<>();
//		for (int i=0;i<allRows.size();i++) {
//			if(allRows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testCase));
//			testCaseRow.add(allRows.get(i));
//		}
//		return testCaseRow;
//		
//	}
	public static HashMap<String, String> getTestDataFromExcel(String testCase) {

        HashMap<String, String> testDataMap = new HashMap<>();
        DataFormatter formatter = new DataFormatter();

        try (FileInputStream fis = new FileInputStream(
                "src\\test\\resources\\testdata\\excels\\ExternalTextData.xlsx");
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            XSSFSheet ws = wb.getSheet("testdata");

            ArrayList<Row> testCaseRows = getTestCaseRow(ws, testCase);

            if (testCaseRows.size() < 2) {
                throw new RuntimeException("Test data not found for: " + testCase);
            }

            Row headerRow = testCaseRows.get(0);
            Row dataRow = testCaseRows.get(1);

            int noOfCells = headerRow.getLastCellNum();

            for (int j = 1; j < noOfCells; j++) {

                String key = formatter.formatCellValue(headerRow.getCell(j));
                String value = formatter.formatCellValue(dataRow.getCell(j));

                testDataMap.put(key, value);
            }

        } catch (IOException e) {
            throw new RuntimeException("Excel reading failed", e);
        }

        return testDataMap;
    }

    private static ArrayList<Row> getTestCaseRow(XSSFSheet ws, String testCase) {

        ArrayList<Row> testCaseRow = new ArrayList<>();

        for (int i = 0; i <= ws.getLastRowNum(); i++) {

            Row row = ws.getRow(i);

            if (row != null) {
                String cellValue = new DataFormatter()
                        .formatCellValue(row.getCell(0));

                if (cellValue.equalsIgnoreCase(testCase)) {
                    testCaseRow.add(row);
                }
            }
        }

        return testCaseRow;
    }public static String getScreenshot()
    {
    	String pattern = "yyyy-MM-dd HH:mm:ss";
    	SimpleDateFormat simapleDateFormat = new SimpleDateFormat(pattern);
    	String date = simapleDateFormat.format(new Date());
    	date = date.replace(":", "-");;
    	System.out.println(date);
    	String screenshotFilePath=System.getProperty("user.dir")+"\\screenshots\\"+date+".png";
    	File screenshotFile = new File(screenshotFilePath);
    	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
    	try {
    		FileUtils.copyFile(srcFile ,screenshotFile );
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	
    	return null;
    	}

}
