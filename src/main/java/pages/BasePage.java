package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
public class BasePage {
    protected WebDriver driver;
    private String baseUrl = "https://ecommerce-playground.lambdatest.io/";
    public BasePage() {
    }
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    @BeforeClass
    public void setUp() {
        System.setProperty("web-driver.chrome.driver",
                "C:\\Users\\lucia\\IdeaProjects\\FinalProjectLH\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}