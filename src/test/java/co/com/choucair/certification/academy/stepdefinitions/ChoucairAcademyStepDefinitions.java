package co.com.choucair.certification.academy.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Leonardo wants to learn automation at the academy Choucair$")
    public void thanLeonardoWantsToLearnAutomationAtTheAcademyChoucair() {

    }

    @When("^he search for the course Metodología Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseMetodologíaBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called resourses Metodología Bancolombia$")
    public void heFindsTheCourseCalledResoursesMetodologíaBancolombia() {

    }
}
