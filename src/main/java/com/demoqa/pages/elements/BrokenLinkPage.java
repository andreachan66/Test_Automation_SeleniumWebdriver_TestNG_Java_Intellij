package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import java.net.HttpURLConnection;
import java.net.URL;

import static Utilities.JavaScriptUtility.scrollToElementJS;

public class BrokenLinkPage extends ElementsPage{

    private By brokenImage = By.xpath("//img[@src='/images/Toolsqa_1.jpg']");

    private By brokenLink = By.xpath("//a[@href='http://the-internet.herokuapp.com/status_codes/500']");

    private By validImageText = By.xpath("//p[text()='Valid image']");

    private By validLink = By.xpath("//a[@href='http://demoqa.com']");

    private By validLinkText = By.xpath("//a[text()='Click Here for Valid Link']");


    public String  getValidLink(){
        String vdLinkText = find(validLink).getAttribute("href");
        System.out.println("Valid link is -- " + vdLinkText);
        return vdLinkText;
    }



    public void ClickValidLink(){
        scrollToElementJS(validLinkText);
    }

    public void ClickValidImageLink(){
        scrollToElementJS(validImageText);
    }

    public String getValidImageText (){
        String validImgText = find(validImageText).getText();
        return validImgText;
    }

    public void ClickBrokenLink(){
        scrollToElementJS(brokenLink);
        System.out.println("javascript ------ 3");
        find(brokenLink).click();
    }

    public String GetBrokenLink(){
        String badURL;
        badURL = find(brokenLink).getAttribute("http://the-internet.herokuapp.com/status_codes/500");
        return badURL;
    }

    public void ClickBrokenImage(){
        scrollToElementJS(brokenImage);
        System.out.println("javascript ------ 2");
        find(brokenImage).click();
    }

    public String GetBrokenImageURL(){
        String imgURL;
        imgURL = find(brokenImage).getAttribute("/images/Toolsqa_1.jpg");
        return imgURL;
    }

}
