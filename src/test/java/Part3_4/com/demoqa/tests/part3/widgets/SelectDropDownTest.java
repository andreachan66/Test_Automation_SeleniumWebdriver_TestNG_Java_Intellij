package Part3_4.com.demoqa.tests.part3.widgets;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest extends BaseTest {
   @Test
   public void testMultiSelectDropDown(){
    var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
    selectMenuPage.selectStandardMulti("Volvo");
    selectMenuPage.selectStandardMulti(1);
    selectMenuPage.selectStandardMulti("Audi");
    selectMenuPage.selectStandardMulti(2);

    selectMenuPage.deselectStandardMulti("saab");

    List<String> actualSelectedOptions =
            selectMenuPage.getAllSelectedStandardMultiOptions();
    Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
       Assert.assertTrue(actualSelectedOptions.contains("Saab"), "\n Saab Is Selected As An Option \n");
       Assert.assertTrue(actualSelectedOptions.contains("Opel"));
       Assert.assertTrue(actualSelectedOptions.contains("Audi"));
   }
}
