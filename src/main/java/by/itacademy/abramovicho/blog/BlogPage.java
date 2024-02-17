package by.itacademy.abramovicho.blog;

import org.openqa.selenium.edge.EdgeDriver;

public class BlogPage {
    EdgeDriver driver;

    public BlogPage(EdgeDriver driver) {
        this.driver = driver;
    }

    public String getSectionName() {
        return driver.findElement(BlogPagePath.nutritionSection).getText();
    }

    public void selectSection() {
        driver.findElement(BlogPagePath.nutritionSection).click();
    }

    public void openArticle() {
        driver.findElement(BlogPagePath.article).click();
    }
}
