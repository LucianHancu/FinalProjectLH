package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistToCartPage extends BasePage{
    public WishlistToCartPage(WebDriver driver) {super(driver);}
    By MyAccountButton = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");
    public void clickOnTheMyAccountButton () {driver.findElement(MyAccountButton).click();}

    By EmailField = By.id("input-email");
    public void enterEmailAdress (String arg1) {driver.findElement(EmailField).sendKeys(arg1);}

    By PasswordField = By.id("input-password");
    public void enterPassword(String arg2) {driver.findElement(PasswordField).sendKeys(arg2);}

    By SubmitLoginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");
    public void clickOnTheSubmitLoginButton() {driver.findElement(SubmitLoginButton).click();}

    By WishlistButton = By.cssSelector("#entry_217824 > a");
    public void clickOnWishlistButton() {driver.findElement(WishlistButton).click();}

    By AddToCartFromWishlistButton = By.cssSelector
            ("#content > div.table-responsive > table > tbody > tr > td.text-right.text-nowrap > button");
    public void clickOnAddToCartButton() {driver.findElement(AddToCartFromWishlistButton).click();}

    By CartButton = By.xpath("//*[@id=\"entry_217825\"]");
    public void clickOnCartButton() {driver.findElement(CartButton).click();}
    By EditCartButton = By.cssSelector("#entry_217850 > a");
    public void clickOnEditCartButton() {driver.findElement(EditCartButton).click();}
    By HomeButton = By.cssSelector("#widget-navbar-217834 > ul > li:nth-child(1) > a");
    public void clickOnHomeButton() {driver.findElement(HomeButton).click();}
    By PhoneTabletsCategory = By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(3) > a");
    public void openPhoneTabletCategory() {driver.findElement(PhoneTabletsCategory).click();}
    By Item = By.id("mz-product-grid-image-32-212408");
    public void clickOnAnItem() {driver.findElement(Item).click();}
    By AddItemToWishlist = By.cssSelector("#image-gallery-216811 > div.image-thumb.d-flex > button");
    public void clickOnAddToWishlistButtoN() {driver.findElement(AddItemToWishlist).click();}
    By CategoriesList = By.cssSelector("#entry_217832 > a");
    public void openCategoriesList() {driver.findElement(CategoriesList).click();}

}
