package com.kpmg.step_definitions;

import com.kpmg.pages.*;
import com.kpmg.utilities.BrowserUtils;
import com.kpmg.utilities.Driver;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class KPMGStepDefinitions {

    AccountCreatedPage accountCreatedPage =new AccountCreatedPage();
    BasketPage basketPage = new BasketPage();
    CreateAnAccountPage createAnAccountPage =new CreateAnAccountPage();
    HomePage homePage = new HomePage();
    MainProductsPage mainProductsPage = new MainProductsPage();
    SignInPage signInPage = new SignInPage();
    SpecificProductPage specificProductPage =new SpecificProductPage();
    TypeAndQuantityPage typeAndQuantityPage =new TypeAndQuantityPage();
    WelcomePage welcomePage = new WelcomePage();

    @Given("the user allows all cokies")
    public void the_user_allows_all_cokies() {
        homePage.allowAllCokies.click();
    }

    @Given("the user on the home page")
    public void the_user_on_the_home_page() {
        String expectedPageTitle = "John Lewis & Partners | Homeware, Fashion, Electricals & More";
        System.out.println("titleeee :"+ homePage.pageTitle.getText());
       Assert.assertEquals(expectedPageTitle, Driver.get().getTitle());



    }

    @Then("the user clicks sign in buttton")
    public void the_user_clicks_sign_in_buttton() {
        homePage.signInButton.click();

    }

    @Then("the user is on the sign in page")
    public void the_user_is_on_the_sign_in_page() {

        String expectedPageSubTitle= "SIGN IN";
        BrowserUtils.waitForVisibility(signInPage.pageSubTitle, 5);
        Assert.assertEquals(expectedPageSubTitle, signInPage.pageSubTitle.getText());

    }

    @When("fills credentials and clicks on the create an account button")
    public void clicks_on_the_create_an_account_button() {
        signInPage.validCredentials();
        signInPage.createAnAccountButton.click();

    }

    @Then("the user navigate to create an account page")
    public void theUserNavigateToCreateAnAccountPage() {
        BrowserUtils.waitForVisibility(createAnAccountPage.pageSubTitle,10);
        String ExpectedSubtTitle = "CREATE AN ACCOUNT";
        Assert.assertEquals(ExpectedSubtTitle,createAnAccountPage.pageSubTitle.getText());
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

    @Then("the user navigate to account created page")
    public void the_user_navigate_to_account_created_page() throws InterruptedException {
        BrowserUtils.waitForVisibility(accountCreatedPage.pageSubtitle,25);
        Thread.sleep(5000);
        String expectedSubtitle = "ACCOUNT CREATED";
        Assert.assertEquals(expectedSubtitle, accountCreatedPage.pageSubtitle.getText());

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
        accountCreatedPage.joinForFreeButton2.click();

    }

    @Then("the user navigate to welcome page")
    public void the_user_navigate_to_welcome_page() throws InterruptedException {
        BrowserUtils.waitForVisibility(welcomePage.pageSubTitle,15);
        String expectedPageSubTitle = "WELCOME";
        Thread.sleep(5000);
        Assert.assertEquals(expectedPageSubTitle, welcomePage.pageSubTitle.getText());

    }

    @Then("clicks start shopping button")
    public void clicks_start_shopping_button() {
        welcomePage.startShopping.click();

    }

    @Then("the user reach to main products page")
    public void the_user_reach_to_main_products_page() {
        BrowserUtils.waitForVisibility(mainProductsPage.searchButton, 15);
        Assert.assertTrue(mainProductsPage.searchButton.isDisplayed());

    }

    @Then("hover to {string} module")
    public void hover_to_module(String module) {
        mainProductsPage.navigateToModule(module);

    }

    @Then("the user selects for shampoo product")
    public void the_user_selects_for_shampoo_product() throws InterruptedException {
        mainProductsPage.hoverToShampooAndClick();
    }

    @Then("then the user navigates to shampoo page")
    public void then_the_user_navigates_to_shampoo_page() {

        BrowserUtils.waitForVisibility(specificProductPage.pageSubtitle,10);
        String expectedPageSubTitle ="SHAMPOO (125)";
        Assert.assertEquals(expectedPageSubTitle, specificProductPage.pageSubtitle.getText());
    }

    @When("the user clicks Aveda Shampure")
    public void the_user_clicks_Aveda_Shampure() {

        specificProductPage.avedaShampureElement.click();

    }

    // This step displays whether the product is available or not. Because of locator!

    @Then("reaching to quantity page")
    public void reaching_to_quantity_page() {
        BrowserUtils.waitForVisibility(typeAndQuantityPage.pageSubtitle,10);
        Assert.assertTrue(typeAndQuantityPage.pageSubtitle.isDisplayed());
    }

    @Then("the user select size for aveda shapure")
    public void the_user_select_size_for_aveda_shapure() {
        typeAndQuantityPage.size.click();
    }

    @Then("clicks plus sign")
    public void clicks_plus_sign() {
        BrowserUtils.waitForClickablility(typeAndQuantityPage.plusSign,5);
        typeAndQuantityPage.plusSign.click();

    }

    @Then("adds to basket")
    public void adds_to_his_her_basket() {
        typeAndQuantityPage.addToBasket.click();
    }

    @When("goes to basket")
    public void goes_to_his_her_basket() {
        BrowserUtils.waitForClickablility(typeAndQuantityPage.goToBasket,7);
        typeAndQuantityPage.goToBasket.click();
    }

    @Then("finally the user reach to basket page")
    public void finally_the_user_reach_to_basket_page() {
        BrowserUtils.waitForVisibility(basketPage.pageSubtitle,15);
        String expectedPageSubTitle ="BASKET";
        Assert.assertEquals(expectedPageSubTitle, basketPage.pageSubtitle.getText());
    }

    @Then("but the user remove this product")
    public void but_the_user_remove_this_product() {
        basketPage.removeItem.click();

    }

    @And("the user able to see that basket is empty")
    public void theUserAbleToSeeThatBasketIsEmpty() {
        BrowserUtils.waitForVisibility(basketPage.basketIsEmptyElement,10);
        String expectedResult = "Your basket is empty.";
        Assert.assertEquals(expectedResult, basketPage.basketIsEmptyElement.getText());

    }
}
