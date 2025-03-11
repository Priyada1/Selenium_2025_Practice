package selenium_framework.page_object_model.test_classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.example.base.BaseClass;
import org.example.page_object.ToolQALoginPage;
import org.example.utilities.ReadConfig;

public class ToolQALoginPageTest extends BaseClass {

String userName;
String password;
    @BeforeClass
    public void setUPClass() {

        ReadConfig readConfig = new ReadConfig();
        userName = readConfig.getUserName();
        password = readConfig.getPassword();
        setup();

        driver.get("https://demoqa.com/login");
    }

    @Test
    public void loginTest() {

        ToolQALoginPage loginPage = new ToolQALoginPage(driver);
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
        loginPage.clickLoginBtn();

    }




    @AfterClass
    public void tearDownClass() {
        tearDown();
    }
}
