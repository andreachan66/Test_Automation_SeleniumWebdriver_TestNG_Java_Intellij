package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class LinkPracticePage extends ElementsPage{
    private By apiCreated = By.id("created");
    private By apiNoContent = By.id("no-content");
    private By apiMoved = By.id("moved");
    private By apiBadRequest = By.id("bad-request");
    private By apiUnauthorized = By.id("unauthorized");
    private By apiForbidden = By.id("forbidden");
    private By apiNotFound = By.id("invalid-url");

    private By createdResult = By.id("linkResponse");

    private By noContentResult = By.xpath("//b[text()='204']");

    private By movedResult = By.xpath("//b[text()='301']");

    private By badRequestResult = By.xpath("//b[text()='400']");

    private By unauthorized = By.xpath("//b[text()='Unauthorized']");

    private By unAuthorizedResult = By.xpath("//b[text()='401']");

    private By forbiddenResult = By.xpath("//b[text()='403']");

    private By notFoundResult = By.xpath("//b[text()='404']");

    public void clickLnkNotFound(){
        scrollToElementJS(apiNotFound);
        find(apiNotFound).click();
    }

    public String getNotFoundResult(){
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }
        return find(notFoundResult).getText();
    }

    public void clickLnkForbidden(){
        scrollToElementJS(apiForbidden);
        find(apiForbidden).click();
    }

    public String getForbiddenResult(){
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }
        return find(forbiddenResult).getText();
    }

    public void clickLnkAuthorized(){
        scrollToElementJS(apiUnauthorized);
        find(apiUnauthorized).click();
    }

    public String getUnauthorizedResult(){
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }
        return find(unAuthorizedResult).getText();
    }

    public void clickLnkBadRequest(){
        scrollToElementJS(apiBadRequest);
        find(apiBadRequest).click();
    }

    public String getBadRequestResult(){
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }
        return find(badRequestResult).getText();
    }


    public void clickLnkMoved(){
        scrollToElementJS(apiMoved);
        find(apiMoved).click();
    }

    public String getLnkMovedResult(){
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }

        return find(movedResult).getText();
    }

    public void clickLnkCreated(){
        scrollToElementJS(apiCreated);
        find(apiCreated).click();
    }

    public String getLnkCreatedResult(){

        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }

        return find(createdResult).getText();
    }

    public String getLnkNoContentResult(){
        try{
            Thread.sleep(1000);
        }catch (Exception e1){
            System.out.println("Wait failed");
        }
        return find(noContentResult).getText();

    }

    public void clickLnkNoContent(){
        scrollToElementJS(apiNoContent);
        find(apiNoContent).click();
    }

    public String getLnkNoContent(){
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }
        return find(noContentResult).getText();
    }
}
