package uiTest;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FirstUi {

    @Test
    @DisplayName("Проверка поиска и иконки яндекса")
    public void firstTest(){
        open("https://ya.ru/");
        $x("//input[@placeholder='Найдётся всё']").setValue("bft");
        $x("//button[text()='Найти']").click();
        $x("//a[@class='HeaderLogo']").shouldBe(Condition.visible);
    }
}
