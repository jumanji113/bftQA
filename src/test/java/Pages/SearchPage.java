package Pages;

import PageElements.Button;
import PageElements.Header;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final Header headerLogo = new Header("//a[@class='HeaderLogo']");

    @Step("Проверка видимости лого")
    public SearchPage checkLogo(){
        headerLogo.checkLogo();
        return this;
    }
}
