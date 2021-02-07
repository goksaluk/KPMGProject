package com.kpmg.pages;

import com.kpmg.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    //This abstract class contains common locators and methods of all pages

    public BasePage() { PageFactory.initElements(Driver.get(), this);
    }

    //@FindBy(tagName = "title")

    /**
     * Wait for proper page title
     *
     * @param pageTitle
     */
    public void waitForPageTitle(String pageTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.titleIs(pageTitle));

    }



}
