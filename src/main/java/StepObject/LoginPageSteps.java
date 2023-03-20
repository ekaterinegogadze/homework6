package StepObject;

import PageObject.LoginPage;

public class LoginPageSteps extends LoginPage {

    public LoginPageSteps LoginBtn() {
        loginButn.click();
        return this;
    }

    public LoginPageSteps EmailInput(String email) {
        emailInput.setValue(email);
        return this;
    }

    public LoginPageSteps PasswordInput(String password) {
        passwordInput.setValue(password).sendKeys();
        return this;
    }

}