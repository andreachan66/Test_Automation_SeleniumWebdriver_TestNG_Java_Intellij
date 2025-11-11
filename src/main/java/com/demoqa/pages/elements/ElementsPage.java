package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath ("//li[@id='item-8']/span[text()='Dynamic Properties']");
    private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");
    private By checkBoxMenuItem = By.xpath("//li[@id='item-1']//span[text()='Check Box']");
    private By buttonItem = By.xpath("//li[@id='item-4']/span[text()='Buttons']");
    private By radioButtonMenuItem = By.xpath("//li[@id='item-2']//span[text()='Radio Button']");
    private By brokenLinkItem = By.xpath("//li[@id='item-6']/span[text()='Broken Links - Images']");

    public TextBoxPage clickTextBox(){
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

    public WebTablesPage clickWebTables(){
        click(webTablesMenuItem);
        return  new WebTablesPage();
    }

    public LinksPage clickLinks(){
        click(linksMenuItem);
        return  new LinksPage();
    }

    public LinkPracticePage clickLinkPractice(){
        click(linksMenuItem);
        return new LinkPracticePage();
    }

    public BrokenLinkPage clickBrokenLink(){
        click(brokenLinkItem);
        return new BrokenLinkPage();
    }

    public CheckBoxPage clickCheckBox(){
        scrollToElementJS(checkBoxMenuItem);
        click(checkBoxMenuItem);
        return new CheckBoxPage();
    }

    public ButtonPage clickButtonPage(){
        scrollToElementJS(buttonItem);
        click(buttonItem);
        return new ButtonPage();
    }

    public RadioButtonPage clickRadioButton(){
        scrollToElementJS(radioButtonMenuItem);
        click(radioButtonMenuItem);
        return new RadioButtonPage();
    }

}
