package Part3_4.com.demoqa.tests.part4.screenshot;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor(){
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
