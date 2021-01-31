package com.ilab.uiautomation.pages;

import com.ilab.uiautomation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentOpeningPage extends TestBase {

    @FindBy(xpath = "//div[contains(@class,'wpjb-type-full-time')][1]")
    WebElement firstJob;

    public CurrentOpeningPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickFirstJobPosting() {
        firstJob.click();
    }
}
