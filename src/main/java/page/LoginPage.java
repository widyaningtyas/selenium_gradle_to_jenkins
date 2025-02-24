package page;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final String signInToYourAccountH2 = "//h2[normalize-space()='New User Signup!']";
    private final String emailAddressLoginTxtBox = "//input[@data-qa='login-email']";
    private final String passwordTxtBox = "//input[@data-qa='login-password']";
    private final String loginBtn = "//button[@data-qa='login-button']";
    private final String nameTextBox = "//input[@data-qa='signup-name']";
    private final String emailAddressSignUpTxtBox = "//input[@data-qa='signup-email']";
    private final String signUpBtn = "//button[@data-qa='signup-button']";

    public void checkLoginPageIsAppear() {
        assertElementIsDisplayed(signInToYourAccountH2);
    }

    public void inputEmailAddressTextBox(String textToInput) {
        inputTextToElement(emailAddressLoginTxtBox, textToInput);
    }

    public void inputPasswordTextBox(String textToInput) {
        inputTextToElement(passwordTxtBox, textToInput);
    }

    public void clickLoginBtn() {
        clickElement(loginBtn);
    }

    public void inputNameTextBox(String textToInput) {
        inputTextToElement(nameTextBox, textToInput);
    }

    public void inputEmailAddressSignUpTextBox(String textToInput) {
        inputTextToElement(emailAddressSignUpTxtBox, textToInput);
    }

    public void clickSignUpBtn() {
        clickElement(signUpBtn);
    }

    public void doSignUp(String name, String emailAddress) {
        checkLoginPageIsAppear();
        inputNameTextBox(name);
        inputEmailAddressSignUpTextBox(emailAddress);
        clickSignUpBtn();
    }
}
