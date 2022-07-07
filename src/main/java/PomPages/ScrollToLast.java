package PomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollToLast {

    @FindBy(xpath = "//span[contains(text(),'Samsung Galaxy S22 Ultra 5G (Phantom White, 12GB, ')]")

//    @FindBy(xpath = "(//a[@class="a-link-normal a-text-normal])[24]");
    private WebElement scrollGetDetails;

    public ScrollToLast(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public int GetXvalue() throws InterruptedException {

        Point loc = scrollGetDetails.getLocation();
        int X = loc.getX();
        System.out.println(X);
        return X;
    }
    public int GetYvalue() throws InterruptedException {
        Point loc = scrollGetDetails.getLocation();
        int Y = loc.getY();
        System.out.println(Y);
        scrollGetDetails.click();
        System.out.println(scrollGetDetails.getText());

        return Y;



    }
}
