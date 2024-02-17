package by.itacademy.abramovicho.home;

import org.openqa.selenium.By;

public class HomePagePath {
    static By copyRight = By.cssSelector(".copyright-text");
    static By loginButton = By.cssSelector("a[href='/login']");
    static By blogMenuItem = By.cssSelector("#headerMenu a[href^='https://blog']");
    static By searchField = By.cssSelector(".search");
    static By searchButton = By.cssSelector(".formSearch [type='submit']");
}
