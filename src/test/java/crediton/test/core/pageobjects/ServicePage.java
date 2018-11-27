package crediton.test.core.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import crediton.test.core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicePage extends BaseTest {

    @FindBy(xpath = "//div[@class='service__list']/a")
    private ElementsCollection serviceList;

    @FindBy(className = "service__list")
    private SelenideElement seviceListPanel;

    public ElementsCollection getServiceList() {
        return serviceList;
    }

    public SelenideElement getSeviceListPanel() {
        return seviceListPanel;
    }

    public int checkSizeServiceList() {
        sleep(1000);
        int serviceListSize = serviceList.size();
        return serviceListSize;
    }

    public void choiceOfList() {
        sleep(1000);
        for (int i = 0; i < serviceList.size(); i++) {
            WebElement service = serviceList.get(i);
            service.click();
        }
    }
}
