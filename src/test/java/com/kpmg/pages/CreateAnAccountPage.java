package com.kpmg.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage extends BasePage {

    @FindBy(css = "[data-test='page-heading']")
    public WebElement pageSubTitle;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwordCreate")
    public WebElement password;

    @FindBy(css = "[for='marketingPreferencesYes']")
    public WebElement subscribeToAllButtton;

    @FindBy(id = "registerForm")
    public WebElement createAccountButton;

    public void withValidCredentials(){

        Faker faker = new Faker();
        String emailAddress= faker.internet().emailAddress();

        email.sendKeys(emailAddress);
        password.sendKeys("3490Dfr87x/");
    }


}
