package Pages;

import PageElements.Header;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private SelenideElement logo = $x("//a[@class='HeaderLogo']");
    Header headerLogo = new Header(logo);

    @Step("Проверка видимости лого")
    public SearchPage checkLogo(){
        headerLogo.checkLogo();
        return this;
    }
}
