package uiTest;

import Pages.YandexMainPage;

import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FirstPageObjectTest {

    @Test
    @DisplayName("Проверка поиска и иконки яндекса")
    public void firstTest(){
        String expectedValue = "bft";
        open("https://ya.ru/");
        YandexMainPage ymp = new YandexMainPage();
        ymp.setInputValue(expectedValue)
                .clickButton()
                .checkLogo();
    }
}
