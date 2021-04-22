package tests;

import data.ExcelReaderLogin;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Logout;

import java.io.IOException;


public class LoginFacebook extends TestBase {
    LoginPage LoginObject;
    Logout logoutObject;


    @DataProvider(name="ExcelData")
    public Object[][] UserLoginData() throws IOException
    {

        ExcelReaderLogin ER = new ExcelReaderLogin();
        return ER.getExcelData();
    }

   @Test(priority=1,alwaysRun=true,dataProvider="ExcelData")
    public void UserCanLogin(String email,String password) throws InterruptedException {
        LoginObject = new LoginPage(driver);
        LoginObject.UserLogin(email,password) ;
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/?sk=welcome");
        logoutObject=new Logout(driver);
        logoutObject.Userlogout(driver);
    }



}
