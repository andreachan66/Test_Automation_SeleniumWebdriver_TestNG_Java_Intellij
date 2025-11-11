package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utilities.ActionsUtility.sendKeys;
import static Utilities.GetUtility.getText;
import static Utilities.JavaScriptUtility.scrollToElementJS;
import static Utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{

    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By submitBtn = By.cssSelector("#submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    private By fullNameTextBox = By.xpath("//input[@placeholder='Full Name']");

    private By outputAddress = By.id("output");

    public String getOutputAddress(){
        return find(outputAddress).getText();
    }

    public void setFullNameTextBox(String fullName){
        find(fullNameTextBox).sendKeys(fullName);
    }
    
    public String getCurrentAddress(){
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }

    public void clickSubmitBtn(){
        scrollToElementJS(submitBtn);
        click(submitBtn);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress(String address){
        find(currentAddressField).sendKeys(address + Keys.ENTER);
        set(currentAddressField, address);
    }

    public void setFullName(String name){
        scrollToElementJS(fullNameField);
        Actions act = new Actions(driver);
        act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setName(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void set(By locator, String text){
        //find(locator).clear();
        find(locator).sendKeys(text);
    }
}
