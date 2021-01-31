package com.ilab.uiautomation.pages;

import com.ilab.uiautomation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstJobPostingPage extends TestBase {

    @FindBy(xpath = "//a[@data-wpjb-form='wpjb-form-job-apply']")
    WebElement applyonline;
    @FindBy(id = "applicant_name")
    WebElement name;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "phone")
    WebElement phone;
    @FindBy(id = "wpjb_submit")
    WebElement send;
    @FindBy(xpath = "//ul[@class='wpjb-errors']/li")
    WebElement error;

    public FirstJobPostingPage() {

        PageFactory.initElements(driver, this);
    }

    public WebElement clickApplyOnline(String xname,String xemail,String xphoneNumber) {
        applyonline.click();
        name.sendKeys(xname);
        email.sendKeys(xemail);
        phone.sendKeys(xphoneNumber);
        send.click();
        return error;
    }
}
