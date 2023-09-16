package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadinPage {
    private WebDriver driver;
    private By link_Example2 = By.partialLinkText("Example 2");
    private WebElement example2_link;

    public DynamicLoadinPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);

    }

    public DynamicLoadingExample2Page rightClickExample2() {
        example2_link = driver.findElement(By.partialLinkText("Example 2"));
        Actions action = new Actions(driver);
        action.contextClick(example2_link).sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        return new DynamicLoadingExample2Page(driver);

    }
}
