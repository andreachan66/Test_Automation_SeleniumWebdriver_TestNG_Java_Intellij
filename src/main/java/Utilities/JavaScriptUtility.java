package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.base.BasePage.delay;
import static java.nio.file.Files.find;

public class JavaScriptUtility extends Utitlity{
    public static void scrollToElementJS(By locator) {
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
        delay(6000);
    }

    public static void rightClickJS(By locator) {
        delay(300);
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    public static void doubleClickJS(By locator) {
        delay(300);
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(locator)).perform();
    }

    public static void clickJS(By locator) {
        delay(300);
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].checked = true; arguments[0].dispatchEvent(new Event('change'));", element);
        //delay(3000);
    }

}
