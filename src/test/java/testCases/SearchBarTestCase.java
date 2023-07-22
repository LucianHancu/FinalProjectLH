package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchBarPage;

public class SearchBarTestCase extends BasePage {
    private SearchBarPage searchBar;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        searchBar = new SearchBarPage(driver);
    }

    @Test
    public void searchBarTest() throws InterruptedException{
        searchBar.typeInTheSearchBar("iphone");
        searchBar.clickOnTheSearchButton();
        searchBar.clickOnTheFirstResult();
        WebElement result = driver.findElement(By.xpath("//*[@id=\"entry_216816\"]/h1"));
        Assert.assertEquals(result.getText(), "iPhone");
    }

    @Test
    public void noResultSearch() throws InterruptedException{
        searchBar.typeInTheSearchBar("iphone12");
        searchBar.clickOnTheSearchButton();
        WebElement noResult = driver.findElement(By.xpath("//*[@id=\"entry_212469\"]/p"));
        Assert.assertEquals(noResult.getText(), "There is no product that matches the search criteria.");
    }

}
