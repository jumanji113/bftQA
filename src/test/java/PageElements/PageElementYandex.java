package PageElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class PageElementYandex {
    private SelenideElement element;

    public PageElementYandex(SelenideElement element) {
        this.element = element;
    }

    public PageElementYandex setValue(String value){
        element.setValue(value);
        return this;
    }

    public PageElementYandex click(){
        element.click();
        return this;
    }


    public PageElementYandex sholdBeVisible(){
        element.shouldBe(Condition.visible);
        return this;
    }
}
