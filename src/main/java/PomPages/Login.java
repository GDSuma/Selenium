package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Login {


        @FindBy(id="nav-link-accountList-nav-line-1")
        private WebElement mouseHover;

        public WebElement HoverOn() {
            return mouseHover;
        }

        @FindBy(name="email")
        private WebElement email;

        public void enterEmail(String emailid){
            email.sendKeys(emailid);
        }

        @FindBy(id="continue")
        private WebElement Continue;

        public void clickOnContinue(){
            Continue.click();
        }

        @FindBy(xpath="//input[@id='ap_password']")
        private WebElement password;

        public void enterPassword(String pass){
            password.sendKeys(pass);
        }
        @FindBy(id="signInSubmit")
        private WebElement Signin;

        public void clickOnSignInBtn(){
            Signin.click();

        }
        public Login(WebDriver driver) {
            PageFactory.initElements(driver,this);
        }

        @FindBy(xpath ="//body[1]/div[1]/header[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
        private WebElement FirstSignInBtn;

        public void firstSignIn(){
            FirstSignInBtn.click();
        }






    }

