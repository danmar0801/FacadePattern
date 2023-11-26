package pizzeria;

import java.util.ArrayList;
import java.util.List;

import pizzeria.interfaces.IPizza;
import pizzeria.interfaces.ITopping;

public class Pizza implements IPizza {

    private int basePrice = 10;
    private int size;
    private List<ITopping> toppings; // List to hold toppings

    public Pizza(int size) {
        this.size = size;
        this.toppings = new ArrayList<>(); // Initialize the toppings list
    }


    public int getSize() {
        return size;
    }


    public double getCost() {
        double pizzaPrice = basePrice * size;
        double toppingPrices = 0;
        for (ITopping t : toppings) {
            toppingPrices += t.getCost() * t.getAmountOnPizza();
        }
        return pizzaPrice + toppingPrices;
    }


    public void addTopping(ITopping topping) {
        toppings.add(topping); // Now this should work without causing a NullPointerException
    }


    public double getTimeToMake() {
        double pizzaPrice = basePrice * size;
        double toppingPrices = 0;
        for (ITopping t : toppings) {
            toppingPrices += t.getCost() * t.getAmountOnPizza();
        }
        return pizzaPrice + toppingPrices;
    }
}
