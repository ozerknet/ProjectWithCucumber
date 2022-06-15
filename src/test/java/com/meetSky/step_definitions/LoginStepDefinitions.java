package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @When("user open the login page")
    public void userOpenTheLoginPage() {
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login?clear=1");
    }

    @When("user enters username")
    public void user_enters_username() {
        loginPage.userName.sendKeys("Employee83" + Keys.ENTER);
    }

    @When("user enters password and click login button")
    public void user_enters_password() {
        loginPage.passWord.sendKeys("Employee123");
        loginPage.submitFormButton.click();
    }


}
