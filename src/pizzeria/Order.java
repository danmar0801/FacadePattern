package pizzeria;

import java.util.List;

import pizzeria.interfaces.IOrder;
import pizzeria.interfaces.IPizza;

public class Order implements IOrder {

    private List<IPizza> pizzas;

    @Override
    public void addPizza(IPizza newPizza) {
        pizzas.add(newPizza);
    }

    @Override
    public List<IPizza> getOrderContents() {
        return pizzas;
    }

    @Override
    public double getCost() {
        double cost = 0;
        for (IPizza p : pizzas) {
            cost += p.getCost();
        }
        return cost;
    }

    @Override
    public double getTimeToMake() {
        double time = 0;
        for (IPizza p : pizzas) {
            time += p.getTimeToMake();
        }
        return time;
    }
}
