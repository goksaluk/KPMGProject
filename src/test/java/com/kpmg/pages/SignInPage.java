package com.kpmg.pages;

import com.github.javafaker.Faker;
import com.kpmg.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {


    @FindBy(css = "[data-test='page-heading']")
    public WebElement pageSubtitle;

    @FindBy(css = "[data-test='create-account-button']>span")
    public WebElement createAnAccountButton;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;


    public String getPageSubTitle() {
        BrowserUtils.waitForStaleElement(pageSubtitle);
        return pageSubtitle.getText();
    }

    //filling sign in page with valid information
    public void validCredentials() {
        Faker faker = new Faker();
        String emailAddress = faker.internet().emailAddress();

        email.sendKeys(emailAddress);
        password.sendKeys("3490Dfr87x/");
    }


}
