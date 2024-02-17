package by.itacademy.abramovicho;

import by.itacademy.abramovicho.article.ArticlePage;
import by.itacademy.abramovicho.blog.BlogPage;
import by.itacademy.abramovicho.home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogPageTest extends BaseTest {
    @Test
    public void testArticleSectionName() {
        HomePage homePage = new HomePage(driver);
        homePage.openBlogPage();
        BlogPage blogPage = new BlogPage(driver);
        String sectionName = blogPage.getSectionName();
        blogPage.selectSection();
        blogPage.openArticle();
        ArticlePage articlePage = new ArticlePage(driver);
        String articleSectionName = articlePage.getArticleSectionName();

        Assert.assertEquals(articleSectionName, sectionName.toUpperCase());
    }
}
