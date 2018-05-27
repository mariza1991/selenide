package mail.ru.pages.components;

import com.codeborne.selenide.ElementsContainer;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginBlock extends ElementsContainer {

    public void inputToUsername(String username){
        $("#mailbox\\:login").setValue(username);
    }

    public void inputToPassword(String password){
        $x("//*[@id='mailbox:password']").setValue(password);
    }
}
