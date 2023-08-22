package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveFromWishlistPage extends BasePage{
    public RemoveFromWishlistPage(WebDriver driver) {super(driver);}

    By MyAccountButton = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");
    public void clickOnTheMyAccountButton () {driver.findElement(MyAccountButton).click();}

    By EmailField = By.id("input-email");
    public void enterEmailAdress (String arg1) {driver.findElement(EmailField).sendKeys(arg1);}

    By PasswordField = By.id("input-password");
    public void enterPassword(String arg2) {driver.findElement(PasswordField).sendKeys(arg2);}

    By SubmitLoginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");
    public void clickOnTheSubmitLoginButton() {driver.findElement(SubmitLoginButton).click();}

    By CategoriesList = By.cssSelector("#entry_217832 > a");
    public void clickOnCategoriesList() {driver.findElement(CategoriesList).click();}

    By SoftwareCategory = By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(4) > a");
    public void clickOnSoftwareCategory() {driver.findElement(SoftwareCategory).click();}

    By Product3 = By.id("mz-product-grid-image-30-212408");
    public void clickOnProduct3() {driver.findElement(Product3).click();}

    By AddProduct3ToWishlist = By.cssSelector("#image-gallery-216811 > div.image-thumb.d-flex > button");
    public void addToWishlistButton() {driver.findElement(AddProduct3ToWishlist).click();}

    By WishlistButton = By.cssSelector("#column-right > div > a:nth-child(5)");
    public void clickOnWishlistButton() {driver.findElement(WishlistButton).click();}

    By RemoveFromWishlistButton = By.cssSelector
            ("#content > div.table-responsive > table > tbody > tr > td.text-right.text-nowrap > a");
    public void clickOnRemoveFromWishlistButton() {driver.findElement(RemoveFromWishlistButton).click();}
    By HomeButton = By.cssSelector("#widget-navbar-217834 > ul > li:nth-child(1) > a");
    public void clickOnHomeButton() {driver.findElement(HomeButton).click();}
}
