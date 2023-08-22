package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToWishlistPage;
import pages.BasePage;
import java.util.concurrent.TimeUnit;

public class AddToWishlistTestCase extends BasePage {
    private AddToWishlistPage wishlist;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        wishlist = new AddToWishlistPage(driver);
    }
    @Test
    public void addToWishlistTest() throws InterruptedException {
        wishlist.clickOnTheMyAccountButton();
        wishlist.enterEmailAdress("lucian.hancu@yahoo.com");
        wishlist.enterPassword("parolaTest");
        wishlist.clickOnTheSubmitLoginButton();
        wishlist.clickOnCategoriesList();
        wishlist.clickOnMP3PlayerCategory();
        wishlist.clickOnProduct1();
        wishlist.clickOnAddProduct1ToWishlist();
        wishlist.clickOnHomeButton();
        wishlist.clickOnWishlistButton();
        WebElement wishlistProduct = driver.findElement(By.linkText("iPod Shuffle"));
        Assert.assertTrue(wishlistProduct.isDisplayed());
    }
}
