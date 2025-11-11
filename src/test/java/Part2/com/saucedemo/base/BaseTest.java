package Part2.com.saucedemo.base;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected HomePage homePage;
    private String url = "https://www.saucedemo.com/v1/";

    @BeforeClass
    public void setUP () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown (){
        driver.quit();
    }
}
