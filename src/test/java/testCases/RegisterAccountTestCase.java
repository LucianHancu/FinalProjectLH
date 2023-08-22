package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterAccountPage;

public class RegisterAccountTestCase extends BasePage {
    private RegisterAccountPage register;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        register = new RegisterAccountPage(driver);
    }

    @Test
    public void registerAccountTest() throws InterruptedException {
        register.clickOnTheMyAccountButton();
        register.clickOnContinueButton();
        register.enterFirstName("Prenume");
        register.enterLastName("Nume");
        register.enterEmail("adresa.email13@gmail.com");
        register.enterTelephoneNumber("12334567890");
        register.enterPassword("parolaTest");
        register.enterPasswordConfirmation("parolaTest");
        register.clickOnAgreeTermsConditions();
        register.clickOnContinueButton2();
        WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]"));
        Assert.assertEquals(confirmation.getText(), "Congratulations! Your new account has been successfully created!");
    }
}
