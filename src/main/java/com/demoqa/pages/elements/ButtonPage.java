package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.*;

public class ButtonPage extends ElementsPage{
    private By homeCheckBox = By.xpath("//span[text()='Home']");
    private By pgButton = By.id("item-4");
    private By btnDoubleClickMe = By.xpath("//button[text()='Double Click Me']");
    private By btnRightClickMe = By.xpath("//button[text()='Right Click Me']");
    private By btnClickMe = By.xpath("//button[text()='Click Me']");
    private By resultDoubleClick = By.xpath("//p[@id='doubleClickMessage']");
    private By resultRightClick = By.id("rightClickMessage");
    private By resultDynamicClick = By.id("dynamicClickMessage");

    public void rightClick(){
        scrollToElementJS(btnRightClickMe);
        rightClickJS(btnRightClickMe);
    }

    public void ClickMe(){
        scrollToElementJS(btnClickMe);
        find(btnClickMe).click();
    }

    public String getSingleClickResult(){
        return find(resultDynamicClick).getText();
    }

    public String getBtnRightClickResult(){
        return  find(resultRightClick).getText();
    }

    public void setBtnDoubleClickMe() {
        scrollToElementJS(btnDoubleClickMe);
        doubleClickJS(btnDoubleClickMe);
        find(btnDoubleClickMe).click();
    }

    public String getBtnDoubleClickResult(){
        return  find(resultDoubleClick).getText();
    }


}
