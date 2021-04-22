package tests;

import data.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegisterationPage;

import java.io.IOException;

public class RegisterFacebook extends TestBase {

    RegisterationPage RegisterObject;


    @DataProvider(name = "ExcelData")
    public Object[][] userRegisterData() throws IOException {

        ExcelReader ER = new ExcelReader();
        return ER.getExcelData();
    }

    @Test(priority = 2, alwaysRun = true, dataProvider = "ExcelData")
    public void UserCanRegisterSuccssfully(String firstname, String surname, String email, String password) throws InterruptedException {
        RegisterObject = new RegisterationPage(driver);
        RegisterObject.UserRegisteration(firstname, surname, email, password);
        Thread.sleep(30000);

       // Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/confirmemail.php?next=https%3A%2F%2Fwww.facebook.com%2F&rd&__req=h");
    }
}


