package test;

import baseTest.DFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends DFactory {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @BeforeMethod
    public void setup(){
        loginPage.login();
    }

    @Test
    public void testHome_1(){
        homePage.searchProductOnHome();
    }
    @Test
    public void testHome_2(){
        homePage.deleteProductOnHome();
    }
}
