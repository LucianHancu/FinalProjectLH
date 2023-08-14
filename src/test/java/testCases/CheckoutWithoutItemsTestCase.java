package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckoutWithoutItemsPage;

public class CheckoutWithoutItemsTestCase extends BasePage {
    private CheckoutWithoutItemsPage checkout;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkout = new CheckoutWithoutItemsPage(driver);
    }

    @Test
    public void checkoutWithoutItemsTest() throws InterruptedException {
        checkout.clickOnTheCartButton();
        checkout.clickOnCheckoutButton();
        WebElement errorMessage = driver.findElement
                (By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/p"));
        Assert.assertEquals(errorMessage.getText(), "Your shopping cart is empty!");
    }
}
