package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.Pageable;

public class DeleteCart {

    @FindBy(xpath = "//input[@value=\"Delete\"]")
    private WebElement deleteCart;

    public DeleteCart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void DeletefromCart(){
        deleteCart.click();
    }

}
