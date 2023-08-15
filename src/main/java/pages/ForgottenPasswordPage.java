package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPasswordPage extends BasePage{
    public ForgottenPasswordPage(WebDriver driver) {super(driver);}
    By MyAccountButton = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");
    public void clickOnTheMyAccountButton () {driver.findElement(MyAccountButton).click();}
    By ForgottenPasswordButton = By.linkText("Forgotten Password");
    public void clickOnForgottenPasswordButton() {driver.findElement(ForgottenPasswordButton).click();}
    By EmailAdress = By.id("input-email");
    public void enterEmailAdress(String arg1) {driver.findElement(EmailAdress).sendKeys(arg1);}
    By ContinueButton = By.cssSelector("#content > form > div > div.float-right > button");
    public void clickOnContinueButton() {driver.findElement(ContinueButton).click();}
}
