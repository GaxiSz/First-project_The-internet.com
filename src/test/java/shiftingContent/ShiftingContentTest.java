package shiftingContent;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.MenuElementPage;
import pages.ShiftingContentPage;

public class ShiftingContentTest extends BaseTest {

    @Test
    public void testShiftingContentCount(){
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContent();
        MenuElementPage menuElementPage = shiftingContentPage.clickExample1Field();
        menuElementPage.getElementCount();

    }
}
