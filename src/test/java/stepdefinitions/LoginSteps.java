package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.DashboardPage;
import page.LoginPage;

import java.util.Map;

public class LoginSteps {
    private WebDriver driver = CucumberHooks.getWebDriver();
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Given("user go to {string} page")
    public void step01(String url) {
        loginPage = new LoginPage(driver);
        loginPage.goToUrl("https://www." + url + ".com/");
    }

    @When("user click on login button")
    public void step02() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickLoginBtn();
    }

    @Then("user do sign up")
    public void step03(DataTable dataTable) {
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

        loginPage.doSignUp(dataMap.get("name"), dataMap.get("email"));
    }
}
