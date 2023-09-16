package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("finish");
    private By link_Example2 = By.partialLinkText("Example 2");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadingIndicator));
    }
    public String getLoadedText(){
        return driver.findElement(loadingIndicator).getText();
    }

    public  boolean isButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(startButton));
        return button.isDisplayed();
    }

}
