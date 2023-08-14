package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToWishlistPage extends BasePage{
    public AddToWishlistPage(WebDriver driver) {super(driver);}
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

    By MP3PlayerCategory = By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(5) > a");
    public void clickOnMP3PlayerCategory() {driver.findElement(MP3PlayerCategory).click();}

    By Product1 = By.cssSelector("#entry_212408 > div > div:nth-child(7) > div > div.product-thumb-top");
    public void clickOnProduct1() {driver.findElement(Product1).click();}

    By AddProduct1ToWishlist = By.xpath
            ("//*[@id=\"image-gallery-216811\"]/div[1]/button");
    public void clickOnAddProduct1ToWishlist() {driver.findElement(AddProduct1ToWishlist).click();}

    By WishlistButton = By.cssSelector("#entry_217824 > a");
    public void clickOnWishlistButton() {driver.findElement(WishlistButton).click();}
}
