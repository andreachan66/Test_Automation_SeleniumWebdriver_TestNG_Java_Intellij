package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utilities.ActionsUtility.dragAndDropBy;
import static Utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage{

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    //private By sliderItem = By.id("sliderContainer");
    private WebElement sliderItem = null;
    private By sliderValue = By.id("sliderValue");


    public String getSliderValue(){
        return getAttribute(sliderValue, "value");
    }


    public void clickOnSlider(){
       click(slider);
    }

    public void moveSlider(int x, int y){
       Actions act = new Actions(driver);
       //clickOnSlider();
       sliderItem = find(slider);
       act.dragAndDropBy(sliderItem, x, 0).perform();
        //dragAndDropBy(find(slider), x, y);

    }
}
