package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccountPage extends BasePage{
    public RegisterAccountPage(WebDriver driver) {super(driver);}

    By MyAccountButton = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");
    public void clickOnTheMyAccountButton () {driver.findElement(MyAccountButton).click();}

    By RegisterAccountButton = By.linkText("Continue");
    public void clickOnContinueButton() {driver.findElement(RegisterAccountButton).click();}

    By FirstName = By.id("input-firstname");
    public void enterFirstName(String firstName) {driver.findElement(FirstName).sendKeys(firstName);}

    By LastName = By.id("input-lastname");
    public void enterLastName(String lastName) {driver.findElement(LastName).sendKeys(lastName);}

    By Email = By.id("input-email");
    public void enterEmail(String email) {driver.findElement(Email).sendKeys(email);}

    By TelephoneNumber = By.id("input-telephone");
    public void enterTelephoneNumber(String telephone) {driver.findElement(TelephoneNumber).sendKeys(telephone);}

    By Password = By.id("input-password");
    public void enterPassword(String password) {driver.findElement(Password).sendKeys(password);}

    By ConfirmPassword = By.id("input-confirm");
    public void enterPasswordConfirmation(String password2) {driver.findElement(ConfirmPassword).sendKeys(password2);}

    By TermsAgree = By.xpath("//*[@id=\"content\"]/form/div/div/div/label");
    public void clickOnAgreeTermsConditions() {driver.findElement(TermsAgree).click();}

    By ContinueButton = By.cssSelector("#content > form > div > div > input");
    public void clickOnContinueButton2() {driver.findElement(ContinueButton).click();}
}
