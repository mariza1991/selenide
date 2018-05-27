package homework.pages.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MenuBlock extends ElementsContainer {

    public void chooseFromMenu(String item){
        switch (item) {
            case "Инвентарь":
                getRootMenuElement().$x("./li[2]").click();
                break;
            case "Задизайнено":
                getRootMenuElement().$x("./li[3]").click();
                break;
            case "Студия":
                getRootMenuElement().$x("./li[4]").click();
                break;
            case "Магазинус":
                getRootMenuElement().$x("./li[5]").click();
                break;
            case "Кафетериус":
                getRootMenuElement().$x("./li[6]").click();
                break;
            case "Ководство":
                getRootMenuElement().$x("./li[7]").click();
                break;
            case "Поиск":
                getRootMenuElement().$x("./li[8]").click();
                break;
            default:
                getRootMenuElement().$x("./li[1]").click();
                break;
        }
    }

    private SelenideElement getRootMenuElement(){
        return $x("//menu[@class='clearfix']");
    }
}
