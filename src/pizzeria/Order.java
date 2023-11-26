package pizzeria;

import java.util.ArrayList;
import java.util.List;

import pizzeria.interfaces.IOrder;
import pizzeria.interfaces.IPizza;

public class Order implements IOrder {

    private List<IPizza> pizzas; // List to hold pizzas

    public Order() {
        this.pizzas = new ArrayList<>(); // Initialize the pizzas list
    }


    public void addPizza(IPizza newPizza) {
        pizzas.add(newPizza); // this should work without causing a NullPointerException
    }


    public List<IPizza> getOrderContents() {
        return pizzas;
    }


    public double getCost() {
        double cost = 0;
        for (IPizza p : pizzas) {
            cost += p.getCost();
        }
        return cost;
    }


    public double getTimeToMake() {
        double time = 0;
        for (IPizza p : pizzas) {
            time += p.getTimeToMake();
        }
        return time;
    }
}
