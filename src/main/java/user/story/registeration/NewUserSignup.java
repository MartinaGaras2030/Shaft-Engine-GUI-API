package user.story.registeration;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserSignup {
    SHAFT.GUI.WebDriver driver;
    private String url = "https://automationexercise.com/login";
    private By nameField_input = By.name("name");
    private By emailField_input = By.cssSelector("input[data-qa='signup-email']");
    private By signUp_buttom = By.xpath("//button[@data-qa='signup-button']");

    public NewUserSignup(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.browser().navigateToURL(url);
    }


    public NewUserSignup signup(String username, String email) {
        driver.element().type(nameField_input, username);
        driver.element().type(emailField_input, email);
        driver.element().click(signUp_buttom);

        return this;

    }


}
