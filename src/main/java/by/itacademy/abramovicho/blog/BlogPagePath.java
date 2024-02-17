package by.itacademy.abramovicho.blog;

import org.openqa.selenium.By;

public class BlogPagePath {
    static By nutritionSection = By.cssSelector(".tui-header-bar-secondary a[href^='/section/nutrition/articles'] span");
    static By article = By.cssSelector(".item div");
}
