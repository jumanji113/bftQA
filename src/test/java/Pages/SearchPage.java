package Pages;

import PageElements.PageElementYandex;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private PageElementYandex logo = new PageElementYandex($x("//a[@class='HeaderLogo']"));

    @Step("Проверка видимости лого")
    public SearchPage checkLogo(){
        logo.sholdBeVisible();
        return this;
    }
}
