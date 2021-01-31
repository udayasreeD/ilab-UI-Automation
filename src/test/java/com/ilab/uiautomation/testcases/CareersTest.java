package com.ilab.uiautomation.testcases;

import com.ilab.uiautomation.base.TestBase;
import com.ilab.uiautomation.pages.CareersPage;
import com.ilab.uiautomation.utils.TestUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.ilab.uiautomation.constants.Constants.CURRENTOPENINGPAGETITLE;

public class CareersTest extends TestBase {
    CareersPage careersPage;
    public CareersTest(){
        super();
    }
    @Test(description = "clicking south africa link")
    public void verifyClickSouthAfricaLink() throws IOException {
        careersPage = new CareersPage();
        TestUtils.takeScreenShot();
        careersPage.clickSouthAfricaLink();
        Assert.assertEquals(driver.getTitle(),CURRENTOPENINGPAGETITLE);
    }
}
