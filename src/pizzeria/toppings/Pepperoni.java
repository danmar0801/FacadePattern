package pizzeria.toppings;

import pizzeria.interfaces.ITopping;

public class Pepperoni implements ITopping {
    public int getAmountOnPizza() {
        return 15;
    }

    public double getCost() {
        return 0.5;
    }
}