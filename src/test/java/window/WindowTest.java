package window;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowTest extends BaseTest {
    @Test
    public void testNewTab(){
       var buttonPage = homePage.clickDynamicLoading().rightClickExample2();
       getWindowManager().switchToNewTab();
       assertTrue(buttonPage.isButtonDisplayed(), "Start button is not desplayed");

    }
}
