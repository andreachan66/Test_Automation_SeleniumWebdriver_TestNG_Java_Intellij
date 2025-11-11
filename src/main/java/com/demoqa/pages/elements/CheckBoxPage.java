package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class CheckBoxPage extends ElementsPage{
    private By homeCheckBox = By.xpath("//span[text()='Home']");
    private By desktopCheckBox = By.xpath("//span[text()='Desktop']");
    private By documentCheckBox = By.xpath("//span[text()='Documents']");
    private By downloadCheckBox = By.xpath("//span[text()='Downloads']");
    private By wordFileCheckBox = By.xpath("//span[text()='Word File.doc']");
    private By excelFileCheckBox = By.xpath("//span[text()='Excel File.doc']");

    private By checkedHomeCheckBox = By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[contains(@class, 'rct-icon-check')]");
    private By uncheckHomeCheckBox = By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[contains(@class, 'rct-icon-uncheck')]");

    private By tgCheckBox = By.xpath("//li[contains(@class, 'rct-node')]");
    private By dpArrow = By.xpath("//button[@title='Toggle']");

    private By dpDownload = By.xpath("//label[@for='tree-node-downloads']//preceding-sibling::button[@type='button']");

    //private By toggleExpClp = By.xpath("//svg[contains(@class, 'open')]");

    private By homeCheckResult = By.xpath("//div[@id='result']/span[contains(text(), 'home')]");
    private By desktopCheckResult = By.xpath("//div[@id='result']/span[contains(text(), 'Desktop')]");
    private By documentCheckResult = By.xpath("//div[@id='result']/span[contains(text(), 'documents')]");
    private By downloadCheckResult = By.xpath("//span[text()='downloads']");
    private By wordFileCheckResult = By.xpath("//span[text()='wordFile']");
    private By excelFileCheckResult = By.xpath("//span[text()='excelFile']");

    public String getToggleStatus(){
        return find(tgCheckBox).getAttribute("class");
    }

    public String  getDownloadStatus(){
        return find(dpDownload).getAttribute("class");

    }
    public void expandDownload(){
        scrollToElementJS(dpDownload);
        find(dpDownload).click();
    }

    public void expandDropDownArrow(){
        scrollToElementJS(dpArrow);
        find(dpArrow).click();
    }

    public void checkHome(){
        scrollToElementJS(homeCheckBox);
        click(homeCheckBox);
    }

    public void uncheckHome(){
        scrollToElementJS(checkedHomeCheckBox);
        click(checkedHomeCheckBox);
    }

    public void getUncheckHome(){
        scrollToElementJS(uncheckHomeCheckBox);
        click(uncheckHomeCheckBox);
    }

    public String getHomeCheckResult(){
        return find(homeCheckResult).getText();
    }

    public String getHomeUncheckResult(){
        return find(uncheckHomeCheckBox).getAttribute("class");
    }

    public void checkDesktop(){
        scrollToElementJS(desktopCheckBox);
        click(desktopCheckBox);
    }

    public String getDesktopCheckResult(){
        return find(desktopCheckResult).getText();
    }

    public void checkDocument(){
        scrollToElementJS(documentCheckBox);
        click(documentCheckBox);
    }

    public String getDocumentCheckResult(){
        return find(documentCheckResult).getText();
    }

    public void checkDownload(){
        scrollToElementJS(downloadCheckBox);
        click(downloadCheckBox);
    }

    public String getDownloadCheckResult(){
        return find(downloadCheckResult).getText();
    }

    public void checkWordFile(){
        scrollToElementJS(wordFileCheckBox);
        click(wordFileCheckBox);
    }

    public String getWordFileCheckResult(){
        return find(wordFileCheckResult).getText();
    }

    public void checkExcelFile(){
        scrollToElementJS(excelFileCheckBox);
        click(excelFileCheckBox);
    }

    public String getExcelFileCheckResult(){
        return find(excelFileCheckResult).getText();
    }
}
