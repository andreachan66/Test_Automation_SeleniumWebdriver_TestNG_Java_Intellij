package Part3_4.com.demoqa.tests.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {

//    @Test
//    public void testButtonDoubleClick() throws InterruptedException {
//        var ButtonPage = homePage.goToElements().clickButtonPage();
//        ButtonPage.setBtnDoubleClickMe();
//        try {
//            Thread.sleep(1000);
//        }
//        catch(Exception e1) {
//            System.out.println("Wait failed");
//        }
//
//        String doubleClickMsg  = "You have done a double click";
//        String actualResult = ButtonPage.getBtnDoubleClickResult();
//        Assert.assertTrue(actualResult.contains(doubleClickMsg), "\n The actual result" +
//                "is not matching the expected message");
//    }

    @Test
    public void testSingleClick(){
        var ButtonPage = homePage.goToElements().clickButtonPage();
        ButtonPage.ClickMe();
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }

        String singleClickResult = "You have done a dynamic click";
        String actualResult = ButtonPage.getSingleClickResult();

        System.out.println("Dynamic click result " + actualResult);
        Assert.assertTrue(actualResult.contains(singleClickResult), "\n" +
                "The actual result is not matching the expected result"
        );
    }

    @Test
    public void testRightClick(){
        var ButtonPage = homePage.goToElements().clickButtonPage();
        ButtonPage.rightClick();
        try {
            Thread.sleep(1000);
        }
        catch(Exception e1) {
            System.out.println("Wait failed");
        }

        String rightClickMsg = "You have done a right click";
        String actualResult = ButtonPage.getBtnRightClickResult();
        System.out.println("Actual result is " + actualResult);
        Assert.assertTrue(actualResult.contains(rightClickMsg), "\n The actual result" +
                "is not matching the expected message");
    }
}
