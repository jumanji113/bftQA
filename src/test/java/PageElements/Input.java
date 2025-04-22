package PageElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Input {
    private SelenideElement selector;

    @Step("Вводим нужное значение в input")
    public Input setValue(String value) {
        selector.shouldBe(Condition.visible).setValue(value);
        return this;
    }
}
