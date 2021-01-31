package com.ilab.uiautomation.testcases;

import com.ilab.uiautomation.base.TestBase;
import com.ilab.uiautomation.pages.FirstJobPostingPage;
import com.ilab.uiautomation.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.ilab.uiautomation.constants.Constants.FIRSTJOBPOSTPAGETITLE;
import static com.ilab.uiautomation.constants.Constants.SHEETNAME;

public class FirstJobPostingTest extends TestBase {
    FirstJobPostingPage firstJobPostingPage;

    public FirstJobPostingTest(){
        super();
    }
    @DataProvider
    public Object[][] getTestData() {
        Object data[][] = TestUtils.readData(SHEETNAME);
        return data;
    }
    @Test(dataProvider = "getTestData" , description = "Apply online")
    public void verifyApplyOnline(String name,String email,String phoneNumber) {
        firstJobPostingPage = new FirstJobPostingPage();
        WebElement error = firstJobPostingPage.clickApplyOnline(name,email,phoneNumber);
        Assert.assertTrue(error.isDisplayed(),FIRSTJOBPOSTPAGETITLE);
}
}
