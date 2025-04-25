package Pages;

import PageElements.Button;
import PageElements.Input;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {
    private final Input searchInput= new Input("//input[@placeholder='Найдётся всё']");
    private final Button searchButton = new Button("//button[text()='Найти']");

    public YandexMainPage setInputValue(String value){
        searchInput.setValue(value);
        return this;
    }

    public SearchPage clickButton(){
        searchButton.clickButton();
        return new SearchPage();
    }

}
