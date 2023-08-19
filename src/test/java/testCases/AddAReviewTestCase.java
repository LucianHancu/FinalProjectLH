package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddAReviewPage;
import pages.BasePage;

public class AddAReviewTestCase extends BasePage {
    private AddAReviewPage review;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        review = new AddAReviewPage(driver);
    }
    @Test
    public void addAReviewTest() throws InterruptedException {
        review.selectAnItem();
        review.addRating();
        review.reviewerName("Lucian");
        review.addAReview("Acest review trebuie să conțină cel puțin 25 de caractere.");
        review.clickOnAddReviewButton();
        WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[2]"));
        Assert.assertTrue(confirmation.isDisplayed());
    }
}
