package com.kpmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "[data-test='allow-all']")
    public WebElement allowAllCokies;

    @FindBy(xpath = "//title[text()='John Lewis & Partners | Homeware, Fashion, Electricals & More']")
    public WebElement pageTitle;

    @FindBy(xpath = "(//a[text()='Sign in'])[2]")
    public WebElement signInButton;

}
