package pizzeria;

import java.util.Random;
import pizzeria.interfaces.IPizza;
import pizzeria.toppings.Cheese;
import pizzeria.toppings.Pepperoni;

/**
 * Factory class for creating pizzas.
 */
public class PizzaFactory {

    private Random random;

    public PizzaFactory() {
        random = new Random();
    }

    /**
     * Generates a random pizza with random size and toppings.
     *
     * @return A randomly generated pizza.
     */
    public IPizza generateRandomPizza() {
        int size = random.nextInt(3) + 1; // Random size between 1 and 3
        IPizza pizza = new Pizza(size); // You can create more specific pizza types if needed

        // Randomly add toppings
        if (random.nextBoolean()) {
            pizza.addTopping(new Cheese());
        }
        if (random.nextBoolean()) {
            pizza.addTopping(new Pepperoni());
        }

        return pizza;
    }
}

