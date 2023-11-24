import pizzeria.Order;
import pizzeria.Pizza;
import pizzeria.pizzas.CheesePizza;
import pizzeria.pizzas.PepperoniPizza;
import pizzeria.workers.DeliveryGuy;
import pizzeria.workers.OrderTaker;
import pizzeria.workers.Oven;

public class Pizzeria {

    private OrderTaker orderTaker;
    private Oven oven;
    private DeliveryGuy deliveryGuy;

    public Pizzeria() {
        orderTaker = new OrderTaker();
        oven = new Oven();
        deliveryGuy = new DeliveryGuy();
    }

    public void orderPizza(int amountOfPizzas, String address) {
        // generate some amount of varying kinds of pizzas (this I'm not sure of)
        // EXAMPLE: Change later, make the size its own class IDK
        Pizza pizza1 = new PepperoniPizza(2);
        Pizza pizza2 = new CheesePizza(2);

        // generate an order based on pizzas
        Order order = new Order();
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        // send order to ordertaker (to do something IDK)
        orderTaker.startJob(order);
        orderTaker.onJobEnd(order);

        // order taker will pass order along to oven
        // oven will determine how long it takes to make pizzas
        oven.startJob(order);
        oven.onJobEnd(order);

        // oven will pass order over to delivery guy
        // delivery guy will determine cost of entire order
        deliveryGuy.startJob(order);
        deliveryGuy.onJobEnd(order);

        // delivery done
    }
}
