package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    public SelenideElement

            emailInput = $(byClassName("a-input-text a-span12 auth-autofocus auth-required-field")),
            passwordInput = $(byClassName("a-input-text a-span12 auth-autofocus auth-required-field")),
            loginButn = $(".a-button-input");
    public ElementsCollection
    test = $$("dssfd");

}









