package Pages;

import PageElements.Button;
import PageElements.Input;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {
    SelenideElement searchInput= $x("//input[@placeholder='Найдётся всё']");
    SelenideElement searchButton = $x("//button[text()='Найти']");

    Button buttonSearch = new Button("searchButton", searchButton);
    Input inputText = new Input(searchInput);

    public YandexMainPage setInputValue(String value){
        inputText.setValue(value);
        return this;
    }

    public SearchPage clickButton(){
        buttonSearch.buttonClick();
        return new SearchPage();
    }

}
