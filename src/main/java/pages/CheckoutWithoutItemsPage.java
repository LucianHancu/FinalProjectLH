package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutWithoutItemsPage extends BasePage{
    public CheckoutWithoutItemsPage(WebDriver driver) {super(driver);}

    By CartButton = By.id("entry_217825");
    public void clickOnTheCartButton() {driver.findElement(CartButton).click();}

    By CheckoutButton = By.linkText("Checkout");
    public void clickOnCheckoutButton() {driver.findElement(CheckoutButton).click();}
}
