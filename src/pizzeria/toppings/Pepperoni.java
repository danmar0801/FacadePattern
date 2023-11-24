package pizzeria.toppings;

import pizzeria.interfaces.ITopping;

public class Pepperoni implements ITopping {
    @Override
    public int getAmountOnPizza() {
        return 15;
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}