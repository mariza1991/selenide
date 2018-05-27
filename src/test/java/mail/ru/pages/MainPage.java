package mail.ru.pages;

import mail.ru.pages.components.LoginBlock;
import mail.ru.pages.mail.EmailMainPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private LoginBlock loginBlock;

    public static MainPage enterToMainPage(){
        open("http://mail.ru");
        return page(MainPage.class); //return this;
    }

    public MainPage inputToUsername(String username){
        loginBlock.inputToUsername(username);
        return this;
    }

    public MainPage inputToPassword(String password){
        loginBlock.inputToPassword(password);
        return this;
    }

    public MainPage chooseDomain(String domain) {
        $("select.o-control").selectOptionContainingText(domain);
        return this;
    }

    public EmailMainPage clickOnButtonLogin(){
        $(By.cssSelector("#mailbox\\:submit")).click();
        return page(EmailMainPage.class);
    }
}
