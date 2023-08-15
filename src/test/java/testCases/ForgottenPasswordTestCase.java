package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ForgottenPasswordPage;

public class ForgottenPasswordTestCase extends BasePage {
private ForgottenPasswordPage forgotpass;
    @BeforeMethod
    public void setUp(){
    super.setUp();
    forgotpass = new ForgottenPasswordPage(driver);
}
    @Test
    public void ForgoottenPasswordTes() throws InterruptedException {
        forgotpass.clickOnTheMyAccountButton();
        forgotpass.clickOnForgottenPasswordButton();
        forgotpass.enterEmailAdress("lucian.hancu@yahoo.com");
        forgotpass.clickOnContinueButton();
        WebElement confirmationLink = driver.findElement
                (By.cssSelector("#account-login > div.alert.alert-success.alert-dismissible"));
        Assert.assertEquals(confirmationLink.getText(),
                "An email with a confirmation link has been sent your email address.");
    }
}
