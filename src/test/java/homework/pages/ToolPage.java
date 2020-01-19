package homework.pages;

import com.codeborne.selenide.Condition;
import homework.pages.components.IdeaMatrixPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class ToolPage {

    public ToolPage toolPageHeaderIsCorrect(){
        $x("//div[contains(@class, 'title')]/h1")
                .shouldHave(Condition.text("Полезные всякие штуки"));
        return this;
    }

    //add to test
    public IdeaMatrixPage goToIdeaMatrixFromToolPage(){
        $("#item-matrix").click();
        return page(IdeaMatrixPage.class);
    }
}
