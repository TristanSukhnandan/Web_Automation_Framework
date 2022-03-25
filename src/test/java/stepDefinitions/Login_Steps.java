package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login_Steps extends Base_PO {
    //private WebDriver driver = getDriver();

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po){
        this.login_po = login_po;

    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        //navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
        login_po.navigateTo_WebDriverUniversity_Login_Page();
    }

   @When("I enter a username {}")
    public void i_enter_a_username(String username) {
        //driver.findElement(By.id("text")).sendKeys(username);
        //sendKeys(By.id("text"),username);
       login_po.setUsername(username);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        //driver.findElement(By.id("password")).sendKeys(password);
        login_po.setPassword(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        //driver.findElement(By.id("login-button")).click();
        login_po.clickLoginButton();
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        //String login_Message = driver.switchTo().alert().getText();
        //Assert.assertEquals(login_Message,"validation succeeded");
        login_po.validate_SuccessfulLogin_Message();

    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        //String login_Message = driver.switchTo().alert().getText();
        //Assert.assertEquals(login_Message,"validation failed");
        login_po.validate_UnsuccessfulLogin_Message();
    }

    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String message) {
        //String login_Message = driver.switchTo().alert().getText();
        //Assert.assertEquals(login_Message,message);
        waitForAlert_And_ValidateText(message);
    }
}
