package com.kpmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecificProductPage extends BasePage {

   @FindBy(xpath = "//h1[text()='Shampoo']")
    public WebElement pageSubtitle;

    @FindBy(xpath = "//*[starts-with(@alt,'Aveda Shampure')]")
    public WebElement avedaShampureElement;


}
