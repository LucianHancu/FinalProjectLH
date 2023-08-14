package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DeleteItemsFromCartPage;

import java.util.concurrent.TimeUnit;

public class DeleteItemsFromCartTestCase extends BasePage {
    private DeleteItemsFromCartPage deleteItems;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        deleteItems = new DeleteItemsFromCartPage(driver);
    }
    @Test
    public void deleteItemsFromCartTest() throws InterruptedException{
        deleteItems.clickOnTheFirstProduct();
        deleteItems.clickOnAddToCartButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        deleteItems.clickOnTheCartButton();
        deleteItems.clickOnEditCartButton();
        deleteItems.clickOnDeleteItemsButton();
        WebElement errorMesage = driver.findElement(By.xpath("//*[@id=\"content\"]/p"));
        Assert.assertEquals(errorMesage.getText(), "Your shopping cart is empty!");
    }

}
