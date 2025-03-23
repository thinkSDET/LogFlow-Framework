package test;

import baseTest.DFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class CartTest extends DFactory {
    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();
    @BeforeMethod
    public void setup(){
    loginPage.login();
    }

    @Test
    public void testCart_1_searchProductOnCart(){
    cartPage.searchProductOnCart();
    }
    @Test
    public void testCart_2_deleteProductOnCart(){
        cartPage.deleteProductOnCart();
    }
}
