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
        wishToCart.enterEmailAdress("adresa.email53@gmail.com");
        wishToCart.enterPassword("parolaTest");
        wishToCart.clickOnTheSubmitLoginButton();
        wishToCart.openCategoriesList();
        wishToCart.openPhoneTabletCategory();
        wishToCart.clickOnAnItem();
        wishToCart.clickOnAddToWishlistButtoN();
        wishToCart.clickOnHomeButton();
        wishToCart.clickOnWishlistButton();
        wishToCart.clickOnAddToCartButton();
        driver.navigate().refresh();
        WebElement itemsLeftInCart = driver.findElement
                (By.cssSelector("#entry_217825 > a > div.cart-icon > span"));
        Assert.assertEquals(itemsLeftInCart.getText(), "1");
       /* wishToCart.clickOnHomeButton();
        wishToCart.clickOnCartButton();
        wishToCart.clickOnEditCartButton();
        WebElement productInCart = driver.findElement(By.linkText("iPod Touch"));
        Assert.assertTrue(productInCart.isDisplayed());*/
    }
}
