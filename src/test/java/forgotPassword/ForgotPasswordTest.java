package forgotPassword;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.ForgotPasswordPage;
import pages.InternalServerErrorPage;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testForgotPasswordError(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("ahdfk@gmail.com");
        InternalServerErrorPage internalServerErrorPage = forgotPasswordPage.clickRetrivePasswordButton();

    assertTrue(internalServerErrorPage.getErrorText().contains("Internal Server Error"), "Error message not the same");
    }
}
