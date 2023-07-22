package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBarPage extends BasePage {
    public SearchBarPage(WebDriver driver) {super(driver);}
    By SearchBar = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[2]/input");
    public void typeInTheSearchBar (String arg1) {driver.findElement(SearchBar).sendKeys(arg1);}
    By SearchButton = By.xpath("//*[@id=\"search\"]/div[2]/button");
    public void clickOnTheSearchButton () {driver.findElement(SearchButton).click();}
    By FirstResult = By.xpath("//*[@id=\"mz-product-grid-image-40-212469\"]/div/div[1]/img");
    public void clickOnTheFirstResult() {driver.findElement(FirstResult).click();}

}
