package Part3_4.com.demoqa.tests.part3.elements;
import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    @Test
    public void testTextBox(){
        var textBoxPage = homePage.goToElements().clickTextBox();

        textBoxPage.setFullNameTextBox("Allen");
        textBoxPage.setEmail("test@gmail.com");
        textBoxPage.setCurrentAddress("123 Unknown Street, ");
        textBoxPage.setCurrentAddress("Unknown city");
        textBoxPage.setCurrentAddress("Unknown province");
        textBoxPage.clickSubmitBtn();

        String opAddress = textBoxPage.getOutputAddress();

        Assert.assertTrue(opAddress.contains("Unknown"), "\n" +
                "The output address does not contain Unknown\n" );

    }
}
