package pizzeria.pizzas;

import pizzeria.Pizza;
import pizzeria.toppings.Cheese;

public class CheesePizza extends Pizza {
    public CheesePizza(int size) {
        super(size);
        addTopping(new Cheese());
        addTopping(new Cheese());
    }
}
