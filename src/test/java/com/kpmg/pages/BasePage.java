package com.kpmg.pages;

import com.kpmg.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    //This abstract class contains common locators and methods of all pages

    public BasePage() { PageFactory.initElements(Driver.get(), this);
    }

    //@FindBy(tagName = "title")



}
