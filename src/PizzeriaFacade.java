package pizzeria;

import pizzeria.workers.DeliveryGuy;
import pizzeria.workers.OrderTaker;
import pizzeria.workers.Oven;
import pizzeria.interfaces.IOrder;
import pizzeria.pizzas.CheesePizza;
import pizzeria.pizzas.PepperoniPizza;

/**
 * Facade for the Pizzeria operations.
 */
public class PizzeriaFacade {

    private OrderTaker orderTaker;
    private Oven oven;
    private DeliveryGuy deliveryGuy;

    public PizzeriaFacade() {
        orderTaker = new OrderTaker();
        oven = new Oven();
        deliveryGuy = new DeliveryGuy();
    }

    /**
     * Facilitates the ordering of pizzas.
     *
     * @param amountOfPizzas the number of pizzas to order.
     * @param address the delivery address.
     */
    public void orderPizza(int amountOfPizzas, String address) {
        // Implementation of pizza order
        // For simplicity, alternate between Cheese and Pepperoni Pizzas
        Order order = new Order();
        for (int i = 0; i < amountOfPizzas; i++) {
            if (i % 2 == 0) {
                order.addPizza(new CheesePizza(2));
            } else {
                order.addPizza(new PepperoniPizza(2));
            }
        }

        // Simulate order processing
        orderTaker.startJob(order);
        oven.startJob(order);
        deliveryGuy.startJob(order);

        // Simulate order completion
        orderTaker.onJobEnd(order);
        oven.onJobEnd(order);
        deliveryGuy.onJobEnd(order);
    }
}

