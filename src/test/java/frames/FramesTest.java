package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    public void testFrameText() {
        var nestedFramesPage = homePage.clickFramePage().clickNestedFrames();
        assertEquals("Left frame text incorrect",nestedFramesPage.getLeftFrameText(), "LEFT");
        assertEquals("Bottom frame text incorrect" ,nestedFramesPage.getBottomFrameText(), "BOTTOM");
    }
}
