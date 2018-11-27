package crediton.test.tests;

import crediton.test.core.BaseTest;
import crediton.test.core.pageobjects.ServicePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class ServicePageTest extends BaseTest {

    @Test
    public void checkServiceList() {
        ServicePage servicePage = page(ServicePage.class);
        servicePage.getServiceList();
        assertEquals(servicePage.checkSizeServiceList(), sizeService);
    }

    @Test
    public void checkChoiceService() {
        ServicePage servicePage = page(ServicePage.class);
        servicePage.choiceOfList();
        assertTrue(servicePage.getSeviceListPanel().isDisplayed());
    }
}
