package by.itacademy.abramovicho.home;

import org.openqa.selenium.edge.EdgeDriver;

public class HomePage {
    EdgeDriver driver;

    public HomePage(EdgeDriver driver) {
        this.driver = driver;
    }

    public String getCopyrightText() {
        return driver.findElement(HomePagePath.copyRight).getText();
    }

    public void openAuthPage() {
        driver.findElement(HomePagePath.loginButton).click();
    }

    public void openBlogPage() {
        driver.findElement(HomePagePath.blogMenuItem).click();
    }

    public void inputTextInSearchField(String text) {
        driver.findElement(HomePagePath.searchField).sendKeys(text);
    }

    public void clickSearchButton() {
        driver.findElement(HomePagePath.searchButton).click();
    }
}
