package pizzeria;

import java.util.ArrayList;
import java.util.List;
import pizzeria.interfaces.IOrder;
import pizzeria.interfaces.IPizza;

/**
 * Represents an order in the pizzeria, consisting of multiple pizzas.
 */
public class Order implements IOrder {

    private List<IPizza> pizzas; // List to hold pizzas

    /**
     * Constructs a new Order with an empty list of pizzas.
     */
    public Order() {
        this.pizzas = new ArrayList<>(); // Initialize the pizzas list
    }

    /**
     * Adds a pizza to the order.
     *
     * @param newPizza The pizza to be added to the order.
     */
    public void addPizza(IPizza newPizza) {
        pizzas.add(newPizza);
    }

    /**
     * Retrieves the list of pizzas in the order.
     *
     * @return A list of pizzas in the order.
     */
    public List<IPizza> getOrderContents() {
        return pizzas;
    }

    /**
     * Calculates the total cost of the order by summing the cost of each pizza.
     *
     * @return The total cost of the order.
     */
    public double getCost() {
        double cost = 0;
        for (IPizza p : pizzas) {
            cost += p.getCost();
        }
        return cost;
    }

    /**
     * Calculates the total time required to make all pizzas in the order.
     *
     * @return The total time to make all pizzas in the order.
     */
    public double getTimeToMake() {
        double time = 0;
        for (IPizza p : pizzas) {
            time += p.getTimeToMake();
        }
        return time;
    }
}

