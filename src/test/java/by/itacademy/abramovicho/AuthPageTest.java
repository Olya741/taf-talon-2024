package by.itacademy.abramovicho;

import by.itacademy.abramovicho.auth.AuthPage;
import by.itacademy.abramovicho.home.HomePage;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AuthPageTest {

    EdgeDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://talon.by/");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void testLoginWithWrongCreds() {
        HomePage homePage = new HomePage(driver);
        homePage.openAuthPage();
        AuthPage authPage = new AuthPage(driver);
        authPage.inputUsername("test@test.com");
        authPage.inputPassword("123456");
        authPage.clickSubmitButton();

        Assert.assertEquals(authPage.getErrorMessage(), "Неверный e-mail (телефон) или пароль");
    }

    @Test
    public void testPageTitle() {
        HomePage homePage = new HomePage(driver);
        homePage.openAuthPage();
        AuthPage authPage = new AuthPage(driver);

        Assert.assertEquals(authPage.getPageTitle(), "Вход в систему");
    }
}
