package PageElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;


@Data
public class Header {
    private SelenideElement selector;

    public Header(String selector) {
        this.selector = $x(selector);
    }

    @Step("Проверяем наличие лого")
    public Header checkLogo() {
        selector.shouldBe(Condition.visible);
        return this;
    }
}
