package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutWithItemInCartPage extends BasePage{
    public CheckoutWithItemInCartPage(WebDriver driver) {super(driver);}
    By MyAccountButton = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");
    public void clickOnTheMyAccountButton () {driver.findElement(MyAccountButton).click();}
    By EmailField = By.id("input-email");
    public void enterEmailAdress (String arg1) {driver.findElement(EmailField).sendKeys(arg1);}

    By PasswordField = By.id("input-password");
    public void enterPassword(String arg2) {driver.findElement(PasswordField).sendKeys(arg2);}

    By SubmitLoginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");
    public void clickOnTheSubmitLoginButton() {driver.findElement(SubmitLoginButton).click();}

    By HomePage = By.id("entry_217821");
    public void clickOnTheHomePageButton() {driver.findElement(HomePage).click();}

    By AddFirstProduct = By.cssSelector("#mz-product-listing-image-37213259-0-0 > div > div.carousel-item.active > img");
    public void clickOnTheFirstProduct() {driver.findElement(AddFirstProduct).click();}

    By AddToCartButton = By.cssSelector("#entry_216842 > button");
    public void clickOnAddToCartButton() {driver.findElement(AddToCartButton).click();}
    By CartButton = By.xpath("/html/body/div[1]/div[9]/header/div[2]/div[1]/div[5]/a");
    public void clickOnTheCartButton() {driver.findElement(CartButton).click();}

    By EditCartButton = By.cssSelector("#entry_217850 > a");
    public void clickOnEditCartButton() {driver.findElement(EditCartButton).click();}

    By CheckoutButton = By.linkText("Checkout");
    public void clickOnCheckoutButton() {driver.findElement(CheckoutButton).click();}

    By AcceptTermsConditions = By.cssSelector("#form-checkout > div > div.col-lg-7.mb-5.mb-lg-0 > div > div:nth-child(6) > label");
    public void clickOnAcceptTermsConditionsButton() {driver.findElement(AcceptTermsConditions).click();}

    By ContinueButton = By.id("button-save");
    public void clickOnContinueButton() {driver.findElement(ContinueButton).click();}

    By ConfirmOrderButton = By.id("button-confirm");
    public void clickOnConfirmOrderButton() {driver.findElement(ConfirmOrderButton).click();}
}
