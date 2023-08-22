package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RemoveFromWishlistPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RemoveFromWishlistTestCase extends BasePage {
    private RemoveFromWishlistPage remove;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        remove = new RemoveFromWishlistPage(driver);
    }
    @Test
    public void removeItemFromWishlistTest() throws InterruptedException{
        remove.clickOnTheMyAccountButton();
        remove.enterEmailAdress("lucian.hancu@yahoo.com");
        remove.enterPassword("parolaTest");
        remove.clickOnTheSubmitLoginButton();
        remove.clickOnCategoriesList();
        remove.clickOnSoftwareCategory();
        remove.clickOnProduct3();
        remove.addToWishlistButton();
        remove.clickOnHomeButton();
        remove.clickOnTheMyAccountButton();
        remove.clickOnWishlistButton();
        remove.clickOnRemoveFromWishlistButton();
        WebElement confirmation = driver.findElement
                (By.xpath("//*[@id=\"content\"]/p"));
        Assert.assertEquals(confirmation.getText(), "No results!");
    }
}
