package desktop.pages;

import abstractclasses.page.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//input[@type='email' and @placeholder='Email']")
    WebElement loginEmailField;

    @FindBy(xpath = "//input[@type='password' and @placeholder='Book Depository password']")
    WebElement loginPasswordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signInButton;

}
