package Utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utitlity {
    public static WebDriver driver;

    public static  void setUtilityDriver() {
        driver = BasePage.driver;

    }
}
