package Part3_4.com.demoqa.tests.part4.windows;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowsURL(){
        var windowsPage  = homePage.goToAlertsFramesWindoesCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL,
                "\n Actual & Expected URL Text Do Not Match " +
                        "\n");

    }
}
