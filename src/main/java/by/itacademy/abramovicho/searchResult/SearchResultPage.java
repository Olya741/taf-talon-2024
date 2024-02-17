package by.itacademy.abramovicho.searchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchResultPage {
    EdgeDriver driver;

    public SearchResultPage(EdgeDriver driver) {
        this.driver = driver;
    }

    public String getSearchItemInfo() {
        WebElement header = driver.findElement(SearchResultPagePath.searchResultItem);
        return header.findElement(By.cssSelector("h5")).getText();
    }

    public void openInfoCard() {
        driver.findElement(SearchResultPagePath.searchResultItem).click();
    }
}
