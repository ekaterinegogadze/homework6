import StepObject.LoginPageSteps;
import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;
import static com.codeborne.selenide.Selenide.sleep;

//import static StepObject.LoginPageSteps.
//import static DataObject.RegisterPageData.*
public class RegisterPageTest extends ChromeRunner {
    RegisterPageSteps reg = new RegisterPageSteps();

    @Test
    public void RegisterMethod() {
        reg.RegiterBtn();
        sleep(5000);
    }
}