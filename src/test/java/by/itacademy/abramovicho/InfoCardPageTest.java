package by.itacademy.abramovicho;

import by.itacademy.abramovicho.home.HomePage;
import by.itacademy.abramovicho.infoCard.InfoCardPage;
import by.itacademy.abramovicho.searchResult.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfoCardPageTest extends BaseTest {
    String searchText = "педиатр";

    @Test
    public void testSearchItemName() {
        HomePage homePage = new HomePage(driver);
        homePage.inputTextInSearchField(searchText);
        homePage.clickSearchButton();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        String someText = searchResultPage.getSearchItemInfo();
        searchResultPage.openInfoCard();
        InfoCardPage info = new InfoCardPage(driver);

        Assert.assertEquals(info.getClinicName(), someText);
    }
}
