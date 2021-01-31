package com.ilab.uiautomation.testcases;

import com.ilab.uiautomation.base.TestBase;
import com.ilab.uiautomation.pages.CurrentOpeningPage;
import com.ilab.uiautomation.utils.TestUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class CurrentOpeningTest extends TestBase {
    CurrentOpeningPage currentOpeningPage;

    public CurrentOpeningTest() {
        super();
    }

    @Test(description = "clicking first job posting")
    public void verifyClickFirstJobPosting() throws IOException {
        currentOpeningPage = new CurrentOpeningPage();
        TestUtils.takeScreenShot();
        currentOpeningPage.clickFirstJobPosting();
    }

}
