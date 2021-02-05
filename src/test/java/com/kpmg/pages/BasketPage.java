package com.kpmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Basket']")
    public WebElement pageSubtitle;

    @FindBy(xpath = "//*[text()='Remove item']")
    public WebElement removeItem;

    @FindBy(xpath = "//*[text()='Your basket is empty.']")
    public WebElement basketIsEmptyElement;


}
