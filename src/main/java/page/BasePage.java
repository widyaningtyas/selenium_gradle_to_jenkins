package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
    static WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        BasePage.webDriver = webDriver;
    }

    protected void clickElement(String element) {
        WebElement webElement = webDriver.findElement(By.xpath(element));
        assertElementIsDisplayed(element);
        webElement.click();
    }

    protected void inputTextToElement(String element, String textToInput) {
        WebElement webElement = webDriver.findElement(By.xpath(element));
        assertElementIsDisplayed(element);
        webElement.sendKeys(textToInput);
    }

    protected void selectDropdownByValue(String element, String valueToSelect) {
        WebElement webElement = webDriver.findElement(By.xpath(element));
        assertElementIsDisplayed(element);
        Select select = new Select(webElement);
        select.selectByVisibleText(valueToSelect);
    }

    protected void assertElementIsDisplayed(String element) {
        Assert.assertTrue(webDriver.findElement(By.xpath(element)).isDisplayed());
    }

    public void goToUrl(String url) {
        webDriver.get(url);
    }
}
