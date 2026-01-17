package rahulshettyacademy.ios.ui_catalog_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademy.base.IOSBaseTest;
import rahulshettyacademy.page_objects.ios.AlertViewsPage;

public class UICatalogTest  extends IOSBaseTest {

    @Test
    public void uiCatalogTest(){

        String message = "Test Message";

        AlertViewsPage alertViewsPage = homePage.clickAlertViewsMenu();
        alertViewsPage.clickTextEntry();
        alertViewsPage.fillMessageField(message);
        alertViewsPage.clickOkButton();
        alertViewsPage.clickConfirmCancel();
        Assert.assertEquals(alertViewsPage.getConfirmCancelText(),"A message should be a short, complete sentence.");
        alertViewsPage.clickConfirmButton();


    }

}
