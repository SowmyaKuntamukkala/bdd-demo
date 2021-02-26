package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductStepDef extends BddDemoApplicationTests{
    @Autowired
    private Product product;
    private int total;

    @Given("the price of {string} is {int}")
    public void the_price_of_banana_is(String product, Integer price) {
        this.product.givePrices(product,price);

    }
    @When("I check the {int} of {string}")
    public void i_check(Integer count,String string) {
        this.total = this.product.calculate(string, count);
    }
    @Then("the total price of {string} should be {int}")
    public void the_total_price_of_should_be(String product,Integer total) {
        Assert.assertEquals((int) total,this.total);
    }

}
