package Part3_4.com.demoqa.tests.part3.elements;
import Part3_4.com.demoqa.base.BaseTest;
import com.demoqa.pages.elements.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.base.BasePage.delay;
import static java.util.function.Predicate.not;

public class CheckboxTest extends BaseTest {

//    @Test
//    public void testHomeCheckBox(){
//        var CheckBoxPage  = homePage.goToElements().clickCheckBox();
//        CheckBoxPage.checkHome();
//        String actualCheckStatus =  CheckBoxPage.getHomeCheckResult();
//        System.out.println("Home check box is clicked " + actualCheckStatus + "\n");
//    }

//    @Test
//    public void testDesktopCheckBox(){
//        var CheckBoxPage  = homePage.goToElements().clickCheckBox();
//        String toggleStatus = CheckBoxPage.getToggleStatus();
//
//        if(toggleStatus.contains("rct-node-collapsed")) {
//
//            delay(500);
//            CheckBoxPage.expandDropDownArrow();
//        }
//        CheckBoxPage.checkDesktop();
//    }

//    @Test
//    public void testDocumentCheckBox(){
//        var CheckBoxPage = homePage.goToElements().clickCheckBox();
//        String toggleStatus = CheckBoxPage.getToggleStatus();
//
//        if(toggleStatus.contains("rct-node-collapsed")) {
//
//            delay(500);
//            CheckBoxPage.expandDropDownArrow();
//        }
//        CheckBoxPage.checkDocument();
//
//        String actualResult = CheckBoxPage.getDocumentCheckResult();
//
//        Assert.assertTrue(actualResult.contains("documents"), "\n  " +
//                "The checkbox result line does not show documents");
//    }

//    @Test
//    public void testDownloadCheckBox(){
//        var CheckBoxPage = homePage.goToElements().clickCheckBox();
//        String toggleStatus = CheckBoxPage.getToggleStatus();
//
//        if(toggleStatus.contains("rct-node-collapsed")) {
//
//            delay(500);
//            CheckBoxPage.expandDropDownArrow();
//        }
//
//        CheckBoxPage.checkDownload();
//        String actualResult = CheckBoxPage.getDownloadCheckResult();
//        Assert.assertTrue(actualResult.contains("downloads"), "\n  " +
//                "The checkbox result line does not show downloads");
//    }

//    @Test (dependsOnMethods = {"testDownloadCheckBox"})
//    public void testWordFileCheckBox(){
//        var CheckBoxPage = homePage.goToElements().clickCheckBox();
//        String toggleStatus = CheckBoxPage.getToggleStatus();
//
//        if(toggleStatus.contains("rct-node-collapsed")) {
//            delay(500);
//            CheckBoxPage.expandDropDownArrow();
//
//            toggleStatus = CheckBoxPage.getDownloadStatus();
//            if(toggleStatus.contains("rct-collapse-btn")) {
//                CheckBoxPage.expandDownload();
//            }
//        }
//
//        CheckBoxPage.checkWordFile();
//
//        String actualResult = CheckBoxPage.getWordFileCheckResult();
//        Assert.assertTrue(actualResult.contains("word"), "\n" +
//                "The checkbox result line does not show Word");
//    }

//    @Test (dependsOnMethods = {"testDownloadCheckBox"})
//    public void testExcelFileCheckBox(){
//        var CheckBoxPage = homePage.goToElements().clickCheckBox();
//        String toggleStatus = CheckBoxPage.getToggleStatus();
//
//        if(toggleStatus.contains("rct-node-collapsed")) {
//            delay(500);
//            CheckBoxPage.expandDropDownArrow();
//
//            toggleStatus = CheckBoxPage.getDownloadStatus();
//            if(toggleStatus.contains("rct-collapse-btn")) {
//                CheckBoxPage.expandDownload();
//            }
//        }
//
//        CheckBoxPage.checkExcelFile();
//        String actualResult = CheckBoxPage.getExcelFileCheckResult();
//        Assert.assertTrue(actualResult.contains("excel"), "\n" +
//                "The checkbox result line does not show Excel");
//    }

    @Test
    public void testHomeUncheck(){
        var CheckBoxPage = homePage.goToElements().clickCheckBox();

        CheckBoxPage.checkHome();
        System.out.println("check home");

        CheckBoxPage.uncheckHome();
        String actualResult = CheckBoxPage.getHomeUncheckResult();

        System.out.println("actualResult"  + actualResult);
        Assert.assertTrue(actualResult.contains("uncheck"), "\n" +
                "The checkbox is checked");
    }

}
