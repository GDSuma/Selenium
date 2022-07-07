package TestScripts;

import GenericLib.Base;
import GenericLib.Utilities;
import PomPages.*;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Amazon extends Base {
    @Test(priority = 1)
    public void LoginToWebsite() throws InterruptedException, IOException, TesseractException {
         Utilities u = new Utilities();
        Login l = new Login(driver);
        //Sign in
        u.mouseAction(driver, l.HoverOn());
        l.firstSignIn();
        l.enterEmail(p.getPropertyData("email"));
        l.clickOnContinue();
        l.enterPassword(p.getPropertyData("password"));
        l.clickOnSignInBtn();
    }
//    //captcha locator
//        WebElement imageelement = driver.findElement(By.cssSelector("#auth-captcha-image"));
//        File src = imageelement.getScreenshotAs(OutputType.FILE);
//        //path where you want save the screenshot
//        String path = "/home/sumagd/IdeaProjects/SeleniumAmazon/Screenshot/captcha.png";
//        FileHandler.copy(src, new File(path));
//        Thread.sleep(2000);
//        ITesseract image = new Tesseract();
//        //location of the eng.traineddata
//        image.setDatapath("/home/sumagd/IdeaProjects/SeleniumAmazon/Testdata");
//        String str = image.doOCR(new File(path));
//        System.out.println("image ocr done");
//        System.out.println(str);
//        driver.findElement(By.id("auth-captcha-guess")).sendKeys(str);

    @Test(priority = 2)
    public void addRemovecart() throws InterruptedException
    {
    //Add 1st item to cart and remove from cart
        AddtoCart a = new AddtoCart(driver);
        DeleteCart c = new DeleteCart(driver);
        a.searchForTodaysDeals();
        a.searchIcon();
        Thread.sleep(10000);
        a.clickOnFirstItem();
        Thread.sleep(15000);
        u.ShiftControlToNewTab(driver);

        a.AddToCartBtn();
        a.assertCartInccount();
        a.clickOnCart();
        c.DeletefromCart();
        a.assertCartDeccount();
}
        @Test(priority = 3)
        public void GetorderDetails() throws InterruptedException {


            Utilities u = new Utilities();
            Login l = new Login(driver);
            //Get the order details of this year
            u.mouseAction(driver, l.HoverOn());
            driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]")).click();
            driver.findElement(By.xpath(" //span[@id='a-autoid-1-announce']")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("time-filter_2")).click();
            WebElement ele = driver.findElement(By.xpath(" //a[contains(text(),\"SATYAM KRAFT 1 Pcs Women's Retro Elastic Stretchy \")]"));
            System.out.println(ele.getText());
        }
        @Test(priority=4)
        public void addRemoveAddress() throws InterruptedException {
            //add new address also remove address and assert the success msg
            Utilities u = new Utilities();
            Login l = new Login(driver);
            AddRemoveAddress address = new AddRemoveAddress(driver);
            u.mouseAction(driver, l.HoverOn());
            address.ClickOnAccounts();
            address.ClickOnAddress();
            address.plusAddressIcon();
            address.NameTextBox();
            address.PhoneTextbox();
            address.Pincode();
            address.addressLine1();
            address.addressLine2();
            address.Landmark();
            address.addAdressBtn();
            WebElement AdditionText = driver.findElement(By.xpath("//h4[contains(text(),'Address saved')]"));
            m.assertEquals(AdditionText, "Address saved");
            address.removeAddress();
            Thread.sleep(5000);
            address.ClickOnYesBtn();
            WebElement DeletionText = driver.findElement(By.xpath("//h4[contains(text(),'Address deleted')]"));
            m.assertEquals(DeletionText, "Address deleted");
        }

            @Test(priority = 5)
            public void scrollToLastMobile() throws InterruptedException {
            ScrollToLast s = new ScrollToLast(driver);
            AddtoCart a = new AddtoCart(driver);
            Login l = new Login(driver);
            //Scroll to last mobile and get details
            a.searchForPhone();
            a.searchIcon();
            u.scrollBar(driver, s.GetXvalue(), s.GetYvalue());
            Thread.sleep(10000);
            u.mouseAction(driver, l.HoverOn());
        }

    }




