package com.ilab.uiautomation.pages;

import com.ilab.uiautomation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[text()='CAREERS']")
    WebElement careers;

    @FindBy(xpath = "//div[contains(@class,'wpjb wpjb-page-index')]//div[1]/div[1]/div[2]")
    WebElement firstJob;

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void clickCareers() {

        careers.click();
    }
}
