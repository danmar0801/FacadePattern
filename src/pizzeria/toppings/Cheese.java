package pizzeria.toppings;

import pizzeria.interfaces.ITopping;

public class Cheese implements ITopping {
    public int getAmountOnPizza() {
        return 10;
    }

    public double getCost() {
        return 0.25;
    }
}
