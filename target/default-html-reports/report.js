$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/kpmg.feature");
formatter.feature({
  "name": "KPMG Scenarios",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@kpmg"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Positive scenario one",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "hover to \"\u003ctypeNameOfProduct\u003e\" module",
  "keyword": "And "
});
formatter.step({
  "name": "the user selects for \"\u003cproduct\u003e\" product",
  "keyword": "And "
});
formatter.step({
  "name": "then the user navigates to shampoo page and see the part of page subtitle as \"\u003cpartOfpageSubtitle\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks particular product\u0027s name start with \"\u003cpartNameOfParticularProduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "reaches the quantity page named \"\u003cpasticularProductPageSubtitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the user select size for product",
  "keyword": "And "
});
formatter.step({
  "name": "clicks plus sign",
  "keyword": "And "
});
formatter.step({
  "name": "adds to basket",
  "keyword": "And "
});
formatter.step({
  "name": "goes to basket",
  "keyword": "When "
});
formatter.step({
  "name": "finally the user reach to basket page and see page subtitle as \"BASKET\"",
  "keyword": "Then "
});
formatter.step({
  "name": "but the user remove this product",
  "keyword": "And "
});
formatter.step({
  "name": "the user able to see that basket is empty",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "typeNameOfProduct",
        "product",
        "partOfpageSubtitle",
        "partNameOfParticularProduct",
        "pasticularProductPageSubtitle"
      ]
    },
    {
      "cells": [
        "Electricals",
        "Kettles",
        "KETTLES",
        "Dualit Dom",
        "Dualit Dome Kettle, Black/Steel"
      ]
    }
  ]
});
formatter.background({
  "name": "Homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user allows all cokies",
  "keyword": "Given "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_allows_all_cokies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user able to see page title as \"John Lewis \u0026 Partners | Homeware, Fashion, Electricals \u0026 More\"",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.theUserAbleToSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks sign in buttton",
  "keyword": "Then "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_clicks_sign_in_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user able to see the sign in page subtitle as \"SIGN IN\"",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.theUserAbleToSeeTheSignInPageSubtitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills credentials and clicks on the create an account button",
  "keyword": "When "
});
formatter.match({
  "location": "KPMGStepDefinitions.clicks_on_the_create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigate to create an account page",
  "keyword": "Then "
});
formatter.match({
  "location": "KPMGStepDefinitions.theUserNavigateToCreateAnAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects the subscribe to all button",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_selects_the_subscribe_to_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then the user clicks create account button",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.then_the_user_clicks_create_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigate to account created page and see page subtitle as \"ACCOUNT CREATED\"",
  "keyword": "Then "
});
formatter.match({
  "location": "KPMGStepDefinitions.theUserNavigateToAccountCreatedPageAndSeePageSubtitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks joinn for free button",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.clicks_joinn_for_free_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user insert all valid information on the form",
  "keyword": "Then "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_insert_all_valid_information_on_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks I agree button",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.clicks_I_agree_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks join for free button",
  "keyword": "When "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_clicks_join_for_free_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigate to welcome page and see page subtitle as \"WELCOME\"",
  "keyword": "Then "
});
formatter.match({
  "location": "KPMGStepDefinitions.theUserNavigateToWelcomePageAndSeePageSubtitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks start shopping button",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.clicks_start_shopping_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user able to see page title as \"John Lewis \u0026 Partners | Homeware, Fashion, Electricals \u0026 More\"",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.theUserAbleToSeePageTitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Positive scenario one",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@kpmg"
    }
  ]
});
formatter.step({
  "name": "hover to \"Electricals\" module",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.hover_to_module(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects for \"Kettles\" product",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_selects_for_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then the user navigates to shampoo page and see the part of page subtitle as \"KETTLES\"",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.thenTheUserNavigatesToShampooPageAndSeePageSubtitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks particular product\u0027s name start with \"Dualit Dom\"",
  "keyword": "When "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_clicks_Particular_Product_start_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "reaches the quantity page named \"Dualit Dome Kettle, Black/Steel\"",
  "keyword": "Then "
});
formatter.match({
  "location": "KPMGStepDefinitions.reachesTheQuantityPageNamed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user select size for product",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.the_user_select_size_for_aveda_shapure()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks plus sign",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.clicks_plus_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds to basket",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.adds_to_his_her_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "goes to basket",
  "keyword": "When "
});
formatter.match({
  "location": "KPMGStepDefinitions.goes_to_his_her_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "finally the user reach to basket page and see page subtitle as \"BASKET\"",
  "keyword": "Then "
});
formatter.match({
  "location": "KPMGStepDefinitions.finallyTheUserReachToBasketPageAndSeePageSubtitleAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "but the user remove this product",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.but_the_user_remove_this_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user able to see that basket is empty",
  "keyword": "And "
});
formatter.match({
  "location": "KPMGStepDefinitions.theUserAbleToSeeThatBasketIsEmpty()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});