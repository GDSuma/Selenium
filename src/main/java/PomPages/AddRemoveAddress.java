package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveAddress {

    @FindBy(xpath="//span[contains(text(),'Your Account')]")
    private WebElement YourAccounts;

    @FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    private WebElement Address;
    @FindBy(xpath="//div[@id='ya-myab-plus-address-icon']")
    private WebElement plusicon;

    @FindBy(xpath = " //input[@id='address-ui-widgets-enterAddressFullName']")
    private WebElement name;


    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
    private WebElement phone;


    @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
    private WebElement pin;

    @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
    private WebElement street1;

    @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
    private WebElement street2;


    @FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
    private WebElement Lndmark;

    @FindBy(xpath="//body/div[@id='a-page']/div[2]/div[1]/div[2]/form[1]/span[1]/div[1]/span[3]/span[1]/span[1]/input[1]")
    private WebElement AddBtn;

    @FindBy(xpath="//a[@id='ya-myab-address-delete-btn-1']")
    private WebElement RemoveBtn;


    @FindBy(xpath = "//*[@id=\"deleteAddressModal-1-submit-btn\"]/span/input")
    private WebElement YesBtn;
    public AddRemoveAddress(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void ClickOnAccounts(){
     YourAccounts.click();
    }
    public void ClickOnAddress(){
        Address.click();
    }
    public void plusAddressIcon(){
        plusicon.click();
    }
    public void NameTextBox(){
        name.sendKeys("Selenium test");
    }
    public void PhoneTextbox(){
        phone.sendKeys("9998887775");
    }
    public void Pincode(){
        pin.sendKeys("560085");
    }
    public void addressLine1(){
        street1.sendKeys("#100,1st cross,kathreguppe");
    }
    public void addressLine2(){
        street2.sendKeys("kathreguppe");
    }
    public void Landmark(){
        Lndmark.sendKeys("43A bus stop");
    }
    public void addAdressBtn(){
        AddBtn.click();
    }
    public void removeAddress(){
        RemoveBtn.click();
    }
    public void ClickOnYesBtn(){
        YesBtn.click();
    }


}
