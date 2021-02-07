package com.kpmg.step_definitions;

import com.kpmg.pages.*;
import com.kpmg.utilities.BrowserUtils;
import com.kpmg.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class KPMGStepDefinitions {

    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    BasketPage basketPage = new BasketPage();
    CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    SpecificProductPage specificProductPage = new SpecificProductPage();
    TypeAndQuantityPage typeAndQuantityPage = new TypeAndQuantityPage();
    WelcomePage welcomePage = new WelcomePage();

    @Given("the user allows all cokies")
    public void the_user_allows_all_cokies() {
        homePage.allowAllCokies.click();
    }

    @And("the user able to see page title as {string}")
    public void theUserAbleToSeePageTitleAs(String pageTitle) {
        homePage.waitForPageTitle(pageTitle);
        Assert.assertEquals(pageTitle, Driver.get().getTitle());
    }

    @Then("the user clicks sign in buttton")
    public void the_user_clicks_sign_in_buttton() {
        homePage.signInButton.click();

    }

    @And("the user able to see the sign in page subtitle as {string}")
    public void theUserAbleToSeeTheSignInPageSubtitleAs(String pageSubtitle) {
        BrowserUtils.waitForVisibility(signInPage.pageSubtitle, 5);
        Assert.assertEquals(pageSubtitle, signInPage.getPageSubTitle());

    }

    @When("fills credentials and clicks on the create an account button")
    public void clicks_on_the_create_an_account_button() {
        signInPage.validCredentials();
        signInPage.createAnAccountButton.click();

    }

    @Then("the user navigate to create an account page")
    public void theUserNavigateToCreateAnAccountPage() {
        BrowserUtils.waitForVisibility(createAnAccountPage.pageSubTitle, 10);
        String ExpectedSubtTitle = "CREATE AN ACCOUNT";
        Assert.assertEquals(ExpectedSubtTitle, createAnAccountPage.pageSubTitle.getText());
    }

    @When("the user selects the subscribe to all button")
    public void the_user_selects_the_subscribe_to_all_button() {
        createAnAccountPage.withValidCredentials();
        createAnAccountPage.subscribeToAllButtton.click();
    }

    // Click with javaScript is more efficient in some cases
    @When("then the user clicks create account button")
    public void then_the_user_clicks_create_account_button() {
        BrowserUtils.clickWithJS(createAnAccountPage.createAccountButton);

    }

    @Then("the user navigate to account created page and see page subtitle as {string}")
    public void theUserNavigateToAccountCreatedPageAndSeePageSubtitleAs(String pageSubtitle) throws InterruptedException {
        BrowserUtils.waitForVisibility(accountCreatedPage.pageSubtitle, 25);
        Thread.sleep(5000);
        Assert.assertEquals(pageSubtitle, accountCreatedPage.pageSubtitle.getText());

    }

    @Then("clicks joinn for free button")
    public void clicks_joinn_for_free_button() {
        accountCreatedPage.joinForFreeButton1.click();

    }

    @Then("the user insert all valid information on the form")
    public void the_user_insert_all_valid_information_on_the_form() {
        accountCreatedPage.validUserInformation();
    }

    @Then("clicks I agree button")
    public void clicks_I_agree_button() {
        accountCreatedPage.termsConditions.click();

    }

    @When("the user clicks join for free button")
    public void the_user_clicks_join_for_free_button() {
        BrowserUtils.clickWithJS(accountCreatedPage.joinForFreeButton2);
        // accountCreatedPage.joinForFreeButton2.click();

    }

    @Then("the user navigate to welcome page and see page subtitle as {string}")
    public void theUserNavigateToWelcomePageAndSeePageSubtitleAs(String expectedPageSubTitle) throws InterruptedException {
        BrowserUtils.waitForVisibility(welcomePage.pageSubTitle, 20);
        Thread.sleep(5000);
        Assert.assertEquals(expectedPageSubTitle, welcomePage.getPageSubTitle());

    }

    @Then("clicks start shopping button")
    public void clicks_start_shopping_button() {
        welcomePage.startShopping.click();

    }

    @Then("hover to {string} module")
    public void hover_to_module(String module) {
        homePage.navigateToModule(module);
    }

    @Then("the user selects for {string} product")
    public void the_user_selects_for_product(String productName) throws InterruptedException {
        homePage.hoverToProductAndClick(productName);
    }


    //The assertion of the following method was done on the SpecificProductPage
    @And("then the user navigates to shampoo page and see the part of page subtitle as {string}")
    public void thenTheUserNavigatesToShampooPageAndSeePageSubtitleAs(String partOfPageSubTitle) {
        specificProductPage.verifyProductPageSubtitle(partOfPageSubTitle);


    }

    @When("the user clicks particular product's name start with {string}")
    public void the_user_clicks_Particular_Product_start_with(String produtName) {
        specificProductPage.getProduct(produtName);
    }


    @Then("reaches the quantity page named {string}")
    public void reachesTheQuantityPageNamed(String pageSubtitle) {
        typeAndQuantityPage.verifyQuantityPageSubtitle(pageSubtitle);
    }

    // This step displays whether the product's size is available or not.
    @Then("the user select size for product")
    public void the_user_select_size_for_aveda_shapure() {

        try {
            typeAndQuantityPage.size.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // This step displays whether the product's plusSign is available or not.
    @Then("clicks plus sign")
    public void clicks_plus_sign() {
        BrowserUtils.waitForClickablility(typeAndQuantityPage.plusSign, 20);
        if (typeAndQuantityPage.plusSign.isDisplayed()) {
            typeAndQuantityPage.plusSign.click();
        } else {
            typeAndQuantityPage.addToBasket.isEnabled();
        }
    }

    @Then("adds to basket")
    public void adds_to_his_her_basket() {
        typeAndQuantityPage.addToBasket.click();
    }

    @When("goes to basket")
    public void goes_to_his_her_basket() {
        BrowserUtils.waitForClickablility(typeAndQuantityPage.goToBasket, 7);
        typeAndQuantityPage.goToBasket.click();
    }

    @Then("finally the user reach to basket page and see page subtitle as {string}")
    public void finallyTheUserReachToBasketPageAndSeePageSubtitleAs(String expectedPageSubTitle) {
        BrowserUtils.waitForVisibility(basketPage.pageSubtitle, 15);
        Assert.assertEquals(expectedPageSubTitle, basketPage.pageSubtitle.getText());
    }

    @Then("but the user remove this product")
    public void but_the_user_remove_this_product() {
        basketPage.removeItem.click();

    }

    @And("the user able to see that basket is empty")
    public void theUserAbleToSeeThatBasketIsEmpty() {
        BrowserUtils.waitForVisibility(basketPage.basketIsEmptyElement, 10);
        String expectedResult = "Your basket is empty.";
        Assert.assertEquals(expectedResult, basketPage.basketIsEmptyElement.getText());

    }

}
