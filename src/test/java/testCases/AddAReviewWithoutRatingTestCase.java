package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddAReviewWithoutRatingPage;
import pages.BasePage;

public class AddAReviewWithoutRatingTestCase extends BasePage {
    private AddAReviewWithoutRatingPage noRating;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        noRating = new AddAReviewWithoutRatingPage(driver);
    }
    @Test
    public void addAReviewWithoutRatingTest() throws InterruptedException{
        noRating.selectAnItem();
        noRating.reviewerName("Lucian");
        noRating.addAReview("Acest review va genera o eroare deoarece nu am selectat un rating al produsului.");
        noRating.clickOnAddReviewButton();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[2]"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
