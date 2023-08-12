package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class AddToCardTestCase extends BasePage {
    private AddToCartPage addToCart;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        addToCart = new AddToCartPage(driver);
    }
    @Test
    public void addToCartTest() throws InterruptedException{
        addToCart.clickOnTheFirstProduct();
        addToCart.clickOnAddToCartButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //salut Florin. Nu inteleg de ce nu recunoaste partea de clickOnTheCardButton.
        // Oare ma poti ajuta? Multumesc
        addToCart.clickOnTheCartButton();
        addToCart.clickOnEditCartButton();
        WebElement checkoutButton = driver.findElement(By.linkText("https://ecommerce-playground.lambdatest.io/index.php?route=checkout/checkout"));
        Assert.assertTrue(checkoutButton.isDisplayed());
    }
}
