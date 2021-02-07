package com.kpmg.pages;

import com.kpmg.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "[data-test='allow-all']")
    public WebElement allowAllCokies;

    @FindBy(xpath = "(//a[text()='Sign in'])[2]")
    public WebElement signInButton;

    Actions actions = new Actions(Driver.get());

    //This method allows to locate for all modules dynamically.
    public void navigateToModule(String moduleName) {
        String moduleLocator = "(//*[normalize-space()='"+moduleName+"'])[2]";
        WebElement module =Driver.get().findElement(By.xpath(moduleLocator));
        actions.moveToElement(module).perform();
    }

    //Action class allow to interact with hover elements.
    public void hoverToProductAndClick(String productName) throws InterruptedException {
        Thread.sleep(3000);
        WebElement product =Driver.get().findElement(By.xpath("(//ul[@class='navigation-items--cc199']//a[text()='"+ productName +"'])[1]"));
        actions.click(product).build().perform();
    }


}
