import pizzeria.workers.DeliveryGuy;
import pizzeria.workers.OrderTaker;
import pizzeria.workers.Oven;
import pizzeria.Order;
import pizzeria.Pizza;
import pizzeria.PizzaFactory;
import pizzeria.interfaces.IPizza;

/**
 * Facade for the Pizzeria operations.
 */
public class PizzeriaFacade {

    private OrderTaker orderTaker;
    private Oven oven;
    private DeliveryGuy deliveryGuy;
    private PizzaFactory pizzaFactory;

    public PizzeriaFacade() {
        orderTaker = new OrderTaker();
        oven = new Oven();
        deliveryGuy = new DeliveryGuy();
        pizzaFactory = new PizzaFactory();
    }

    /**
     * Facilitates the ordering of pizzas.
     *
     * @param amountOfPizzas the number of pizzas to order.
     * @param address        the delivery address.
     */
    public void orderPizza(int amountOfPizzas, String address) {
        Order order = new Order();
        System.out.println("Your Order:");
        for (int i = 0; i < amountOfPizzas; i++) {
            IPizza pizza = pizzaFactory.generateRandomPizza();
            order.addPizza(pizza);
            System.out.println("Random Pizza ordered: " + pizza.getClass().getSimpleName() + " " + (i + 1)
                    + ", Size: " + pizza.getSize()
                    + ", Toppings: " + ((Pizza) pizza).getToppingsDescription()
                    + ", Cost: $" + pizza.getCost()
                    + ", Time to make: " + pizza.getTimeToMake() + " mins");
        }

        System.out.println();

        // Process the order
        orderTaker.startJob(order);
        orderTaker.onJobEnd(order);

        // Cook Pizzas
        oven.startJob(order);
        oven.onJobEnd(order);

        // Deliver the order
        deliveryGuy.startJob(order);
        deliveryGuy.onJobEnd(order);

        System.out.println();

        // Printing order summary
        System.out.println("Total Order Cost: $" + order.getCost());
        System.out.println("Total Time to Make Order: " + order.getTimeToMake() + " mins");
    }
}
