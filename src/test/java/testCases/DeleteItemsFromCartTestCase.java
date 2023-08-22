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
    public void deleteAllItemsFromCartTest() throws InterruptedException{
        deleteItems.clickOnTheFirstProduct();
        deleteItems.clickOnAddToCartButton();
        deleteItems.clickOnHomeButton();
        deleteItems.clickOnTheCartButton();
        deleteItems.clickOnEditCartButton();
        deleteItems.clickOnDeleteItemsButton();
        WebElement errorMesage = driver.findElement(By.xpath("//*[@id=\"content\"]/p"));
        Assert.assertEquals(errorMesage.getText(), "Your shopping cart is empty!");
    }

    @Test
    public void deleteAnItemFromCartTest() throws InterruptedException{
        deleteItems.clickOnTheFirstProduct();
        deleteItems.clickOnAddToCartButton();
        deleteItems.openCategoriesList();
        deleteItems.openCamerasCategory();
        deleteItems.clickOnTheSecondProduct();
        deleteItems.clickOnAddToCartButton();
        deleteItems.clickOnHomeButton();
        deleteItems.clickOnTheCartButton();
        deleteItems.clickOnEditCartButton();
        deleteItems.clickOnDeleteItemsButton();
        //nu isi da refresh pagina suficient de repede ca sa recunoasca update-ul din cos?
        WebElement itemsLeftInCart = driver.findElement(By.cssSelector("#entry_217825 > a > div.cart-icon > span"));
        Assert.assertEquals(itemsLeftInCart.getText(), "1");
    }

}
