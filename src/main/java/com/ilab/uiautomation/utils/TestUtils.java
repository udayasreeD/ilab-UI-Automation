package com.ilab.uiautomation.utils;

import com.ilab.uiautomation.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.ilab.uiautomation.constants.Constants.*;

public class TestUtils extends TestBase {
    public static String TEST_DATA_SHEET_PATH = PROJECTPATH+TESTDATA;
    public static Workbook book;
    public static Sheet sheet;
    public static void takeScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(PROJECTPATH + SCREENSHOTS + System.currentTimeMillis() + PNG));
    }
    public static Object[][] readData(String sheetName)
    {
        FileInputStream file = null;
        try
        {
            file = new FileInputStream(TEST_DATA_SHEET_PATH);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            book = WorkbookFactory.create(file);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        System.out.println(sheet.getRow(0).getLastCellNum());
        for(int i = 0; i < sheet.getLastRowNum(); i++)
        {
            for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++)
            {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
            }
        }
        return data;
    }
}
