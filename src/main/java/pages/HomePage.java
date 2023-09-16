package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public ShiftingContentPage clickShiftingContent(){
        clickLink("Shifting Content");
        return new ShiftingContentPage (driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage (driver);
    }
    public HorizontalSliderPage clickHorisontalPage(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public FramePage clickFramePage(){
        clickLink("Frames");
        return new FramePage(driver);
    }
    public DynamicLoadinPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadinPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
