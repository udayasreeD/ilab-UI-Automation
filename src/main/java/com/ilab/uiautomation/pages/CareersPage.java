package com.ilab.uiautomation.pages;

import com.ilab.uiautomation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends TestBase {

    @FindBy(xpath = "//a[text()='South Africa']")
    WebElement southAfricaLink;

    public CareersPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSouthAfricaLink() {
        southAfricaLink.click();
    }
}
