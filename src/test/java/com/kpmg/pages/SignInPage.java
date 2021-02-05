package com.kpmg.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//h1[text()='Sign in']")
    public WebElement pageSubTitle;

    @FindBy(css = "[data-test='create-account-button']>span")
    public WebElement createAnAccountButton;

    @FindBy(id = "registerForm")
    public WebElement createAccountButton;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    //filling signing page with valid information
    public void validCredentials(){
        Faker faker = new Faker();
        String emailAddress= faker.internet().emailAddress();

        email.sendKeys(emailAddress);
        password.sendKeys("3490Dfr87x/");
    }







}
