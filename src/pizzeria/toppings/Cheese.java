package pizzeria.toppings;

import pizzeria.interfaces.ITopping;

public class Cheese implements ITopping {
    @Override
    public int getAmountOnPizza() {
        return 10;
    }

    @Override
    public double getCost() {
        return 0.25;
    }
}
