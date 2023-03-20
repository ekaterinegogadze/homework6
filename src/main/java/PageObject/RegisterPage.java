package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
      public SelenideElement
              registerInput = $("nav-cart-icon nav-sprite").$(byText("Sign up now")),
              FirstandlastnameInput = $(byClassName("a-input-text a-span12 auth-autofocus auth-required-field")),
              emailInput = $(byClassName("a-input-text a-span12 a-spacing-micro auth-required-field auth-require-claim-validation")),
              passwordInput = $(byClassName("a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation")),
              confirmpassword = $(byClassName("a-input-text a-span12 auth-required-field auth-require-fields-match")),
              registerBtn = $(byId("continue"));
}
