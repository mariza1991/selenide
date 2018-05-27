package homework.pages;

import homework.pages.components.MenuBlock;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage extends BasePage<MainPage> {

    private MenuBlock menuBlock;

    public static MainPage enterToMainPage(){
        open("https://artlebedev.ru/");
        return page(MainPage.class);
    }

    public ToolPage chooseToolFromMenu(){
        menuBlock.chooseFromMenu("Инвентарь");
        return page(ToolPage.class);
    }
}
