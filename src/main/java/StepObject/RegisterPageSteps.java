package StepObject;

import PageObject.RegisterPage;
import com.codeborne.selenide.ClickOptions;

import java.time.Duration;

public class RegisterPageSteps extends RegisterPage {
    public RegisterPageSteps EmailInput(String email){
        emailInput.setValue(email);
        return this;
    }

    public RegisterPageSteps passwordInput(String password){
        passwordInput.setValue(password).sendKeys();
        return this;
    }

    public RegisterPageSteps RegiterBtn(){
        registerBtn.click(ClickOptions.withTimeout(Duration.ofMillis(5000)));
        return this;
    }
}
