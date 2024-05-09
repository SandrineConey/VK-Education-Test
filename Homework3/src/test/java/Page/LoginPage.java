package Page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private By inputLogin = By.xpath("//div[@class='it_w']//input[@name='st.email']");
    private By inputPassword = By.xpath("//div[@class='it_w']//input[@name='st.password']");
    private By button = By.xpath("//div[@class='login-form-actions']//input[@class='button-pro __wide']");


    public void input(String login, String password) {
        $(inputLogin).shouldBe(visible).setValue(login);
        $(inputPassword).shouldBe(visible).setValue(password);
        $(button).shouldBe(visible).click();
    }

    public boolean check() {
        $(byText("Друзья")).shouldBe(visible);
        return true;
    }
}