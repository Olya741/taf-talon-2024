package by.itacademy.abramovicho.auth;

import org.openqa.selenium.edge.EdgeDriver;

public class AuthPage {
    EdgeDriver driver;

    public AuthPage(EdgeDriver driver) {
        this.driver = driver;
    }

    public void inputUsername(String username) {
        driver.findElement(AuthPagePath.userNameField).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(AuthPagePath.passwordField).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(AuthPagePath.submitButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(AuthPagePath.errorMessage).getText();
    }

    public String getPageTitle() {
        return driver.findElement(AuthPagePath.pageTitle).getText();
    }
}
