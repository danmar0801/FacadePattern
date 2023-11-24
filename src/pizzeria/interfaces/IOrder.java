package pizzeria.interfaces;

import java.util.List;

public interface IOrder {
    public void addPizza(IPizza newPizza);

    public List<IPizza> getOrderContents();

    public double getCost();

    public double getTimeToMake();
}
