package Part3_4.com.demoqa.tests.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

//    @Test
//    public void testWebTable(){
//        var webTablePage = homePage.goToElements().clickWebTables();
//        webTablePage.clickEdit("alden@example.com");
//        webTablePage.setAge("34");
//        webTablePage.clickSubmitButton();
//        String actualAge = webTablePage.getTableAge("alden@example.com");
//        String expectedAge = "34";
//        Assert.assertEquals(actualAge, expectedAge, "\n Actual & Expected Ages Do Not Match \n");
//    }

//    @Test
//    public void testDepartment() {
//        String insDepart = "Insurance";
//
//        var webTablePage = homePage.goToElements().clickWebTables();
//        webTablePage.clickSearchBox();
//        webTablePage.setSearchCriteria(insDepart);
//        String actualResult = webTablePage.getDepartment(insDepart);
//        Assert.assertTrue(actualResult.contains(insDepart), "\n Actual results " +
//                "does not contain Insurance department\n");
//    }

//    @Test
//    public void testFirstNameSort() throws InterruptedException {
//        String ageSort = "desc";
//        var webTablePage = homePage.goToElements().clickWebTables();
//        System.out.println("Sort first name");
//        webTablePage.sortByFirstName();
//        System.out.println("Again sort first name");
//
//        try {
//            Thread.sleep(5000);
//        }
//        catch(Exception e1) {
//            System.out.println("Wait failed");
//        }
//
//        webTablePage.sortByFirstName();
//
//        System.out.println("Again again sort first name");
//        try {
//            Thread.sleep(5000);
//        }
//        catch(Exception e1) {
//            System.out.println("Wait failed");
//        }
//        webTablePage.sortByFirstName();
//    }

//    @Test
//    public void testLastNameSort() throws InterruptedException {
//        String ageSort = "desc";
//        var webTablePage = homePage.goToElements().clickWebTables();
//        System.out.println("Sort Last name");
//
//        webTablePage.sortByLastName();
//        System.out.println("Again sort Last name");
//
//        webTablePage.sortByLastName();
//        System.out.println("Again again sort Last name");
//        try {
//            Thread.sleep(5000);
//        }
//        catch(Exception e1) {
//            System.out.println("Wait failed");
//        }
//        webTablePage.sortByLastName();
//    }
//
//    @Test
//    public void testAgeSort() throws InterruptedException{
//        String ageSort = "desc";
//        var webTablePage = homePage.goToElements().clickWebTables();
//        System.out.println("Sort by Age");
//
//        webTablePage.sortByAge();
//        System.out.println("Sort by Age");
//
//        try {
//            Thread.sleep(5000);
//        }
//        catch(Exception e1) {
//            System.out.println("Wait failed");
//        }
//        webTablePage.sortByAge();
//    }

    @Test
    public void addPersonTable() throws InterruptedException{
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.addPerson();
        webTablePage.enterFirstName("Test");
        webTablePage.enterLastName("Tester");
        webTablePage.enterEmail("tester@gmail.com");
        webTablePage.enterAge("47");
        webTablePage.enterDepartment("Software Quality Assurance");
        webTablePage.enterSalary("$150,000");

        webTablePage.clickSubmitButton();
        try {
           Thread.sleep(5000);
       }
       catch(Exception e1) {
           System.out.println("Wait failed");
       }
        webTablePage.clickSearchBox();
        webTablePage.setSearchCriteria("tester@gmail.com");
        String actualResult = webTablePage.getEmail("tester@gmail.com");

        System.out.println("Actual results " + actualResult);
        String expectedResult = "tester@gmail.com";

        Assert.assertTrue(actualResult.contains(expectedResult), "\n " +
                "Expected email not found in actual result");
    }
}
