package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteItemsFromCartPage extends BasePage{
public DeleteItemsFromCartPage(WebDriver driver) {super(driver);}
    By AddFirstProduct = By.cssSelector("#mz-product-listing-image-37213259-0-0 > div > div.carousel-item.active > img");
    public void clickOnTheFirstProduct() {driver.findElement(AddFirstProduct).click();}

    By AddToCartButton = By.cssSelector("#entry_216842 > button");
    public void clickOnAddToCartButton() {driver.findElement(AddToCartButton).click();}

    By CartButton = By.xpath("//*[@id=\"entry_217825\"]");
    public void clickOnTheCartButton() {driver.findElement(CartButton).click();}

    By EditCartButton = By.cssSelector("#entry_217850 > a");
    public void clickOnEditCartButton() {driver.findElement(EditCartButton).click();}

    By DeleteItemsButton = By.cssSelector
            ("#content > form > div > table > tbody > tr > td:nth-child(4) > div > div > button.btn.btn-danger");
    public void clickOnDeleteItemsButton() {driver.findElement(DeleteItemsButton).click();}
}
