package com.kpmg.pages;

import com.kpmg.utilities.BrowserUtils;
import com.kpmg.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecificProductPage extends BasePage {


    /*
        This method contains some String manipulations. Because all letters except
        the first letter of the part of page title must be converted to lowercase for locator.
     */
    public void verifyProductPageSubtitle(String partOfPageSubtitle) {
        int index= partOfPageSubtitle.length();
        String caseSubtitle = partOfPageSubtitle.charAt(0) + partOfPageSubtitle.substring(1, index).toLowerCase();
        String locatorElement = "//h1[text()='"+caseSubtitle+"']";
        WebElement product = Driver.get().findElement(By.xpath(locatorElement));
        BrowserUtils.waitForVisibility(product, 10);
        Assert.assertTrue(product.getText().contains(partOfPageSubtitle));
    }


    //To get exact product
    public void getProduct(String productName) {
        String locatorElement = "//*[starts-with(@alt,'"+productName+"')]";
        WebElement product = Driver.get().findElement(By.xpath(locatorElement));
        product.click();
    }
}
