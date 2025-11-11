package Part3_4.com.demoqa.tests.part3.forms;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button is not selected \n" );

    }
}
