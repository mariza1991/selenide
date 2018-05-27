package google.com.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import google.com.pages.ResultPage;
import google.com.pages.SearchPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SearchTest {

    @BeforeTest
    public void before(){
        Configuration.browser = "firefox";
    }

    @Test
    public void searchTest(){
        SearchPage searchPage = new SearchPage();
        searchPage.goToMainPage();
        ResultPage resultPage = searchPage.search("selenide");
        resultPage.pageIsLoaded();
        resultPage.numberOfResults(10);
        resultPage.firstStringContains("selenide");
    }
}
