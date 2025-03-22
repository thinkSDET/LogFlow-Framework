package test;

import baseTest.DFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends DFactory {

    LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void setup(){

    }

    @Test
    public void loginTest(){
        loginPage.login();
    }
}
