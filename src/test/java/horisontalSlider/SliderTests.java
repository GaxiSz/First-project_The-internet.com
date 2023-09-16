package horisontalSlider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static junit.framework.Assert.assertEquals;

public class SliderTests extends BaseTest {

    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        var horizontalSliderPage = homePage.clickHorisontalPage();
        horizontalSliderPage.setSliderValue(value);
        assertEquals("Slider value is incorrect", horizontalSliderPage.getSliderValue(), value );

    }
    }
