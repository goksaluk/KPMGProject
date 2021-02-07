package com.kpmg.pages;

import com.kpmg.utilities.BrowserUtils;
import com.kpmg.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypeAndQuantityPage extends BasePage {


    @FindBy(xpath = "(//h1[text()='Aveda Shampure™ Nurturing Shampoo'])[2]")
    public WebElement pageSubtitle;

    @FindBy(xpath = "(//a[@class='size-link'])[1]")
    public WebElement size;

    //@FindBy(xpath = "(//*[@class='minus-sign'])[2]")
    @FindBy(css = "[class='quantity-increase-button']")
    public WebElement plusSign;

    @FindBy(id = "button--add-to-basket")
    public WebElement addToBasket;

    @FindBy(xpath = "//a[text()='Go to your basket']")
    public WebElement goToBasket;

    public void verifyQuantityPageSubtitle(String pageSubtitle) {
        String locatorElement = "(//h1[text()='"+ pageSubtitle +"'])[2]";
        WebElement subtitle = Driver.get().findElement(By.xpath(locatorElement));
        BrowserUtils.waitForVisibility(subtitle, 10);
        Assert.assertEquals(pageSubtitle, subtitle.getText());
    }

}
