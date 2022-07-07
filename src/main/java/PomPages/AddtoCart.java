package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
    @FindBy(id="twotabsearchtextbox")
    private WebElement searchbox;

    public AddtoCart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void searchForTodaysDeals(){
        searchbox.sendKeys("Todays deals");
    }

    public void searchForPhone(){
        searchbox.sendKeys("Mobile Phones");
    }
    @FindBy(id="nav-search-submit-button")
    private WebElement searchicon;

    public void searchIcon(){
        searchicon.click();
    }

//    @FindBy(xpath = "//div[@data-component-id=\"2\"]")
//div[@data-component-id="57"]
    @FindBy(xpath = "//div[@data-component-id=\"2\"]")
    private WebElement firstItem;

    public void clickOnFirstItem(){
        firstItem.click();
    }
    @FindBy(name="submit.add-to-cart")
    private WebElement AddtoCart;

    public void AddToCartBtn(){
        AddtoCart.click();
    }
    @FindBy(id="nav-cart-count")
    private WebElement cartCount;

    public void assertCartInccount(){
        cartCount.getText().contains("1");
    }

    public void assertCartDeccount(){
        cartCount.getText().contains("0");
    }

    public void clickOnCart(){
        cartCount.click();
    }

}
