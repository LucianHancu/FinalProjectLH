package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {
    public LogoutPage(WebDriver driver) {super(driver);}

    By MyAccountButton = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");
    public void clickOnTheMyAccountButton () {driver.findElement(MyAccountButton).click();}

    By EmailField = By.id("input-email");
    public void enterEmailAdress (String arg1) {driver.findElement(EmailField).sendKeys(arg1);}

    By PasswordField = By.id("input-password");
    public void enterPassword(String arg2) {driver.findElement(PasswordField).sendKeys(arg2);}

    By SubmitLoginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");
    public void clickOnTheSubmitLoginButton() {driver.findElement(SubmitLoginButton).click();}

    By LogoutButton = By.cssSelector("#column-right > div > a:nth-child(14)");
    public void clickOnTheLogoutButton() {driver.findElement(LogoutButton).click();}
}
