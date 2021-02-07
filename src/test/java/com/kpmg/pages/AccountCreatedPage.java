package com.kpmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {

    @FindBy(css = "[data-test='page-heading']")
    public WebElement pageSubtitle;

    @FindBy(xpath = "//span[text()='Join for free']")
    public WebElement joinForFreeButton1;

    @FindBy(id = "title")
    public WebElement title;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "houseNameOrNumber")
    public WebElement houseNameOrNumber;

    @FindBy(id = "addressLine1")
    public WebElement addressLine1;

    @FindBy(id = "addressLine2")
    public WebElement addressLine2;

    @FindBy(id = "townOrCity")
    public WebElement townOrCity;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(css = "[for='termsConditions']")
    public WebElement termsConditions;

    @FindBy(xpath = "//button[text()='Join for free']")
    public WebElement joinForFreeButton2;


    //filling form with valid information
    public void validUserInformation(){
        title.sendKeys("Mr");
        firstName.sendKeys("Johm");
        lastName.sendKeys("Smith");
        phoneNumber.sendKeys("07768974567");
        houseNameOrNumber.sendKeys("72");
        addressLine1.sendKeys("Chuch Street");
        addressLine2.sendKeys("Flat 6");
        townOrCity.sendKeys("Manchester");
        postcode.sendKeys("M8 5SH");
    }




}
