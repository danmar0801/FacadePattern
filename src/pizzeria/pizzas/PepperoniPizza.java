package pizzeria.pizzas;

import pizzeria.Pizza;
import pizzeria.toppings.Cheese;
import pizzeria.toppings.Pepperoni;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(int size) {
        super(size);
        addTopping(new Cheese());
        addTopping(new Pepperoni());
        addTopping(new Pepperoni());
    }
}
