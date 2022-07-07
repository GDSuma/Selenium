package GenericLib;

import PomPages.AddRemoveAddress;
import PomPages.AddtoCart;
import PomPages.DeleteCart;
import PomPages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base implements Constants {
    public WebDriver driver;
    public propertyFile p=new propertyFile();
    public Utilities u = new Utilities();
    public  Login l = new Login(driver);
    public AddtoCart a = new AddtoCart(driver);
    public DeleteCart c = new DeleteCart(driver);
    public AddRemoveAddress address = new AddRemoveAddress(driver);
    public SoftAssert m = new SoftAssert();

@BeforeSuite
    public void openapp() throws FileNotFoundException, IOException, InterruptedException {

    System.setProperty(key,value);
    driver = new ChromeDriver();
    driver.get(p.getPropertyData("url"));
//    driver.get(p.getProperty("url"));
    driver.manage().window().maximize();
//        driver.get(url);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

    }
}
