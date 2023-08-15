package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareItemsPage extends BasePage{
    public CompareItemsPage(WebDriver driver) {super(driver);}
    By LaptopsCategory = By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a");
    public void clickOnLaptopsCategory() {driver.findElement(LaptopsCategory).click();}
    By Product1 = By.cssSelector("#mz-product-grid-image-28-212408 > div > div.carousel-item.active > img");
    public void clickOnProduct1() {driver.findElement(Product1).click();}
    By CompareProduct1 = By.cssSelector("#entry_216844 > button");
    public void clickOnCompareProduct1() {driver.findElement(CompareProduct1).click();}
    By LaptopsPage = By.linkText("Laptops");
    public void clickOnLaptopsPage() {driver.findElement(LaptopsPage).click();}
    By Product2 = By.cssSelector("#mz-product-grid-image-29-212408 > div > div.carousel-item.active > img");
    public void clickOnProduct2() {driver.findElement(Product2).click();}
    By CompareProduct2 = By.cssSelector("#entry_216844 > button");
    public void clickOnCompareProduct2() {driver.findElement(CompareProduct2).click();}
    By CompareButton = By.cssSelector("#entry_217823 > a");
    public void clickOnCompareButton() {driver.findElement(CompareButton).click();}

}
