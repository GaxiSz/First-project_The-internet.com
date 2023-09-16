package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By example1Field = By.linkText("Example 1: Menu Element");

    public ShiftingContentPage (WebDriver driver){
        this.driver = driver;
    }
 public  MenuElementPage clickExample1Field(){
    driver.findElement(example1Field).click();
    return new MenuElementPage(driver);
 }
}
