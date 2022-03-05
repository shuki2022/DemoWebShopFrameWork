package com.demowebshop.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementUtil {
    private WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);

    }

    public void doClick(By locator) {
        getElement(locator).click();

    }

    public void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);

    }

    public boolean doIsDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public boolean doIsSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public String doGetText(By locator) {
        return getElement(locator).getText();
    }
    public boolean doIsEnable(By locator){return getElement(locator).isEnabled();}


    public void waitFor(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
