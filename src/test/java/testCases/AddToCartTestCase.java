package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.BasePage;

public class AddToCartTestCase extends BasePage {
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
        addToCart.clickOnHomeButton();
        addToCart.clickOnTheCartButton();
        addToCart.clickOnEditCartButton();
        WebElement checkoutButton = driver.findElement(By.linkText("Checkout"));
        Assert.assertTrue(checkoutButton.isDisplayed());
    }


    @Test
    public void updateInCartProductsTest() throws InterruptedException{
        addToCart.clickOnTheFirstProduct();
        addToCart.clickOnAddToCartButton();
        addToCart.clickOnHomeButton();
        addToCart.clickOnTheCartButton();
        addToCart.clickOnEditCartButton();
        addToCart.updateProductQuantity("2");
        addToCart.clickOnUpdateQuantityButton();
        WebElement updateCart = driver.findElement
                (By.cssSelector("#checkout-cart > div.alert.alert-success.alert-dismissible"));
        Assert.assertTrue(updateCart.isDisplayed());
    }

    @Test
    public void increaseItemsNumberTest() throws InterruptedException{
        addToCart.clickOnTheFirstProduct();
        addToCart.clickOnIncreaseItemsButton();
        addToCart.clickOnIncreaseItemsButton();
        addToCart.clickOnAddToCartButton();
        addToCart.clickOnHomeButton();
        WebElement itemsNumberCheck = driver.findElement
                (By.cssSelector("#entry_217825 > a > div.cart-icon > span"));
        Assert.assertEquals(itemsNumberCheck.getText(), "3");
    }
}
