package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage{
    public AddToCartPage(WebDriver driver) {super(driver);}

    By AddFirstProduct = By.cssSelector("#mz-product-listing-image-37213259-0-0 > div > div.carousel-item.active > img");
    public void clickOnTheFirstProduct() {driver.findElement(AddFirstProduct).click();}

    By AddToCartButton = By.cssSelector("#entry_216842 > button");
    public void clickOnAddToCartButton() {driver.findElement(AddToCartButton).click();}

    By CartButton = By.xpath("/html/body/div[1]/div[9]/header/div[2]/div[2]/div[4]/a");
    public void clickOnTheCartButton() {driver.findElement(CartButton).click();}

    By EditCardButton = By.cssSelector("#entry_217850 > a");
    public void clickOnEditCartButton() {driver.findElement(EditCardButton).click();}
}
