package by.itacademy.abramovicho.auth;

import org.openqa.selenium.By;

public class AuthPagePath {
    static By pageTitle = By.cssSelector(".top");
    static By userNameField = By.cssSelector("#username");
    static By passwordField = By.cssSelector("#password");
    static By submitButton = By.cssSelector("#_submit");
    static By errorMessage = By.cssSelector(".login li");
}
