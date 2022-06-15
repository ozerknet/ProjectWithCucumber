package com.meetSky.step_definitions;


import com.meetSky.pages.GoogleSearchPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.Scanner;

public class GoogleSearchStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user go to google.com")
    public void user_go_to_google_com() {

        Driver.getDriver().get("https://www.google.com");
        googleSearchPage.IAggreeButton.click();
    }


    @Then("user entering search word")
    public void userEnteringSearchWord() {
        String str = "ozer";
        googleSearchPage.searchBox.sendKeys(""+str+"" + Keys.ENTER);


    }
}
