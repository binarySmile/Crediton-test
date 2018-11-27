package crediton.test.tests;

import crediton.test.core.BaseTest;
import crediton.test.core.pageobjects.NavigationPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertTrue;

public class NavigationPageTest extends BaseTest {

    @Test
    public void checkChoiceMenu() {
        NavigationPage navigationPage = page(NavigationPage.class);
        navigationPage.choiceOfList();
        assertTrue(navigationPage.getMenuPanel().isDisplayed());
    }
}
