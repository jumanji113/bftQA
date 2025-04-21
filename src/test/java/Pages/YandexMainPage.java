package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {
    SelenideElement searchELem= $x("//input[@placeholder='Найдётся всё']");
    SelenideElement searchButton = $x("//button[text()='Найти']");

    @Step("Вводим нужное значение в инпут")
    public YandexMainPage setInputValue(String value){
        searchELem.setValue(value);
        return this;
    }

    @Step("Нажимаем кнопку поиска")
    public SearchPage clickButton(){
        searchButton.click();
        return new SearchPage();
    }

}
