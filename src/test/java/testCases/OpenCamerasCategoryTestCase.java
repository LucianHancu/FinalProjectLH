package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.OpenCamerasCategoryPage;

public class OpenCamerasCategoryTestCase extends BasePage {
    private OpenCamerasCategoryPage categoryList;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        categoryList = new OpenCamerasCategoryPage(driver);
    }
    @Test
    public void openCamerasCategoryTest() throws InterruptedException{
        categoryList.openCategoriesList();
        categoryList.openCamerasCategory();
        WebElement category = driver.findElement(By.id("entry_212392"));
        Assert.assertEquals(category.getText(), "Cameras");
    }
}
