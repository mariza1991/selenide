package mail.ru.pages.mail;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EmailMainPage {

    public boolean checkVisible(){
        $(By.id("b-letters")).should(Condition.visible);
        return true;
    }
}
