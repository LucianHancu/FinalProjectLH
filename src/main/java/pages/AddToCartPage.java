package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage extends BasePage{
    public AddToCartPage(WebDriver driver) {super(driver);}

    By AddFirstProduct = By.cssSelector("#mz-product-listing-image-37213259-0-0 > div > div.carousel-item.active > img");
    public void clickOnTheFirstProduct() {driver.findElement(AddFirstProduct).click();}

    By AddToCartButton = By.cssSelector("#entry_216842 > button");
    public void clickOnAddToCartButton() {driver.findElement(AddToCartButton).click();}

    By CartButton = By.xpath("//*[@id=\"entry_217825\"]/a");
    public void clickOnTheCartButton() {driver.findElement(CartButton).click();}

    By EditCartButton = By.cssSelector("#entry_217850 > a");
    public void clickOnEditCartButton() {driver.findElement(EditCartButton).click();}

    By QuantityField = By.cssSelector
            ("#content > form > div > table > tbody > tr > td:nth-child(4) > div > input");
    public void updateProductQuantity(String arg1) {driver.findElement(QuantityField).sendKeys(arg1);}

    By UpdateQuantityButton = By.cssSelector
            ("#content > form > div > table > tbody > tr > td:nth-child(4) > div > div > button.btn.btn-primary");
    public void clickOnUpdateQuantityButton() {driver.findElement(UpdateQuantityButton).click();}

    By IncreaseItemsButton = By.xpath("//*[@id=\"entry_216841\"]/div/div[2]/button");
    public void clickOnIncreaseItemsButton() {driver.findElement(IncreaseItemsButton).click();}

    By HomeButton = By.cssSelector("#widget-navbar-217834 > ul > li:nth-child(1) > a");
    public void clickOnHomeButton() {driver.findElement(HomeButton).click();}

}


