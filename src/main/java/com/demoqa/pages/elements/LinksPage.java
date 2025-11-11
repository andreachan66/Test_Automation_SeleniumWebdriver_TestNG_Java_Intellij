package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage {
    private By badRequestLink = By.id("bad-request"); // By.xpath("//*[@id='bad-request']");
    private By responseLink = By.id("linkResponse"); //By.xpath("//*[@id='linkResponse']");

    public void clickBadRequestLink(){
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }
}
