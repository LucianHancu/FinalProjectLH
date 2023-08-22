package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.WishlistToCartPage;

import java.util.concurrent.TimeUnit;

public class WishlistToCartTestCase extends BasePage {
    private WishlistToCartPage wishToCart;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        wishToCart = new WishlistToCartPage(driver);
    }
    @Test
    public void wishlistToCartTest() throws InterruptedException {
        wishToCart.clickOnTheMyAccountButton();
        wishToCart.enterEmailAdress("lucian.hancu@yahoo.com");
        wishToCart.enterPassword("parolaTest");
        wishToCart.clickOnTheSubmitLoginButton();
        wishToCart.openCategoriesList();
        wishToCart.openPhoneTabletCategory();
        wishToCart.clickOnAnItem();
        wishToCart.clickOnAddToWishlistButtoN();
        wishToCart.clickOnHomeButton();
        wishToCart.clickOnWishlistButton();
        wishToCart.clickOnAddToCartButton();
        wishToCart.clickOnHomeButton();
        wishToCart.clickOnCartButton();
        wishToCart.clickOnEditCartButton();
        WebElement productInCart = driver.findElement(By.linkText("iPod Touch"));
        Assert.assertTrue(productInCart.isDisplayed());
    }
}
