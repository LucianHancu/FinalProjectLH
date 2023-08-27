package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginWithNonExistingCredentialsPage;

public class LoginWithNonExistingCredentialsTestCase extends BasePage {
    private LoginWithNonExistingCredentialsPage login;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        login = new LoginWithNonExistingCredentialsPage(driver);
    }
    @Test
    public void loginWithNonExistingCredentialsTest() throws InterruptedException {
        login.clickOnTheMyAccountButton();
        login.enterEmailAdress("adresa.mail@yahoo.com");
        login.enterPassword("parolaTest");
        login.clickOnTheSubmitLoginButton();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]"));
        Assert.assertEquals(errorMessage.getText(),"Warning: No match for E-Mail Address and/or Password.");
    }
    @Test
    public void loginWithIncompleteCredentialsTest() throws InterruptedException{
        login.clickOnTheMyAccountButton();
        login.enterEmailAdress("lucian.hancu");
        login.enterPassword("parolaTest");
        login.clickOnTheSubmitLoginButton();
        WebElement warningMessage = driver.findElement(By.cssSelector
                ("#account-login > div.alert.alert-danger.alert-dismissible"));
        Assert.assertTrue(warningMessage.isDisplayed());
    }
}
