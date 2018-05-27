package homework.pages.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class IdeaMatrixPage {

    public IdeaMatrixPage ideaMatrixPageHeaderIsCorrect(){
        $x("//div[contains(@class, 'title')]/h1")
                .shouldHave(Condition.text("Матрица идей"));
        return this;
    }

    public IdeaMatrixPage search(String query) {
        $("input[name='Word']").setValue(query).pressEnter();
        return this;
    }

    public IdeaMatrixPage checkResultsAreVisible(){
        $x("//div[contains(@class, 'als-columns')]").shouldBe(Condition.visible);
        return this;
    }

    public IdeaMatrixPage checkNumberOfResultColumns(int number){
        $$x("//div[@class='col-6 col-self-tablet-12']").shouldHaveSize(number);
        return this;
    }
}
