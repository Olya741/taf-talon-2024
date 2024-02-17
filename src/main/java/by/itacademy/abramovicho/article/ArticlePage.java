package by.itacademy.abramovicho.article;

import org.openqa.selenium.edge.EdgeDriver;

public class ArticlePage {
    EdgeDriver driver;

    public ArticlePage(EdgeDriver driver) {
        this.driver = driver;
    }

    public String getArticleSectionName() {
        return driver.findElement(ArticlePagePath.sectionName).getText();
    }
}
