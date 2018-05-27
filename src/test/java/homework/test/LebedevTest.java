package homework.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static homework.pages.MainPage.enterToMainPage;

public class LebedevTest {

    @BeforeTest
    public void before(){
        Configuration.browser = "chrome";
    }

    @Test
    public void chainTest(){
        enterToMainPage()
                .chooseToolFromMenu()
                .toolPageHeaderIsCorrect()
                .goToIdeaMatrixFromToolPage()
                .ideaMatrixPageHeaderIsCorrect()
                .search("императрица")
                .checkResultsAreVisible()
                .checkNumberOfResultColumns(2);
    }
}
