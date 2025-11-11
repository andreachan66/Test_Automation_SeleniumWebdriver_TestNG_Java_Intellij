package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends ElementsPage {

    private By registrationAgeField = By.id("age");
    private By submitButton = By.id("submit");
    private By addButton = By.xpath("//button[text()='Add']");
    private By searchBox = By.xpath("//input[@placeholder='Type to search']");

    private By colFirstName = By.xpath("//div[text()='First Name']");
    private By colLastName = By.xpath("//div[text()='Last Name']");
    private By colAge = By.xpath("//div[text()='Age']");
    private By colEmail = By.xpath("//div[text()='Email']");
    private By colSalary = By.xpath("//div[text()='Salary']");
    private By colDepartment = By.xpath("//div[text()='Department']");
    private By colAction = By.xpath("//div[text()='Action']");

    private By addForm = By.xpath("//div[@class='modal-header']");
    private By entFirstName = By.id("firstName");
    private By entLastName = By.id("lastName");
    private By entEmail = By.id("userEmail");
    private By entAge = By.id("age");
    private By entSalary = By.id("salary");
    private By entDepartment = By.id("department");


    public void enterFirstName(String firstName){
       find(entFirstName).sendKeys("Test");
    }

    public void enterLastName(String lastName){
        find(entLastName).sendKeys("Tester");
    }

    public void enterEmail(String email){
        find(entEmail).sendKeys(email);
    }

    public void enterAge(String age){
        find(entAge).sendKeys("47");
    }

    public void enterSalary(String salary){
        find(entSalary).sendKeys("120000");
    }

    public void enterDepartment(String department){
        find(entDepartment).sendKeys("Software Quality Assurance");
    }

    public void addPerson(){
        find(addButton).click();

    }

    public void clickSearchBox(){
        find(searchBox).click();
    }

    public void setSearchCriteria(String textSearch){
        set(searchBox, textSearch);
    }

    public void sortByFirstName(){
        find(colFirstName).click();
    }

    public void sortByLastName(){
        find(colLastName).click();
    }

    public void sortByAge(){
        find(colAge).click();
    }

    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+ email + "']//following::span[@title='Edit']");
        click(edit);
    }

    public void setAge(String age){
        set(registrationAgeField, age);
    }

    public void clickSubmitButton(){
        click(submitButton);
    }

    public String getTableAge(String email){
        By tableAge = By.xpath("//div[text()='"+ email + "']//preceding::div[1]");
        return  find(tableAge).getText();
    }

    public String getDepartment(String dptName){
        By tableDepartment = By.xpath("//div[text()='" + dptName + "']");
        return find(tableDepartment).getText();
    }

    public String getEmail(String email){
        By tableEmail = By.xpath("//div[text()='" + email + "']");
        return find(tableEmail).getText();
    }
}
