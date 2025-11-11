package Part3_4.com.demoqa.tests.part4.interactions;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard(){
    var textBoxPage = homePage.goToElements().clickTextBox();

    textBoxPage.setFullName("Rex Allen Jones II");
    textBoxPage.setEmail("RexAllenJones@GMail.com");
    textBoxPage.setCurrentAddress("1234 Selenium Avenue \n");
    textBoxPage.setCurrentAddress("Suite 3400 \n");
    textBoxPage.setCurrentAddress("Dallas, Texas \n");
    textBoxPage.clickSubmitButton();
    String actual_Address = textBoxPage.getCurrentAddress();

        Assert.assertTrue(actual_Address.contains("Suite 3400"), "\n" +
                "Actual Address Does Not Contain Suite 3400\n");
    }
}
