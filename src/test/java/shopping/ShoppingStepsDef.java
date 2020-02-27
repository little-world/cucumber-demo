package shopping;

import io.cucumber.java8.En;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingStepsDef implements En {

    private int budget = 0;

    public ShoppingStepsDef() {
        Given("I have {int} in my wallet", (Integer money) -> budget = money);

        When("I buy (.*) with {int}", (Integer price) -> budget -= price);

        Then("I should have {int} in my wallet", (Integer finalBudget) ->
                assertEquals(budget, finalBudget.intValue()));
    }
}
