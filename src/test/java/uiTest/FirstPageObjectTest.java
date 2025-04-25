package uiTest;

import Pages.YandexMainPage;

import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FirstPageObjectTest extends BaseTest{

    private final static String EXPECTED_VALUE = "bft";
    @Test
    @DisplayName("Проверка поиска и иконки яндекса")
    public void firstTest(){
        YandexMainPage ymp = new YandexMainPage();
        ymp.setInputValue(EXPECTED_VALUE)
                .clickButton()
                .checkLogo();
    }

    @Test
    @DisplayName("Проверка исключений")
    public void exeption(){
        System.out.println((String)null);
        try {
            Assertions.assertTrue(false);
        } catch (AssertionError e){
            System.out.println("Возникла ошибка типа : " + e);
        }

    }
}
