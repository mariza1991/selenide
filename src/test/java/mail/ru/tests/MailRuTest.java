package mail.ru.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import mail.ru.pages.MainPage;
import mail.ru.pages.mail.EmailMainPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static mail.ru.pages.MainPage.enterToMainPage;

public class MailRuTest {

    @BeforeTest
    public void before(){
        Configuration.browser = "chrome";
    }

    @Test
    public void mailRuLoginTest(){
        open("http://mail.ru");
        $("#mailbox\\:login").setValue("selenide");
        $x("//*[@id='mailbox:password']").setValue("123456!qA");
        $("select.o-control").selectOptionContainingText("bk.ru");
        $(By.cssSelector("#mailbox\\:submit")).click();
        $(By.id("b-letters")).should(Condition.visible);
    }

    @Test
    public void pageObjectTest(){
        MainPage mainPage;
        mainPage = enterToMainPage();
        mainPage.inputToUsername("selenide");
        mainPage.inputToPassword("123456!qA");
        mainPage.chooseDomain("bk.ru");
        EmailMainPage emailMainPage = mainPage.clickOnButtonLogin();
        emailMainPage.checkVisible();
    }

    @Test
    public void chainTest() {
        enterToMainPage()
                .inputToUsername("selenide@bk.ru")
                .inputToPassword("123456!qA")
                .chooseDomain("bk.ru")
                .clickOnButtonLogin()
                .checkVisible();
    }
}
