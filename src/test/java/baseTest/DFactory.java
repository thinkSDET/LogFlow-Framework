package baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.TestLogger;

public class DFactory {



    public void initializeDriver(){
        BFactory.invokeBrowser();
        TestLogger.info("Driver has been initialize");
    }


    @BeforeMethod
    public void setDriver(){
        initializeDriver();
    }


    @AfterMethod
    public void tearDown(){
        TestLogger.info("Driver has been closed");
    }
}
