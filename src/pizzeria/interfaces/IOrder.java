package pizzeria.interfaces;

import java.util.List;

public interface IOrder {
    void addPizza(IPizza newPizza);

    List<IPizza> getOrderContents();

    double getCost();

    double getTimeToMake();
}
