package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private SelenideElement logo = $x("//a[@class='HeaderLogo']");

    @Step("Проверка видимости лого")
    public SearchPage checkLogo(){
        logo.shouldBe(Condition.visible);
        return this;
    }
}
