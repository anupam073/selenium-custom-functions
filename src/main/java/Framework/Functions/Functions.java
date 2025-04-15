package Framework.Functions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Functions {
    private WebDriver driver;
    private Actions actions;

    public Functions(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    
    public void browseurl(String element) {
    	driver.get(element);
    }
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void actionClick(WebElement element) {
        actions.moveToElement(element).click().perform();
    }

    public void hoverOverElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void doubleClick(WebElement element) {
        actions.doubleClick(element).perform();
    }

    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }

    public void dragAndDrop(WebElement source, WebElement target) {
        actions.dragAndDrop(source, target).perform();
    }

    public void clickAndHold(WebElement element) {
        actions.clickAndHold(element).perform();
    }

    public void releaseElement(WebElement element) {
        actions.release(element).perform();
    }

    public void sendKeysToElement(WebElement element, String keys) {
        actions.moveToElement(element).click().sendKeys(keys).perform();
    }

    public void scrollByPixel(int x, int y) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    public void scrollDownSmooth() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
}
