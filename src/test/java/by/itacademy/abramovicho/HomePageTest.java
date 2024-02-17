package by.itacademy.abramovicho;

import by.itacademy.abramovicho.home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage;

    @Test
    public void testCopyRightText() {
        homePage = new HomePage(driver);
        String expected = "© ЗАО «Мапсофт», 2010-2024\n" + "Все права защищены";
        Assert.assertEquals(homePage.getCopyrightText(), expected);
    }
}
