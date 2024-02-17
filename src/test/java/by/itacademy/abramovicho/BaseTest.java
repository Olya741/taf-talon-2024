package by.itacademy.abramovicho;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    EdgeDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://talon.by/");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
