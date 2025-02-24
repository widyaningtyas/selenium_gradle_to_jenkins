package page;

import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    private final String loginBtn = "//a[@href='/login']";

    public void clickLoginBtn() {
        clickElement(loginBtn);
    }
}
