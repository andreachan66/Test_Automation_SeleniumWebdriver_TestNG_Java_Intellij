package Part3_4.com.demoqa.tests.part3.forms;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected= formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "\n reading checkbox is  selelcte \n");
    }
}
