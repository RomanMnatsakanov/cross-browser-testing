package com.andersenlab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenPageTest extends BaseTest {

    @Test
    public void openPage() {
        driver.get("http://www.bbc.com/");
        WebElement element = driver.findElement(By.cssSelector("#orb-search-q"));
        element.sendKeys("Selenium");
        WebElement searchButton = driver.findElement(By.cssSelector("#orb-search-button"));
        searchButton.click();
        String urlActual = driver.getCurrentUrl();
        String urlExpected = "https://www.bbc.co.uk/search?q=selenium";
        Assert.assertEquals(urlActual, urlExpected);
    }

}
