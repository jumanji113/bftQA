package PageElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

@Data
public class Input {
    private final SelenideElement selector;

    public Input(String selector) {
        this.selector = $x(selector);
    }

    @Step("Вводим нужное значение в input")
    public Input setValue(String value) {
        selector.shouldBe(Condition.visible).setValue(value);
        return this;
    }

    @Step("Очистка поля ввода")
    public void clear() {
        selector.clear();
    }

    @Step("Проверка значения в поле ввода")
    public String getValue() {
        return selector.getValue();
    }
}
