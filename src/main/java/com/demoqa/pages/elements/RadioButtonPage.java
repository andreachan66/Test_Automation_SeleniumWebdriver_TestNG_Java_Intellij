package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class RadioButtonPage extends ElementsPage{
    private By yesRadio = By.xpath("//label[@for='yesRadio']"); //By.id("yesRadio");
    private By impressRadio = By.xpath("//label[@for='impressiveRadio']");  //By.id("impressiveRadio");

    private By yesResult = By.xpath("//span[text()='Yes']");
    private By impressResult = By.xpath("//span[text()='Impressive']");

    public void clickYes(){
        scrollToElementJS(yesRadio);
        click(yesRadio);
    }

    public void clickImpress(){
        scrollToElementJS(impressRadio);
        click(impressRadio);
    }

    public String getYesResult(){
        return find(yesResult).getText();
    }

    public String getImpressResult(){
        return find(impressResult).getText();
    }
}
