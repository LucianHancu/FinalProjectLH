package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LogoutPage;

public class LogoutTestCase extends BasePage {
    private LogoutPage logout;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        logout = new LogoutPage(driver);
    }
    @Test
    public void LogoutTest() throws InterruptedException {
        logout.clickOnTheMyAccountButton();
        logout.enterEmailAdress("lucian.hancu@yahoo.com");
        logout.enterPassword("parolaTest");
        logout.clickOnTheSubmitLoginButton();
        logout.clickOnTheLogoutButton();
        WebElement logoutConfirmation = driver.findElement(By.cssSelector("#content > p:nth-child(3)"));
        Assert.assertEquals(logoutConfirmation.getText(),
                "You have been logged off your account. It is now safe to leave the computer.");
    }
}
