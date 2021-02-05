package com.kpmg.pages;

import com.kpmg.utilities.BrowserUtils;
import com.kpmg.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainProductsPage extends BasePage {

    @FindBy(id = "desktopSearch")
    public WebElement searchButton;

    @FindBy(xpath = "(//ul[@class='navigation-items--cc199'])[5]/li[2]/a")
    public WebElement shampoo;

    Actions actions = new Actions(Driver.get());

    public void navigateToModule(String moduleName) {
        String moduleLocator = "(//*[normalize-space()='"+moduleName+"'])[2]";
        WebElement module =Driver.get().findElement(By.xpath(moduleLocator));
        actions.moveToElement(module).perform();
    }

    public void hoverToShampooAndClick() throws InterruptedException {
        Thread.sleep(3000);
        actions.click(shampoo).build().perform();
    }
}
