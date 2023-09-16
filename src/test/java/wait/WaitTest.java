package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class WaitTest extends BaseTest {

    @Test
    public void testWaitUntillVisible(){
        var loadingpage = homePage.clickDynamicLoading().clickExample2();
        loadingpage.clickStart();
        assertEquals("Tesxt incorrect", loadingpage.getLoadedText(), "Hello World!");
    }

}
