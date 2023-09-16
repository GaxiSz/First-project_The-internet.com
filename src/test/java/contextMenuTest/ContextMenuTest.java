package contextMenuTest;

import base.BaseTest;
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testRightClickOnBox(){
        var contextMenu =homePage.clickContextMenuPage();
        contextMenu.rightClickOnBox();
        String message = contextMenu.getPopUpText();
        contextMenu.acceptPopUp();
        assertEquals("Text Incorrect",message,"You selected a context menu");
    }
}
