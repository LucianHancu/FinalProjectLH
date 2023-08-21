package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.BasePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        addToCart.clickOnTheCartButton();
        addToCart.clickOnEditCartButton();
        WebElement checkoutButton = driver.findElement(By.linkText("Checkout"));
        Assert.assertTrue(checkoutButton.isDisplayed());
    }


    @Test
    public void updateInCartProductsTest() throws InterruptedException{
        addToCart.clickOnTheFirstProduct();
        addToCart.clickOnAddToCartButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
        //nu e varianta corecta cu homebutton
        //addToCart.clickOnHomeButton();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // driver.switchTo().frame("notification-box-top");
        addToCart.clickOnTheCartButton();
        addToCart.clickOnEditCartButton();
        WebElement itemsNumberCheck = driver.findElement
                (By.cssSelector("#content > form > div > table > tbody > tr > td:nth-child(4) > div > input"));
        Assert.assertEquals(itemsNumberCheck.getText(), "3");
    }
}
