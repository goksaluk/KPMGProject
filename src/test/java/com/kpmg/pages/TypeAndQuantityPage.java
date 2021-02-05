package com.kpmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypeAndQuantityPage extends BasePage {


    @FindBy(xpath = "(//h1[text()='Aveda Shampure™ Nurturing Shampoo'])[2]")
    public WebElement pageSubtitle;

    @FindBy(xpath = "(//a[@class='size-link'])[1]")
    public WebElement size;  // can be dynamic

    @FindBy(xpath = "(//*[@class='minus-sign'])[2]")
    public WebElement plusSign;

    @FindBy(id = "button--add-to-basket")
    public WebElement addToBasket;

    @FindBy(xpath = "//a[text()='Go to your basket']")
    public WebElement goToBasket;

}
