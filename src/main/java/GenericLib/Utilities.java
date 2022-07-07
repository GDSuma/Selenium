package GenericLib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Utilities {


    public void mouseAction(WebDriver driver, WebElement ele) {
        Actions a = new Actions(driver);
        a.moveToElement(ele).perform();
    }

    public void ShiftControlToNewTab(WebDriver driver) {
        String parent = driver.getWindowHandle();
        List<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
    }

    public void scrollBar(WebDriver driver, int x, int y) {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

}

