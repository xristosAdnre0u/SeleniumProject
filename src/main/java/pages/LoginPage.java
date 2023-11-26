package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By formFieldName = By.id("user-name");
    private By formFieldPassword = By.id("password");
    private By loginButton = By.id("login-button");
    private By headerTitle = By.className("app_logo");




    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(formFieldName).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(formFieldPassword).sendKeys(password);
    }

    public void  clickLoginButton () {
        driver.findElement(loginButton).click();
    }

    public String getTitle() {

         return driver.findElement(headerTitle).getText();

    }

}
