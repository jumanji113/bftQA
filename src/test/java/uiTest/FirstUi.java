package uiTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;


public class FirstUi {

    @Test
    @DisplayName("Проверка поиска и иконки яндекса")
    public void firstTest(){
        Selenide.open("https://ya.ru/");
        $x("//input[@placeholder='Найдётся всё']").setValue("bft");
        $x("//button[text()='Найти']").click();
        $x("//a[@class='HeaderLogo']").shouldBe(Condition.visible);
    }
}
