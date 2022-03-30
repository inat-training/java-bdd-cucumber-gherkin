package com.solutions.inat.bdd;

import com.solutions.inat.bdd.calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDefinitions {

    Calculator calculator;
    int result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(int a, int b) {
        result = calculator.add(a, b);
    }

    @Then("I should get {int}")
    public void i_should_get(int expectedResult) {
        assertThat(result).isEqualTo(expectedResult);
    }
}
