import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginWithExistingCredentialsPage;

public class LoginWithExistingCredentialsTestCase extends BasePage {
    private LoginWithExistingCredentialsPage login;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        login = new LoginWithExistingCredentialsPage(driver);
    }
    @Test
    public void loginWithExistingCredentialsTest() throws InterruptedException{
        login.clickOnTheMyAccountButton();
        login.enterEmailAdress("lucian.hancu@yahoo.com");
        login.enterPassword("parolaTest");
        login.clickOnTheSubmitLoginButton();
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[14]"));
        Assert.assertTrue(logoutButton.isDisplayed());
    }
}
