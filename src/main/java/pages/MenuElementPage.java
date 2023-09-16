package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage {
    WebDriver driver;

    public MenuElementPage(WebDriver driver){
        this.driver = driver;
    }
    public void getElementCount(){
        List<WebElement> menuElements = driver.findElements(By.tagName("li"));
        System.out.println(menuElements.size());
    }
}
