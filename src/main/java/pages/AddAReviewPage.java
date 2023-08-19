package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAReviewPage extends BasePage{
    public AddAReviewPage(WebDriver driver) {super(driver);}
    By SelectAnItem = By.id("mz-product-listing-image-39213264-0-1");
    public void selectAnItem() {driver.findElement(SelectAnItem).click();}

    By AddRating = By.xpath("//*[@id=\"form-review\"]/div[1]/span/label[1]");
    public void addRating() {driver.findElement(AddRating).click();}
    By EnterReviewerName = By.id("input-name");
    public void reviewerName(String name) {driver.findElement(EnterReviewerName).sendKeys(name);}
    By AddReview = By.id("input-review");
    public void addAReview(String review){driver.findElement(AddReview).sendKeys(review);}
    By AddReviewButton = By.id("button-review");
    public void clickOnAddReviewButton(){driver.findElement(AddReviewButton).click();}
}
