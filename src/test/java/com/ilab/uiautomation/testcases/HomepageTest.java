package com.ilab.uiautomation.testcases;

import com.ilab.uiautomation.base.TestBase;
import com.ilab.uiautomation.pages.HomePage;
import com.ilab.uiautomation.utils.TestUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.ilab.uiautomation.constants.Constants.CAREERSTITLE;

public class HomepageTest extends TestBase {
    HomePage homePage;

    public HomepageTest() {
        super();
    }

    @Test(description = "clicking careers link")
    public void verifyClickCareers() throws IOException {
        homePage = new HomePage();
        TestUtils.takeScreenShot();
        homePage.clickCareers();
        Assert.assertEquals(driver.getTitle(),CAREERSTITLE);
    }
}
