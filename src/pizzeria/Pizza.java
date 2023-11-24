package pizzeria;

import java.util.List;

import pizzeria.interfaces.IPizza;
import pizzeria.interfaces.ITopping;

public class Pizza implements IPizza {

    private int basePrice = 10;
    private int size;
    private List<ITopping> toppings;

    public Pizza(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public double getCost() {
        double pizzaPrice = basePrice * size;
        double toppingPrices = 0;
        for (ITopping t : toppings) {
            toppingPrices += t.getCost() * t.getAmountOnPizza();
        }
        return pizzaPrice + toppingPrices;
    }

    @Override
    public void addTopping(ITopping topping) {
        toppings.add(topping);
    }

    @Override
    public double getTimeToMake() {
        // TODO: Change this to something unique
        double pizzaPrice = basePrice * size;
        double toppingPrices = 0;
        for (ITopping t : toppings) {
            toppingPrices += t.getCost() * t.getAmountOnPizza();
        }
        return pizzaPrice + toppingPrices;
    }
}
