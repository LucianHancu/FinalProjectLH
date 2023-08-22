package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CompareItemsPage;

import java.util.concurrent.TimeUnit;

public class CompareItemsTestCase extends BasePage {
    private CompareItemsPage compare;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        compare = new CompareItemsPage(driver);
    }
    @Test
    public void compareItemsTest()  throws InterruptedException{
        compare.clickOnLaptopsCategory();
        compare.clickOnProduct1();
        compare.clickOnCompareProduct1();
        compare.clickOnLaptopsPage();
        compare.clickOnProduct2();
        compare.clickOnCompareProduct2();
        compare.clickOnHomeButton();
        compare.clickOnCompareButton();
        WebElement product1 = driver.findElement(By.linkText("HTC Touch HD"));
        WebElement product2 = driver.findElement(By.linkText("Palm Treo Pro"));
        Assert.assertTrue(product1.isDisplayed() & product2.isDisplayed());
    }
}
