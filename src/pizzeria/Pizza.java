package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pizzeria.interfaces.IPizza;
import pizzeria.interfaces.ITopping;

/**
 * Represents a pizza with a specified size and toppings.
 */
public class Pizza implements IPizza {

    private int basePrice = 10; // Base price of the pizza
    private int size; // Size of the pizza
    private List<ITopping> toppings; // List to hold toppings

    /**
     * Creates a new Pizza with the specified size.
     *
     * @param size The size of the pizza.
     */
    public Pizza(int size) {
        this.size = size;
        this.toppings = new ArrayList<>(); // Initialize the toppings list
    }


    public int getSize() {
        return size;
    }

    /**
     * Calculates the total cost of the pizza, including base price and toppings.
     *
     * @return The total cost of the pizza.
     */
    public double getCost() {
        double pizzaPrice = basePrice * size;
        double toppingPrices = 0;
        for (ITopping t : toppings) {
            toppingPrices += t.getCost() * t.getAmountOnPizza();
        }
        return pizzaPrice + toppingPrices;
    }

    /**
     * Adds a topping to the pizza.
     *
     * @param topping The topping to add to the pizza.
     */
    public void addTopping(ITopping topping) {
        toppings.add(topping);
    }

    /**
     * Calculates the time required to make the pizza.
     * Currently, this method uses the same logic as getCost,
     * but it can be modified to reflect time-specific calculations.
     *
     * @return The time required to make the pizza.
     */
    public double getTimeToMake() {
        double pizzaPrice = basePrice * size;
        double toppingPrices = 0;
        for (ITopping t : toppings) {
            toppingPrices += t.getCost() * t.getAmountOnPizza();
        }
        return pizzaPrice + toppingPrices;
    }

    public String getToppingsDescription() {
        if (toppings.isEmpty()) {
            return "No toppings";
        }
        return toppings.stream()
                .map(topping -> topping.getClass().getSimpleName())
                .collect(Collectors.joining(", "));
    }
}
