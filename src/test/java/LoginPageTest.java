import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps log = new LoginPageSteps();
    @Test
    public void UserNameOrPassword(){
        $(byClassName("nav-cart-count nav-cart-0 nav-progressive-attribute nav-progressive-content")).click();
        $(byClassName("a-size-base-plus")).click();
        log.LoginBtn()
                .EmailInput(email)
                .PasswordInput(password);

        sleep(5000);

    }
}