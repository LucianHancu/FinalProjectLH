package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCamerasCategoryPage extends BasePage{
    public OpenCamerasCategoryPage(WebDriver driver) {super(driver);}
    By CategoriesList = By.cssSelector("#entry_217832 > a");
    public void openCategoriesList() {driver.findElement(CategoriesList).click();}

    By CamerasCategory = By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(2) > a");
    public void openCamerasCategory() {driver.findElement(CamerasCategory).click();}
}
