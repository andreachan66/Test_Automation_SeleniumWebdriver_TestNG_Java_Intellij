package Part3_4.com.demoqa.tests.part4.interactions;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

  @Test
  public void testSliderResult(){
      int x = 289;
      int y = 0;

      var sliderPage =  homePage.goToWidgets().clickSlider();
      //sliderPage.clickOnSlider();

      sliderPage.moveSlider(0,0);
      sliderPage.moveSlider(116,0);

      String actualValue = sliderPage.getSliderValue();
      String expectedValue = "85";
      Assert.assertEquals(actualValue, expectedValue, "\n " +
              "Actual & Expected Value Do Not Match \n");
  }
}
