package Part3_4.com.demoqa.tests.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import com.demoqa.pages.elements.RadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RadioButtonTest extends BaseTest {

    @Test
    public void testYesRadioButton() {
        var RadioButtonPage = homePage.goToElements().clickRadioButton();
        RadioButtonPage.clickYes();
        String yesResult = RadioButtonPage.getYesResult();
        System.out.println("click on Yes Radio button");
        System.out.println("Yes Result: " + yesResult);
        Assert.assertTrue(yesResult.contains("Yes"), "Actual results does not " +
                "contain yes ");
    }

    @Test(dependsOnMethods = {"testYesRadioButton"})
    public void testImpressiveRadioButton(){
        var RadioButtonPage  = homePage.goToElements().clickRadioButton();
        RadioButtonPage.clickImpress();
        String impressResult = RadioButtonPage.getImpressResult();
        System.out.println("click on Impressive Radio button");
        System.out.println("Impressive Result: " + impressResult);
        Assert.assertTrue(impressResult.contains("Impressive"), "Actual result does not " +
                "contain impressive" );
    }
}
