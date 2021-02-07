package com.kpmg.pages;

import com.kpmg.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

    @FindBy(css = "[data-test='page-heading']")
    public WebElement pageSubTitle;

    @FindBy(xpath = "//*[text()='Start shopping']")
    public WebElement startShopping;

    public String getPageSubTitle() {
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }



}
