package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckoutWithItemInCartPage;

import java.util.concurrent.TimeUnit;

public class CheckoutWithItemInCartTestCase extends BasePage {
    private CheckoutWithItemInCartPage checkout;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkout = new CheckoutWithItemInCartPage(driver);
    }
    @Test
    public void checkoutWithItemInCartTest() throws InterruptedException {
        checkout.clickOnTheMyAccountButton();
        checkout.enterEmailAdress("lucian.hancu@yahoo.com");
        checkout.enterPassword("parolaTest");
        checkout.clickOnTheSubmitLoginButton();
        checkout.clickOnTheHomePageButton();
        checkout.clickOnTheFirstProduct();
        checkout.clickOnAddToCartButton();
        checkout.clickOnTheHomePageButton();
        checkout.clickOnTheCartButton();
        checkout.clickOnEditCartButton();
        checkout.clickOnCheckoutButton();
        checkout.clickOnAcceptTermsConditionsButton();
        checkout.clickOnContinueButton();
        driver.navigate().refresh();
        checkout.clickOnConfirmOrderButton();
        WebElement orderConfirmation = driver.findElement(By.cssSelector("#content > h1"));
        Assert.assertTrue(orderConfirmation.isDisplayed());
    }
}
