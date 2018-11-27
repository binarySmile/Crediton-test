package crediton.test.core.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import crediton.test.core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends BaseTest {

    @FindBy(xpath = "//div/navbar-menu/ul/li")
    private ElementsCollection menuNavigationList;

    @FindBy(xpath = "//div/navbar-menu/ul")
    private SelenideElement menuPanel;

    public ElementsCollection getMenuNavigationList() {
        return menuNavigationList;
    }

    public SelenideElement getMenuPanel() {
        return menuPanel;
    }

    public void choiceOfList() {
        sleep(1000);
        for (int i = 0; i < menuNavigationList.size(); i++) {
            WebElement navigationLink = menuNavigationList.get(i);
            navigationLink.click();
        }
    }
}
