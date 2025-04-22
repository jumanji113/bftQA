package PageElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Header {
    private SelenideElement selector;

    @Step("Проверяем наличие лого")
    public Header checkLogo() {
        selector.shouldBe(Condition.visible);
        return this;
    }
}
